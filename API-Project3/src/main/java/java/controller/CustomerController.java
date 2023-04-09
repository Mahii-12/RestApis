/**
 * 
 */
package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Customer;
import repository.CustomerRepository;

/**
 * @author SAMSUNG
 *
 */
@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getUserById(
			@PathVariable(value = "id") Integer customerId) {
		Customer customer = customerRepository.findById(customerId)
        .orElseThrow();
		return ResponseEntity.ok().body(customer);
	}
	
	@PostMapping("/customers")
	public Customer createCustomer(@Validated @RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	@PutMapping("/customers/{id}")
	public ResponseEntity<Customer> updateCustomer(
			@PathVariable(value = "id") Integer customerId,
			@Validated @RequestBody Customer customerDetails)  {
		Customer customer = customerRepository.findById(customerId)
		        .orElseThrow();
		
		customer.setId(customerDetails.getId());
		customer.setName(customerDetails.getName());
		customer.setPhoneNumber(customerDetails.getPhoneNumber());
		
		@SuppressWarnings("unused")
		final Customer updatedUser = customerRepository.save(customer);
		return ResponseEntity.ok(customer);
	}
	
	@DeleteMapping("/customers/{id}")
	public Map<String, Boolean> deleteUser(
			@PathVariable(value = "id") Integer customerId)  {
		Customer customer = customerRepository.findById(customerId)
		        .orElseThrow();

		customerRepository.delete(customer);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
}
