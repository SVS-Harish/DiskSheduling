package disk;

import java.util.Arrays;
import java.util.Random;

public class scan 
{
	public int output(int hd,int n,int st,int ed)
	{
	Random R= new Random();
	int i,count=0;
	System.out.println("Input");
	 	    int[] a = new int[n+1];
	 	    a[0]=hd;
	 	    for (i = 1; i < n+1; i++)
	 	    {
	 	        a[i] = R.nextInt(ed-st)+st;
	 	       System.out.println(a[i]);
	 	    }
	 	    System.out.println("Output: ");
	 	 //   System.out.println(hd+" "+a[0]);
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
		    for (i = p; i > 0; i--)
		    {
		    	 if ((a[i]-a[i-1])<0)
		 	    {
		 	    	count=count + (a[i-1]-a[i]);
		 	        System.out.println(a[i-1]+" "+a[i]);
		 	    }
		 	    else
		 	    {
		 	    	count=count - (a[i-1]-a[i]);
		 	    	System.out.println(a[i]+" "+a[i-1]);
		 	    }

		     }
	    	 
	    	 if(p+1<n+1)
	    	 {
	    		 
	    		 System.out.println(a[i]+" "+ 0);
	    	 System.out.println(0+" "+a[p+1]);
		    if((a[p+1]-a[0])>0)
		    {
		    	count = count + (a[p+1]-a[0]);
		 //   	System.out.println(a[0]+" "+a[p+1]);
		    }
		    else
		    {
		    	count= count-(a[p+1]-a[0]); 
		   // 	System.out.println(a[p+1]+" "+a[0]);
		    }
		    for (i = (p+1); i < (n); i++)
		    {
		    	 //System.out.println(a[i]-a[i+1]);
		    	 if ((a[i]-a[i+1])<0)
		 	    {
		 	    	count=count + (a[i+1]-a[i]);
		 	    	 //System.out.println(count);
		 	    	System.out.println(a[i]+" "+a[i+1]);
		 	    }
		 	    else
		 	    {
		 	    	count=count - (a[i+1]-a[i]);
		 	    	System.out.println(a[i+1]+" "+a[i]);
		 	    }

		     }
		    count=count+(2*(a[0]-st));
	    	 }
		    
	//	    System.out.println(count);
		    
	return count;
	}
}
