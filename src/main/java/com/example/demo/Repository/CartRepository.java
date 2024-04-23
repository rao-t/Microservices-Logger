package com.example.demo.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Cart;

public interface CartRepository extends JpaRepository<Cart,UUID>{
    List<Cart> findByUserId(int userId);
}