package com.example.onlinePizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinePizza.entity.Coupan;
import com.example.onlinePizza.exceptions.CoupanIdNotFoundException;
import com.example.onlinePizza.exceptions.InvalidCoupanOperationException;
import com.example.onlinePizza.repository.ICoupanRepository;
@Service

public class CoupanServiceImpl implements ICoupanService {

	 @Autowired
	    private ICoupanRepository iCoupanRepository;
	    



	   public CoupanServiceImpl(ICoupanRepository iCoupanRepository) {
	        super();
	        this.iCoupanRepository = iCoupanRepository;
	    }
	    @Override
	    public Coupan addCoupans(Coupan coupan) {
	        return iCoupanRepository.save(coupan);
	    }
	    @Override
	    public Coupan editCoupans(Coupan coupan) throws InvalidCoupanOperationException {
	        return iCoupanRepository.save(coupan);
	    }
	    
	  
	   @Override
	    public  List<Coupan> viewCoupans() {
	        return iCoupanRepository.findAll();
	    }
	@Override
	public void deleteCoupans(long coupanId) throws CoupanIdNotFoundException {
		iCoupanRepository.findById(coupanId).orElseThrow(() -> new CoupanIdNotFoundException("Coupan not found with id" +coupanId));

    	iCoupanRepository.deleteById(coupanId);
	}





	    
	    


	
}

