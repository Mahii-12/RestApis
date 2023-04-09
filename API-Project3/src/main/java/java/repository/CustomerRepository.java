/**
 * 
 */
package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Customer;

/**
 * @author SAMSUNG
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	Optional<Customer> findById(Integer customerId);

}
