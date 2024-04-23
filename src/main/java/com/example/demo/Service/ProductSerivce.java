package com.example.demo.Service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ProductModel;
import com.example.demo.Model.ResponseMessage;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductSerivce {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ResponseMessage responseMessage;

    public ResponseEntity<ResponseMessage> addProductService(ProductModel product) {

        final Logger log = LoggerFactory.getLogger(UserService.class);

        log.info("Product added successfully");
        
        productRepository.save(product);
        responseMessage.setSuccess(true);
        responseMessage.setMessage("Product Added successfully");

        return ResponseEntity.status(HttpStatus.OK).body(responseMessage);
    }
}

