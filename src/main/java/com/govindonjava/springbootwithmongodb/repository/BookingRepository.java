package com.govindonjava.springbootwithmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.govindonjava.springbootwithmongodb.models.Booking;

@Transactional
public interface BookingRepository extends MongoRepository<Booking, String>{
		/**
	    * This method will find an Boooking instance in the database by its departure.
	    * Note that this method is not implemented and its working code will be
	    * automatically generated from its signature by Spring Data JPA.
	    */
	   public Booking findByDeparture(String departure);

}
