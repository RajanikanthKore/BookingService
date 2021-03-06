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
	private String pinCode;	
	private Long bookingserviceId;
	private LocalDate bookingserviceDate;
	private Long centreId;

	public BookingService() {
		// TODO Auto-generated constructor stub
	}

	public BookingService(String pinCode, Long bookingserviceId, LocalDate bookingserviceDate, Long centreId) {
		super();
		this.pinCode = pinCode;
		this.bookingserviceId = bookingserviceId;
		this.bookingserviceDate = bookingserviceDate;
		this.centreId = centreId;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
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
		return "BookingService [pinCode=" + pinCode + ", bookingserviceId=" + bookingserviceId + ", bookingserviceDate="
				+ bookingserviceDate + ", centreId=" + centreId + "]";
	}
	
}
