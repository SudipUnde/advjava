package rest_api.repo;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import rest_api.bean.Restaurant;
import rest_api.store.RestaurantStore;

//This class handles connectivity with RestaurantStore
@Repository //Marks this class as a Repository
public class RestaurantRepository {
	public  Collection<Restaurant> getAllRestaurants(){
		Collection<Restaurant> allAvailableRestaurants = 	RestaurantStore.getAllRestaurants();
		return allAvailableRestaurants;
	}
	
	public Restaurant getOneRestaurant(Integer id) {
		Restaurant rst = 	RestaurantStore.getOneRestaurant(id);
		return rst;
	}
	
	public void createNewRestaunt(Restaurant rst) {
		RestaurantStore.createNewRestaunt(rst);
	}

}
