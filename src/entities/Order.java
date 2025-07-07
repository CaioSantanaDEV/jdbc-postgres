package entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private Long id;
	private Double latitude;
	private Double longitude;
	private Instant moment;
	private OrderStatus status;

	private List<Product> products = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLatitide() {
		return latitude;
	}

	public void setLatitide(Double latitide) {
		this.latitude = latitide;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<Product> getProducts() {
		return products;
	}

	public Order(Long id, Double latitide, Double longitude, Instant moment, OrderStatus status,
			List<Product> products) {
		super();
		this.id = id;
		this.latitude = latitide;
		this.longitude = longitude;
		this.moment = moment;
		this.status = status;
		this.products = products;
	}

	public Order() {

	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", moment=" + moment
				+ ", status=" + status + ", products=" + products + "]";
	}

}
