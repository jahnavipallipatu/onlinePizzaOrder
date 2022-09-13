package com.example.onlinePizza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlinePizza.entity.Coupan;
import com.example.onlinePizza.exceptions.CoupanIdNotFoundException;
import com.example.onlinePizza.exceptions.InvalidCoupanOperationException;


 @Repository
public interface ICoupanRepository extends JpaRepository<Coupan,Long> {

}
