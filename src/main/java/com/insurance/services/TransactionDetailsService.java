package com.insurance.services;

/*Task 174 Design API to get the transaction details for each user after paying the premium
 * @Author Rohini Shinde
*/
import com.insurance.model.TransactionDetails;

public interface TransactionDetailsService {
	public TransactionDetails saveTransactionDetails(TransactionDetails transactionDetails);

}
