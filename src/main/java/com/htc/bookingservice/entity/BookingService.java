package com.htc.bookingservice.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookingservice")
public class BookingService {

	@Id	
	private Long userName;	
	private Long bookingserviceId;
	private LocalDate bookingserviceDate;
	private Long centreId;

	public BookingService() {
		// TODO Auto-generated constructor stub
	}

	public BookingService(Long userName, Long bookingserviceId, LocalDate bookingserviceDate, Long centreId) {
		super();
		this.userName = userName;
		this.bookingserviceId = bookingserviceId;
		this.bookingserviceDate = bookingserviceDate;
		this.centreId = centreId;
	}

	public Long getUserName() {
		return userName;
	}

	public void setUserName(Long userName) {
		this.userName = userName;
	}

	public Long getBookingserviceId() {
		return bookingserviceId;
	}

	public void setBookingserviceId(Long bookingserviceId) {
		this.bookingserviceId = bookingserviceId;
	}

	public LocalDate getBookingserviceDate() {
		return bookingserviceDate;
	}

	public void setBookingserviceDate(LocalDate bookingserviceDate) {
		this.bookingserviceDate = bookingserviceDate;
	}

	public Long getCentreId() {
		return centreId;
	}

	public void setCentreId(Long centreId) {
		this.centreId = centreId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookingserviceId, centreId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingService other = (BookingService) obj;
		return Objects.equals(bookingserviceId, other.bookingserviceId) && Objects.equals(centreId, other.centreId);
	}

	@Override
	public String toString() {
		return "BookingService [userName=" + userName + ", bookingserviceId=" + bookingserviceId
				+ ", bookingserviceDate=" + bookingserviceDate + ", centreId=" + centreId + "]";
	}
	
}
