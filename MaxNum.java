package Uni_ds;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) 
		{
			a[i]=obj.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[n-1]);

	}

}
