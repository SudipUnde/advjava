package day7.beans;

public class RestaurantNameAndBranches {
	//This class is used to hold name and branch count of Restaurant
	private String restaurantName;
	private int restaurantBranchCount;

	public RestaurantNameAndBranches() {
		// TODO Auto-generated constructor stub
	}

	public RestaurantNameAndBranches(String restaurantName, int restaurantBranchCount) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantBranchCount = restaurantBranchCount;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public int getRestaurantBranchCount() {
		return restaurantBranchCount;
	}

	public void setRestaurantBranchCount(int restaurantBranchCount) {
		this.restaurantBranchCount = restaurantBranchCount;
	}

	@Override
	public String toString() {
		return "RestaurantNameAndBranches [restaurantName=" + restaurantName + ", restaurantBranchCount="
				+ restaurantBranchCount + "]";
	}
	

}
