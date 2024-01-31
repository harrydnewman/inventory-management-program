package InventoryClass;
import java.util.*;

public class Customer
{
	String name;
	String password;
	String accountType;
	double amountspent = 0;

	public Customer(){}

	public Customer(String newName, String newPassword, String accountType){
		name = newName;
		password = newPassword;
		amountspent = 0;
    }

	public Customer(String newName, String newPassword, String accountType, double newAmountSpent){
		name = newName;
		password = newPassword;
		amountspent = newAmountSpent;
    }


	public String getName(){
		return name;
    }
	public void setName(String newName){
		name = newName;
    }

	public String getPassword(){
		return password;
    }
	public void setPassword(String newPassword){
		password = newPassword;
    }

	public String getAmountspent(){
		return "" + amountspent;
    }

	public void setAmountspent(double newPurchase){
		amountspent += newPurchase;
    }
}