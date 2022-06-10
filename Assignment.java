package com.assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigInteger;

public class Assignment {
	
	public Assignment() {
		
	}
	ArrayList<BigInteger> SortDesc(ArrayList<BigInteger> arr){
	Collections.sort(arr,Collections.reverseOrder());
	return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
		System.out.println("Enter the number of elements");
		int g = sc.nextInt();
		for(int i=0;i<g;i++) {
			System.out.println("Enter numbers");
			arr.add(sc.nextBigInteger());
		}
		System.out.println("before sorting: ");
		System.out.println(arr);
		System.out.println("after sorting:");
		Assignment obj = new Assignment();
		obj.SortDesc(arr);
		System.out.println(arr);
	
	}

}
