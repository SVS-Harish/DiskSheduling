package disk;

import java.util.Arrays;
import java.util.Random;

public class look 
{
	public int output(int hd,int n,int st,int ed)
	{
	Random R= new Random();
	int i,c=0;
			System.out.println("Input");
	 	    int[] a = new int[n+1];
	 	    a[0]=hd;
	 	    for (i = 1; i < n+1; i++)
	 	    {
	 	        a[i] = R.nextInt(ed-st)+st;
	 	       System.out.println(a[i]);
	 	    }
	 	    System.out.println("Output: ");
		    Arrays.sort(a);
		    int p;
		    p=0;
		    for ( i = 0; i < (n+1); i++)
		    {
		        if(a[i]==hd)
		        {
		        	p=i;
		        }
		    }
		    for ( i = p; i > 0; i--)
		    {
		    	 if ((a[i]-a[i-1])<0)
		 	    {
		 	    	c=c + (a[i-1]-a[i]);
		 	    	System.out.println(a[i]+" "+a[i-1]);
		 	    }
		 	    else
		 	    {
		 	    	c=c - (a[i-1]-a[i]);
		 	    	System.out.println(a[i]+" "+a[i-1]);
		 	    }

		     }
	    //	 System.out.println(a[p+1]-a[0]);
		    if((p+1 < n+1))
		    {
		    if(((a[p+1]-a[0])>0) )
		    {
		    	c = c + (a[p+1]-a[0]);
		    	System.out.println(a[0]+" "+a[p+1]);
		    }
		    
		    else
		    {
		    	c= c-(a[p+1]-a[0]); 
		    }}
		    for (i = (p+1); i < (n); i++)
		    {
		     //System.out.println(a[i]-a[i+1]);
		    	 if ((a[i]-a[i+1])<0)
		 	    {
		 	    	c=c + (a[i+1]-a[i]);
		 	    	System.out.println(a[i]+" "+a[i+1]);
		 	    }
		 	    else
		 	    {
		 	    	c=c - (a[i+1]-a[i]);
		 	    	System.out.println(a[i+1]+" "+a[i]);
		 	    }

		     }
		 //   count=count+(2*(a[0]-lb));
		   return c;
	}
}
