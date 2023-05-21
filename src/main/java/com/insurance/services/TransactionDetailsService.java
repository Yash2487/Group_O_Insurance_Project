package com.insurance.services;
/*Task 174 Design API to get the transaction details for each user after paying the premium*/
import javax.transaction.Transaction;

import com.insurance.model.TransactionDetails;

public interface TransactionDetailsService {
	public TransactionDetails saveTransactionDetails(TransactionDetails transactionDetails);

}
