package javacollections;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private Long id;
	private LocalDate orderdate;
	private LocalDate deliverydate;
	private String status;
	private List<Product> product;
	Customer customer;
	private Long number;

	public Order() {

	}

	public Order(Long id, LocalDate orderdate, LocalDate deliverydate, String status, Long number) {
		super();
		this.id = id;
		this.orderdate = orderdate;
		this.deliverydate = deliverydate;
		this.status = status;
		this.number = number;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}

	public LocalDate getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(LocalDate deliverydate) {
		this.deliverydate = deliverydate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
