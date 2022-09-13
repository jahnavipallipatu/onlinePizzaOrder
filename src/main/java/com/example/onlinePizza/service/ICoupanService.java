package com.example.onlinePizza.service;

import java.util.List;

import com.example.onlinePizza.entity.Coupan;
import com.example.onlinePizza.exceptions.CoupanIdNotFoundException;
import com.example.onlinePizza.exceptions.InvalidCoupanOperationException;




public interface ICoupanService {

	Coupan addCoupans(Coupan coupan);

	Coupan editCoupans(Coupan coupan)throws InvalidCoupanOperationException;

	void deleteCoupans(long coupanId)throws CoupanIdNotFoundException;

	List<Coupan> viewCoupans();



}
