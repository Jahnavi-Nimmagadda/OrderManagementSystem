package com.cg.go.dto;
import javax.persistence.Entity;
//import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_product_map")
public class ProductsDTO {
	private int order_id;
	private String product_id;
	private String product_uin;
	private String product_status;
    private String gift_status;
	public int getOrder_id() {
		return order_id;
	}
	public ProductsDTO(int order_id, String product_id, String product_uin, String product_status,
			String gift_status) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.product_uin = product_uin;
		this.product_status = product_status;
		this.gift_status = gift_status;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_uin() {
		return product_uin;
	}
	public void setProduct_uin(String product_uin) {
		this.product_uin = product_uin;
	}
	public String getProduct_status() {
		return product_status;
	}
	public void setProduct_status(String product_status) {
		this.product_status = product_status;
	}
	public String getGift_status() {
		return gift_status;
	}
	public void setGift_status(String gift_status) {
		this.gift_status = gift_status;
	}
}
