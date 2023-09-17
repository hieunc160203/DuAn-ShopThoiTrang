package com.tam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tam.entity.*;

public interface OrderDAO extends JpaRepository<Order, Long>{
}
