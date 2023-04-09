/**
 * 
 */
package entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

/**
 * @author SAMSUNG
 *
 */
@Entity
@Table (name="shipper")
public class Shipper {
     private int id;
     private String Source;
     private String Destination;
     private String TruckType;
     private double Weight;
     private String Comments;
	/**
	 * @param id
	 * @param source
	 * @param destination
	 * @param trucType
	 * @param weight
	 * @param comments
	 */
	public Shipper(int id, String source, String destination, String truckType, double weight, String comments) {
		this.id = id;
		Source = source;
		Destination = destination;
		TruckType = truckType;
		Weight = weight;
		Comments = comments;
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
	 * @return the truckType
	 */
	@Column(name = "TruckType", nullable = false)
	public String getTruckType() {
		return TruckType;
	}
	/**
	 * @param trucType the truckType to set
	 */
	public void setTrucType(String truckType) {
		TruckType = truckType;
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
	 * @return the comments
	 */
	@Column(name = "Comments", nullable = false)
	public String getComments() {
		return Comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		Comments = comments;
	}
     
}
