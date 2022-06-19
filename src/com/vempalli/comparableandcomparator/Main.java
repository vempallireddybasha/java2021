package com.vempalli.comparableandcomparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setCustomerId(105);
		customer.setCustomerName("vempalli");
		customer.setMobileNumber("1");
		Customer customer1=new Customer();
		customer1.setCustomerId(102);
		customer1.setCustomerName("Reddybasha");
		customer1.setMobileNumber("2");
		Customer customer2=new Customer();
		customer2.setCustomerId(103);
		customer2.setCustomerName("Reddybas");
		customer2.setMobileNumber("3");
		Customer customer3=new Customer();
		customer3.setCustomerId(107);
		customer3.setCustomerName("haritha");
		customer3.setMobileNumber("4");
		List<Customer> ls=new ArrayList<Customer>();
		ls.add(customer);
		ls.add(customer1);
		ls.add(customer2);
		ls.add(customer3);
		//		Collections.sort(ls, new Comparator<Customer>() {
//			@Override
//			public int compare(Customer o1, Customer o2) {
//				return (int) (o2.getCustomerId()-o1.getCustomerId());
//			
//			}
//
//		});
//		Comparator<Customer> com=(o1,o2)->o1.getCustomerName().compareTo(o2.getCustomerName());
//		Collections.sort(ls, com);
		//Collections.sort(ls);
		Comparator<Customer> cm=Comparator.comparing(Customer::getCustomerId).thenComparing(Customer::getMobileNumber).thenComparing(Customer::getCustomerName);
		List<Customer> sortedList=ls.stream().sorted(cm).collect(Collectors.toList());
		System.out.println(sortedList);

	}
}
