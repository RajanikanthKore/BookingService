package com.htc.bookingservice.persistance;
import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.bookingservice.entity.BookingService;



public interface IBookingService extends JpaRepository<BookingService, Long> {

}
