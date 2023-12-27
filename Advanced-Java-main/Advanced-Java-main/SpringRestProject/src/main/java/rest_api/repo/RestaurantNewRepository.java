package rest_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rest_api.bean.Restaurant;
//@Repository //This is not required because 'JpaRepository' is already a managed component
//Therefore its sub interface (RestaurantNewRepository) is also a managed component.
public interface RestaurantNewRepository extends JpaRepository<Restaurant, Integer> {
	
}