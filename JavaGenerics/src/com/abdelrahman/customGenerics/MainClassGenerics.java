/**
 * 
 */
package com.abdelrahman.customGenerics;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 22, 2018
 */
public class MainClassGenerics {

	public static void main(String[] args) {
		Container<String>  conta = new Container<String>();
		conta.setNames("svvwv");
		System.out.println(conta.getNames());
		
		Container<Integer>  conta1 = new Container<Integer>();
		conta1.setNames(12455);
		System.out.println(conta1.getNames());
		System.out.println("Print Numbers---");
		Integer [] arr1 = new Integer [3];
		arr1[0]=124;
		arr1[1]=14524;
		arr1[2]=127454;
		Container.printList(arr1);
		System.out.println("print Strings ---");
		String [] arr2 = new String [3];
		arr2[0]="Abdelrahman";
		arr2[1]="Sayed";
		arr2[2]="Mmohamed";
		Container.printList(arr2);
		
		
	}

}
