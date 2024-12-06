package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.LoanEligibility;
import com.Service.LoanEligibilityService;

@RestController
@RequestMapping("/api/loan")
public class LoanEligibilityController {
	 @Autowired
	    private LoanEligibilityService service;

	    @PostMapping("/check")
	    public LoanEligibility checkEligibility(@RequestBody LoanEligibility applicant) {
	        return service.checkEligibility(applicant);
	    }
}