package com.vempalli;

import java.util.Scanner;

public class ItemSeperator
{
	private String name;
	private double price;
	private int quantity;
	private String rawInput;
	public ItemSeperator(String rawInput) {
		this.rawInput=rawInput;
	}
	@Override
	public String toString() {
		return "ItemSeperator [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the raw input");
		String rawInput=scan.next();
		ItemSeperator item=new ItemSeperator(rawInput);
		String[] str= rawInput.split("\\$\\$\\#\\#");
		for(int i=0;i<str.length;i++) {
			if(i==0) {
				item.setName(str[i]);
			}
			else if(i==1) {
				item.setPrice((Integer.parseInt(str[i])));

			}
			else if(i==2) {
				item.setQuantity(Integer.parseInt(str[i]));
			}
		}
		System.out.println(item);
		System.out.println(item.getName());
		System.out.println(item.getPrice());
		System.out.println(item.getQuantity() );



	}
}
