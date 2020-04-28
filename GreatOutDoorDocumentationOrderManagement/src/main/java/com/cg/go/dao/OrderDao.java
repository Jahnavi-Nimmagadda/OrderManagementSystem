package com.cg.go.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.go.dto.OrderDTO;

public interface OrderDao extends JpaRepository<OrderDTO, Integer> {
	 List<OrderDTO> findByUserId(String userId);

	// @Query("delete from OrderDTO where order_id=?1 and
	// order_dispatch_status!=dispatched")
	// public List<OrderDTO> delete( Integer order_id);
	//
	// @Query("select o.order_dispatch_status from OrderDTO o where o.order_id=?1")
	// public List<OrderDTO> fetch( Integer order_id);

	// public Optional<OrderDTO> findById(Integer userId, Integer orderId);
}

//
// @Query("select product from UserDTO where userId=?")
// public List<ProductsDTO> fetch( Integer userId);
