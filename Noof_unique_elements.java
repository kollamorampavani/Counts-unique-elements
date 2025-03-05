package arrays;
import java.util.*;
public class Noof_unique_elements {
	public static void repeated(int[] a) {
		int count=1,uniquecount=0;
	     for(int i=0;i<a.length-1;i++) {
	    	 
	    	 
			 if(a[i]==a[i+1]) 
			 {
					count++;	
			 }
			 
			 else {
				 if(count==1) {
					 uniquecount++;
					
				 }
					count=1;
				}
			 }
	         if(count==1) {
	        	 uniquecount++;
	     }
	     System.out.println(uniquecount);    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<a.length;i++) {
	   	 a[i]=scan.nextInt();
	   	  }
	    repeated(a);
		}
	}


