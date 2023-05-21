package com.insurance.service.impl;
/*Task 174 Design API to get the transaction details for each user after paying the premium*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.TransactionDetails;
import com.insurance.repository.TransactionDetailsRepository;
import com.insurance.services.TransactionDetailsService;

@Service
public class TransactionDetailsServiceImpl implements TransactionDetailsService{
  //inject the repository reference
	@Autowired
	private TransactionDetailsRepository transactionDetailsRepository;
	
	
	@Override
	public TransactionDetails saveTransactionDetails(TransactionDetails transactionDetails) {
		TransactionDetails transaction = transactionDetailsRepository.save(transactionDetails);
		return transaction;
	}

}
