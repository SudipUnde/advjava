package example.spring.rest.controller;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.bean.Restaurant;

@RestController //Marks this class as a REST API specific controller
public class SpringRestController {
	//This class is meant for building REST APIs
	
	//Creating REST end point that returns some message
	@RequestMapping("/hello-world")
	public String helloWorld() {
		return "Hello Everyone !! from Spring REST";
	}
	
	//Creating REST end point that returns Restaurant object
	@RequestMapping("/restaurant")
	public Restaurant getOneRestaurant() {
		Restaurant rst = new Restaurant(243, "Rangla Punjab", "Punjabi", 5);
		return rst;
	}
	
	//Creating REST end point that returns multiple Restaurant objects
	@RequestMapping("/restaurants")
	public Collection<Restaurant> getAllRestaurants(){
		Restaurant rst = new Restaurant(243, "Rangla Punjab", "Punjabi", 5);
		Restaurant rst2 = new Restaurant(111, "Nara", "Thai", 3);
		Restaurant rst3 = new Restaurant(323, "Subway", "American", 2);
		Collection<Restaurant> allRestaurants = Arrays.asList(rst, rst2, rst3);
		return allRestaurants;
	}

}











