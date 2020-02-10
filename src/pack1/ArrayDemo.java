package pack1;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int[] num = new int[size];
		
		System.out.println("Enter elements for array");
		for(int i=0;i<size;i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("You have entered");
		for(int i=0;i<size;i++) {
			System.out.println(num[i]);
		}

	}

}
