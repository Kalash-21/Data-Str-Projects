package Uni_ds;

import java.util.Scanner;

public class OptBubble {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=n-i;i++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
