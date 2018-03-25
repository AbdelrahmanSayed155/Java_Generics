/**
 * 
 */
package com.abdelrahman.Generics;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 22, 2018
 */
public class Main {
	public static void main(String []args){
		System.out.println("--- Unsed Generics ---");
		List list = new ArrayList();
		list.add("Unsing Generics");
		/// becuase it return object so you must 
		/// cast return to your type
		String element = (String)list.get(0);
		System.out.println(element);
		System.out.println("--- Using Generics ---");
		List<String> list1 = new ArrayList<String>();
		list1.add("Using Generics");
		   /// becuase it return object so you must 
		   /// cast return to your type
		   ///String element2 = (String)list.get(0);
		String element2 = list1.get(0);
		System.out.println(element2);
	}
	

}
