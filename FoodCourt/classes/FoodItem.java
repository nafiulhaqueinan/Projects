package classes;

import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity{

	String fid;
	String name;
	double price;
	int availableQuantity;

	public FoodItem(){};

	public FoodItem(String fid, String name, int availableQuantity,double price){
		this.fid = fid;
		this.name = name;
		this.availableQuantity= availableQuantity;
		this.price= price; 

	}
	
	
	void setFid(String fid){this.fid = fid;}
	
	String getFid(){return fid;}
	
	void setName(String name){this.name = name;}
	
	String getName(){ return name;}
	
	void setAvailableQuantity(int availableQuantity){this.availableQuantity = availableQuantity;}
	
	int getAvailableQuantity(){return availableQuantity;}
	
	void setPrice(double price){this.price = price;}
	
	double getPrice(){return price;}
	
	public boolean addQuantity(int amount){
		if(amount>0){

			System.out.println("-------------------------------------------\n\n");
			System.out.println("Previous Quantity: "+ availableQuantity);
			System.out.println("Added Amount: "+ amount);

			availableQuantity = availableQuantity+amount;
			
			System.out.println("Current Quantity: "+ availableQuantity);
			
			System.out.println("-------------------------------------------\n\n");
			return true;
		}
		else{return false;}
	}
    public boolean sellQuantity(int amount){

		if(amount>0 && amount<= availableQuantity){

			System.out.println("-------------------------------------------\n\n");
			System.out.println("Previous Quantity: "+ availableQuantity);
			System.out.println("Selled Amount: "+ amount);

			availableQuantity = availableQuantity-amount;
			
			System.out.println("Current Quantity: "+ availableQuantity);
			System.out.println("-------------------------------------------\n\n");
			
			return true;
		}
		else{return false;}
    }
	
	abstract void showInfo();


}

