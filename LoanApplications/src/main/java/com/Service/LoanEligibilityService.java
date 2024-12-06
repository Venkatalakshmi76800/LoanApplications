package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.LoanEligibility;
import com.Repository.LoanEligibilityRepository;

@Service
public class LoanEligibilityService {
	
	    @Autowired
	    private LoanEligibilityRepository repository;

	    public LoanEligibility checkEligibility(LoanEligibility applicant) {
	        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 3 * applicant.getLoanAmount()) {
	            applicant.setEligible(true);
	        } else {
	            applicant.setEligible(false);
	        }
	        return repository.save(applicant);
	    }
	}
