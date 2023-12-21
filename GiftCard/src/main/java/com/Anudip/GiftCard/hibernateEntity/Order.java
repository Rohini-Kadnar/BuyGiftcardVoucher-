package com.Anudip.GiftCard.hibernateEntity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Order1")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int orderid;
	
	@Column(name="Name",length=50)
   private String name;
	
	@Column(name="Email",length=50)
   private String email;
	
	@Column(name="Mobileno",length=50)
   private String mobileno;
	
	@Column(name="PaymentMethod",length=50)
   private String paymentmethod;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<Giftcart> Giftcart;

	
	public int getOrderid() {
	return orderid;
	}
	public void setOrderid(int orderid) {
	this.orderid = orderid;
}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public String getMobileno() {
	return mobileno;
	}
	public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
	}
	public String getPaymentmethod() {
	return paymentmethod;
}
	public void setPaymentmethod(String paymentmethod) {
	this.paymentmethod = paymentmethod;
	}

	public Order(int orderid, String name, String email, String mobileno, String paymentmethod) {
		super();
		this.orderid = orderid;
		this.name = name;
		this.email = email;
		this.mobileno = mobileno;
		this.paymentmethod = paymentmethod;

}
  
   
	
}