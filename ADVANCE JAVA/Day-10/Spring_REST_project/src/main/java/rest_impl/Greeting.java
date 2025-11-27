package rest_impl;

import java.time.LocalDate;

public class Greeting {
	private String message;
	private LocalDate delivery;
	public Greeting() {
		
	}
	public Greeting(String message, LocalDate delivery) {
		super();
		this.message = message;
		this.delivery = delivery;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDate getDelivery() {
		return delivery;
	}
	public void setDelivery(LocalDate delivery) {
		this.delivery = delivery;
	}
		
	
}
