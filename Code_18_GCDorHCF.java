

import java.util.*;
import java.lang.*;
import java.io.*;


class Comp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Greatest common divisor of 2 numbers
		
		int n1,n2;
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		int hcf=1;
		
		for(int i=(n1>n2)?n2:n1 ; i>=2; i--){
		    if(n1%i==0 && n2%i==0){
		        hcf=i;
		        break;
		    }
		        
		}
		
		System.out.print(hcf);
		
	}
}
