package disk;

import java.util.Arrays;
import java.util.Random;

public class clook {

	public int result(int hd,int n,int st,int ed)
	{
	Random R= new Random();
	int i=0 ,count=0;
	int a[]=new int[n+1];
	System.out.println("Input");
	for(i=1;i<n+1;i++)
	{
		a[i]=R.nextInt(ed-st)+st;
		System.out.println(a[i]);
	}		
		    a[0]=hd;
		    Arrays.sort(a);
		    int p;
		    p=0;
		    System.out.println("Output :");
		    for (i = 0; i < (n+1); i++)
		    {
		       // System.out.println(a[i]);
		       // a[i] = input.nextDouble();
		        if(a[i]==hd)
		        {
		        	p=i;
		        }
		    }
		    for (i = p; i > 0; i--)
		    {
		    	 //System.out.println(a[i]-a[i-1]);
		    	 if ((a[i]-a[i-1])<0)
		 	    {
		 	    	count=count + (a[i-1]-a[i]);
		 	    	 //System.out.println(count);
		 	    	System.out.println(a[i]+" "+a[i-1]);
		 	    }
		 	    else
		 	    {
		 	    	count=count - (a[i-1]-a[i]);
		 	    	System.out.println(a[i]+" "+a[i-1]);
		 	    }

		     }
	    	 //System.out.println(a[p+1]-a[0]);
		    for ( i = n; i > (p+1); i--)
		    {
		    	 //System.out.println(a[i]-a[i+1]);
		    	 if ((a[i]-a[i-1])<0)
		 	    {
		 	    	count=count + (a[i-1]-a[i]);
		 	    	System.out.println(a[i]+" "+a[i-1]);
		 	    }
		 	    else
		 	    {
		 	    	count=count - (a[i-1]-a[i]);
		 	    	System.out.println(a[i]+" "+a[i-1]);
		 	    }

		     }
		 //   count=count+(a[0]-lb)+(ub-a[n]);
		//    System.out.println(count);
		  return count;
	}
}
