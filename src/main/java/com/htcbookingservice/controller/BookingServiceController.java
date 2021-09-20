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
	private com.htc.bookingservice.persistance.IBookingService ibookingService;
	
	@GetMapping("/bookingService/{bookingId}") 
	public BookingService getBookingServiceById(@PathVariable Long bookingId) {
		BookingService bookingService =null;
	
		bookingService=ibookingService.findById(bookingId).get();
		return bookingService;
	
	}
	@PostMapping("/addBookingDetails") 
	public BookingService createDetails(@RequestBody BookingService bookingservice) {
		   
		 return ibookingService.save(bookingservice);
		 
	}
}
