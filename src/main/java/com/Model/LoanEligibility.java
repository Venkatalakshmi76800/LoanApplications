package com.Model;




public class LoanEligibility {
	
	private Long id;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public boolean isEmployed() {
		return employed;
	}
	public void setEmployed(boolean employed) {
		this.employed = employed;
	}
	private double income;
    private int creditScore;
    private boolean employed;

}
