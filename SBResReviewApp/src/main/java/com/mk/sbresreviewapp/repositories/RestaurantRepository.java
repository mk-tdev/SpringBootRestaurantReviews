package com.mk.sbresreviewapp.repositories;

import com.mk.sbresreviewapp.domain.entities.Restaurant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends ElasticsearchRepository<Restaurant, String> {
    // Custom queries

    
}
