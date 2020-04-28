package com.cg.go.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.go.dto.OrderProductMapDTO;


public interface ProductDao extends JpaRepository<OrderProductMapDTO, Integer> {

	boolean exists(String orderId);

	void delete(String orderId);

	

}