/**
 * 
 */
package com.abdelrahman.customGenerics;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 22, 2018
 */
public class Container <T> {

	T names;

	public T getNames() {
		return names;
	}

	public void setNames(T names) {
		this.names = names;
	}
	
	public static <E> void printList(E[] arr){
		for(E e:arr){
			System.out.println(e);
		}
	}

	
}
