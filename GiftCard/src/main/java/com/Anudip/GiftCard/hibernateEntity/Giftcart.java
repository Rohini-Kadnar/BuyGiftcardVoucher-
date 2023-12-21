package com.Anudip.GiftCard.hibernateEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Giftcart")
public class Giftcart {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int giftcartid;
	
	
	@Column(name="Category",length=50)
	private String category;
	
	@Column(name="ItemName",length=50)
	private String giftcartname;
	
	@Column(name="ItemPrice",length=10)
	private int giftcartprice;
	
	@Column(name="ItemQuantity",length=50)
	private int giftcartquantity;
	
	@Column(name="Review",length=50)
	private String review;
	
	@ManyToOne(cascade=CascadeType.ALL)
	 Order order;
	//Card card;
	//@OneToMany(mappedBy="card",cascade=CascadeType.ALL)

	public Giftcart(int giftcartid, String category, String giftcartname, int giftcartprice, int giftcartquantity,
			String review) {
		super();
		this.giftcartid = giftcartid;
		this.category = category;
		this.giftcartname = giftcartname;
		this.giftcartprice = giftcartprice;
		this.giftcartquantity = giftcartquantity;
		this.review = review;
		this.order = order;
	}

	/**
	 * @return the giftcartid
	 */
	public int getGiftcartid() {
		return giftcartid;
	}

	/**
	 * @param giftcartid the giftcartid to set
	 */
	public void setGiftcartid(int giftcartid) {
		this.giftcartid = giftcartid;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the giftcartname
	 */
	public String getGiftcartname() {
		return giftcartname;
	}

	/**
	 * @param giftcartname the giftcartname to set
	 */
	public void setGiftcartname(String giftcartname) {
		this.giftcartname = giftcartname;
	}

	/**
	 * @return the giftcartprice
	 */
	public int getGiftcartprice() {
		return giftcartprice;
	}

	/**
	 * @param giftcartprice the giftcartprice to set
	 */
	public void setGiftcartprice(int giftcartprice) {
		this.giftcartprice = giftcartprice;
	}

	/**
	 * @return the giftcartquantity
	 */
	public int getGiftcartquantity() {
		return giftcartquantity;
	}

	/**
	 * @param giftcartquantity the giftcartquantity to set
	 */
	public void setGiftcartquantity(int giftcartquantity) {
		this.giftcartquantity = giftcartquantity;
	}

	/**
	 * @return the review
	 */
	public String getReview() {
		return review;
	}

	/**
	 * @param review the review to set
	 */
	public void setReview(String review) {
		this.review = review;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	
	
	
	

}