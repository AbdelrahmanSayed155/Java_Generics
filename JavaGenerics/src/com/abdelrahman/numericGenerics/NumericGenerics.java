/**
 * 
 */
package com.abdelrahman.numericGenerics;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 22, 2018
 */
public class NumericGenerics {
	
	
	public static <T extends Number> T isBigger( T a,T b){
		Integer z = (Integer)a+(Integer)b;
		return (T) z;
	}

}
