package com.assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment {
	
	public Assignment() {
		
	}
	ArrayList<Integer> SortDesc(ArrayList<Integer> arr){
		Collections.sort(arr,Collections.reverseOrder());
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter the number of elements");
		int g = sc.nextInt();
		for(int i=0;i<g;i++) {
			System.out.println("Enter numbers");
			arr.add(sc.nextInt());
		}
		System.out.println("before sorting: ");
		System.out.println(arr);
		System.out.println("after sorting:");
		Assignment obj = new Assignment();
		obj.SortDesc(arr);
		System.out.println(arr);
	
	}

}