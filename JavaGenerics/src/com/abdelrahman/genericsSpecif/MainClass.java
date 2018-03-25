/**
 * 
 */
package com.abdelrahman.genericsSpecif;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 22, 2018
 */
public class MainClass {
	
	public static void showEmployee(List<? extends Customer> list){
		for(Customer e:list){
			System.out.println(e.printf());
		}
	}
	

	
	public static void main(String []args){
		List<Customer> cu =  new ArrayList<Customer>();
		cu.add( new Customer());
		cu.add( new Customer());
		cu.add( new Customer());
		cu.add( new Customer());
		showEmployee(cu);
		
		List<MiniCustomer> cu2 =  new ArrayList<MiniCustomer>();
		cu2.add( new MiniCustomer());
		cu2.add( new MiniCustomer());
		cu2.add( new MiniCustomer());
		cu2.add( new MiniCustomer());
		showEmployee(cu);
		
	}
}
