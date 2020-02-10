package pack1;

import java.util.Scanner;

public class ArraySearch {

	public static int findElement(int arr[], int n, int key) {
		for (int i = 0; i < n; i++)
			if (arr[i] == key)
				return i;

		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int[] num = new int[size];
		
		System.out.println("Enter elements for array");
		for(int i=0;i<size;i++) {
			num[i] = sc.nextInt();
		}

		System.out.println("Enter the value you to find in array");
		int key = sc.nextInt();
		int pos = findElement(num, size, key);
		if(pos == -1)
			System.out.println("Element "+key+" is not present");
		else
			System.out.println("Element "+key+" is present at Position "+(pos+1));
	}

}
