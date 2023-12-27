package day7.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Marks this class as an Entity
@Table(name = "new_restaurant_master")//Maps this Entity class with the relevant table
public class Restaurant {
	@Id //Marks this field as an identity
	@Column(name = "restaurant_id")
	private int restaurantId;
	@Column(name = "restaurant_name", length = 25)
	private String name;
	@Column(name = "restaurant_cuisine", length = 25)
	private String cuisine;
	@Column(name = "restaurant_branch_count")
	private int branchCount;
	public Restaurant() {
		System.out.println("Inside Restaurant()");
	}
	public Restaurant(int restaurantId, String name, String cuisine, int branchCount) {
		this.restaurantId = restaurantId;
		this.name = name;
		this.cuisine = cuisine;
		this.branchCount = branchCount;
	}
	
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public int getBranchCount() {
		return branchCount;
	}
	public void setBranchCount(int branchCount) {
		this.branchCount = branchCount;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", cuisine=" + cuisine + ", branchCount="
				+ branchCount + "]";
	}
}
