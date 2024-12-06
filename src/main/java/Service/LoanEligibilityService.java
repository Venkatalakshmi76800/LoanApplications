package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.LoanEligibility;
import com.Repository.LoanEligibilityRepository;

@Service
public class LoanEligibilityService {
	@Autowired
    private LoanEligibilityRepository loanEligibilityRepository;
	
	public String checkEligibility(LoanEligibility loanEligibility) {
        if (loanEligibility.getIncome() >= 50000 && loanEligibility.getCreditScore() >= 650 && loanEligibility.isEmployed()) {
            return "Eligible for Loan";
        } else {
            return "Not Eligible for Loan";
        }

}
}
