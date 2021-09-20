package com.htcbookingservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.htc.bookingservice.entity.BookingService;
import com.htc.bookingservice.persistance.IBookingService;

@RestController
@RequestMapping("/api")
public class BookingServiceController {

	@Autowired
	IBookingService repo;
	
	
	@PostMapping("/users")
	BookingService createPatientdetails(@RequestBody BookingService bookingService)
	{
		return repo.save(bookingService);
		
	}
	@GetMapping("/bookinservices")
	  public List<BookingService> getAllBookingServicedetails() {
	   
	    List<BookingService> list = new ArrayList<>();
	    Iterable<BookingService> users = repo.findAll();
	 
	    users.forEach(list::add);
	    return list;
	  }
	
	@GetMapping("/BookingServiceId/{centreId}")
	BookingService getBookingServicebyId(@PathVariable Long centreId)
	{
		BookingService bookingService=null;
		bookingService=repo.getById(centreId).get();
		return bookingService;
		
	}
}
