package Uni_ds;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySrh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Enter the number you want to search");
		int item=s.nextInt();
		int mi=0,hi=0,li=0;
		hi=n;
		while(li<=hi)
		{
			if(a[mi]==item)
			{
				System.out.println(mi);
				break;
			}
			else if(a[mi]<item)
			{
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
	}

}
