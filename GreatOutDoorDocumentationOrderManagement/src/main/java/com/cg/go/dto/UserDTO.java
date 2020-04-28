package com.cg.go.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdto")
public class UserDTO {
	
	@Id
	private int userId;
	private String password;
	private String userName;

//	@OneToMany
//	@JsonIgnoreProperties
//	@NotFound( action = NotFoundAction.IGNORE)
//	private List<ProductsDTO> product=new ArrayList<ProductsDTO>();
//	
//	public List<ProductsDTO> getProduct() {
//		return product;
//	}
//	public void setProduct(List<ProductsDTO> product) {
//		this.product = product;
//	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
