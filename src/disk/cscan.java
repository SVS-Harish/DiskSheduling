package disk;

import java.util.Arrays;
import java.util.Random;

public class cscan {
	
	public int output(int hd,int n,int st,int ed)
	{
	Random R= new Random();
	int i=0;
	int a[]=new int[n+1];
	System.out.println("Input");
    int head=hd;
    int lb=st,ub=ed;
	for(i=1;i<n+1;i++)
	{
		a[i]=R.nextInt(ub-lb)+lb;
		System.out.println(a[i]);
	}	
	System.out.println("Output: ");
		    a[0]=head;
		    Arrays.sort(a);
		    int p;
		    p=0;
		    for (i = 0; i < (n+1); i++)
		    {
		       // System.out.println(a[i]);
		       // a[i] = input.nextDouble();
		        if(a[i]==head)
		        {
		        	p=i;
		        }
		    }
		    int count=0;
		    //System.out.println(p +"is value of p ----"+n+"is value of n");
		    for (i = p; i > 0; i--)
		    {
		    	 //System.out.println(a[i]-a[i-1]);
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
		    if((p)!=n)
		    {
	    	 System.out.println(a[0]+" "+st);
	    	 System.out.println(ed+" "+a[n]);
	    	 count=count+(a[0]-lb)+(ub-a[n]);
		    }
		    for (i = n; i > (p+1); i--)
		    {
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
		   
	//	    System.out.println(count);
		    return count;

}
}