package rest_api.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rest_api.bean.Restaurant;
import rest_api.repo.RestaurantNewRepository;
import rest_api.repo.RestaurantRepository;

@Service //Marks this class as a Service
public class RestaurantService {	
	
	@Autowired
	private RestaurantNewRepository restaurantRepository;
	public  Collection<Restaurant> getAllRestaurants(){
		//Collection<Restaurant> allAvailableRestaurants = 	restaurantRepository.getAllRestaurants();
		Collection<Restaurant> allAvailableRestaurants = restaurantRepository.findAll();
		return allAvailableRestaurants;
	}
	
	public Restaurant getOneRestaurant(Integer id) {
		//Restaurant rst = 	restaurantRepository.getOneRestaurant(id);
		Optional<Restaurant> restOption = restaurantRepository.findById(id);
		Restaurant rst = restOption.get();
		return rst;
	}
	
	public void createNewRestaunt(Restaurant rst) {
		//restaurantRepository.createNewRestaunt(rst);
		restaurantRepository.save(rst);
	}

}
