package com.Masai.bmshow.booking;

import java.util.Date;
import java.util.List;

import com.Masai.bmshow.enums.BookingStatus;
import com.Masai.bmshow.movie.Show;
import com.Masai.bmshow.movie.ShowSeat;
import com.Masai.bmshow.payment.Payment;

public class Booking {
	  private String bookingNumber;
	  private int numberOfSeats;
	  private Date createdOn;
	  private BookingStatus status;

	  private Show show;
	  private List<ShowSeat> seats;
	  private Payment payment;

	  /*
	   * Make payment for outstanding amount
	   */
	  public boolean makePayment(Payment payment) {
		  
	  }
	  
	  /**
	   * Cancel existing booking
	   * @return
	   */
	  public boolean cancel() {
		  
	  }
	  
	  /**
	   * @param seats
	   * allocate the seat.
	   * @return
	   */
	  public boolean assignSeats(List<ShowSeat> seats) {
		  
	  }

}
