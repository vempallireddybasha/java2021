package com.vempalli.comparableandcomparator;

public class Customer{

	private long customerId;
	private String customerName;
	private String mobileNumber;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileNumber="
				+ mobileNumber + "]";
	}
//	@Override
//	public int compareTo(Customer o) {
//		return  (int) (this.getCustomerId()-o.getCustomerId());
//	}
	
	

}
