package rest_api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rest_api.bean.Restaurant;
import rest_api.service.RestaurantService;

@RestController
public class RestaurantController {
	@Autowired
	private RestaurantService restaurantService;
	//Creating End Points
	
	//GET all restaurants
	@GetMapping("/restaurant-api")
	public  Collection<Restaurant> getAllRestaurants(){
		Collection<Restaurant> allAvailableRestaurants = 	restaurantService.getAllRestaurants();
		return allAvailableRestaurants;
	}
		
	//GET one restaurant against ID
	@GetMapping("/restaurant-api/{rest_id}")
	public Restaurant getOneRestaurant(@PathVariable("rest_id") Integer id) {
		Restaurant rst = restaurantService.getOneRestaurant(id);
		return rst;
	}
	// POST new restaurant
	@PostMapping("/restaurant-api")
	public void addNewRestaurant(@RequestBody Restaurant newRestaurant) {
		//@RequestBody allows to get the JSON from body of the HTTP Request
		System.out.println("Adding new restaurant ---> " + newRestaurant);
		restaurantService.createNewRestaunt(newRestaurant);
	}
}









