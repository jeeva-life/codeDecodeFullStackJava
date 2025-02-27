package com.codedecode.restaurantlisting.repo;

import com.codedecode.restaurantlisting.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranrRepo extends JpaRepository<Restaurant, Integer> {
}
