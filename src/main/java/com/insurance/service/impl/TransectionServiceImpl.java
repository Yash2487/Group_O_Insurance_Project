package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Transection;
import com.insurance.repository.TransectionRepository;
import com.insurance.service.TransectionService;

@Service
public class TransectionServiceImpl implements TransectionService {
	@Autowired
	private TransectionRepository transectionRepository;

	@Override
	public Transection updateTransectionDetails(Transection transection) {
		Transection transection2 = transectionRepository.findById(transection.getId()).orElse(null);
		if (transection2 != null) {
			transection2.setAmount(transection.getAmount());
			transectionRepository.save(transection2);
			return transection2;
		}
		return null;
	}

}
