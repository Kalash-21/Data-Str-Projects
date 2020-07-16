package Uni_ds;

import java.util.Scanner;

public class LinearSrcInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int temp=1;
		System.out.println("Enter the num you want to search");
		int k=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==k)
				{
					System.out.println(i);
					temp=0;
				}
			
		}
		if(temp==1)
		{
			System.out.println("Not Available");
		}

	}

}
