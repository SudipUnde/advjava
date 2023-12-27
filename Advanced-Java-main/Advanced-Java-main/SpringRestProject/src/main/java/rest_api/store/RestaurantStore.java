package rest_api.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import rest_api.bean.Restaurant;
//This class maintains Restaurant data in the form of In-Memory Structure: Map
public class RestaurantStore {
	private static Map<Integer, Restaurant> allRestaurants;
	static {
		allRestaurants = new HashMap<Integer, Restaurant>();
		Restaurant rst = new Restaurant(243, "Rangla Punjab", "Punjabi", 5);
		Restaurant rst2 = new Restaurant(111, "Nara", "Thai", 3);
		Restaurant rst3 = new Restaurant(323, "Subway", "American", 2);
		allRestaurants.put(rst.getRestaurantId(), rst);
		allRestaurants.put(rst2.getRestaurantId(), rst2);
		allRestaurants.put(rst3.getRestaurantId(), rst3);		
	}
	//Method to get all restaurants
	public static Collection<Restaurant> getAllRestaurants(){
		Collection<Restaurant> allAvailableRestaurants = allRestaurants.values();
		return allAvailableRestaurants;
	}
	
	//Method to get one restaurant against ID
	public static Restaurant getOneRestaurant(Integer id) {
		Restaurant rst = allRestaurants.get(id);
		return rst;
	}
	
	//Method to create new restaurant
	public static void createNewRestaunt(Restaurant rst) {
		allRestaurants.put(rst.getRestaurantId(), rst);
	}

}










