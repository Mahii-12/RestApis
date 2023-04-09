/**
 * 
 */
package entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author SAMSUNG
 *
 */
@Entity
@Table(name="customer")
public class Customer {
     
      private int id;
      private String Name;
      private String Source;
      private String Destination;
      private double Weight;
      private double PhoneNumber;
      private double Amount;
      private int Date;
	/**
	 * @param id
	 * @param name
	 * @param source
	 * @param destination
	 * @param weight
	 * @param phoneNumber
	 * @param amount
	 */
	public Customer(int id, String name, String source, String destination, double weight, double phoneNumber,
			double amount,int date) {
		this.id = id;
		Name = name;
		Source = source;
		Destination = destination;
		Weight = weight;
		PhoneNumber = phoneNumber;
		Amount = amount;
		Date = date;
	}
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	@Column(name = "Name", nullable = false)
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the source
	 */
	@Column(name = "Source", nullable = false)
	public String getSource() {
		return Source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		Source = source;
	}
	/**
	 * @return the destination
	 */
	@Column(name = "Destination", nullable = false)
	public String getDestination() {
		return Destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		Destination = destination;
	}
	/**
	 * @return the weight
	 */
	@Column(name = "Weight", nullable = false)
	public double getWeight() {
		return Weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		Weight = weight;
	}
	/**
	 * @return the phoneNumber
	 */
	@Column(name = "PhoneNumber", nullable = false)
	public double getPhoneNumber() {
		return PhoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(double phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	/**
	 * @return the amount
	 */
	@Column(name = "Amount", nullable = false)
	public double getAmount() {
		return Amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		Amount = amount;
	}
	/**
	 * @return the date
	 */
	
	public int getDate() {
		return Date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(int date) {
		Date = date;
	}
      
      
      
}
