package disk;
import java.util.*;
public class fcfs
{
//	int d[]=new int[n];
	int [] plot=new int[1000];
	public int result(int hd,int n,int st,int ed)
	{
	int i;
	Random R= new Random();
	int count=0,id=0;
	 	   int [] a = new int[n+1];
	 	 //  int [] plot=new int[n+1];
	 	    a[0]=hd;
	 	    System.out.println("Input :");
	 	    for (i = 1; i < n+1; i++)
	 	    {
	 	        a[i] = R.nextInt(ed-st) + st;
	 	       System.out.println(a[i]);
	 	    }
	 	    System.out.println("Output: ");
	 	    if ((hd-a[0])<0)
	 	    {
	 	    	count = a[0]-hd;
	 	    }
	 	    else
	 	    {
	 	    	count = hd-a[0];
	 	    }
	 	    plot[0]=hd;
	 	    id++;
	 	//    System.out.println(hd+" "+a[0]);
	 	    for (i = 1; i < n+1; i++)
	 	    {
	 	    	 //System.out.println(a[i]-a[i-1]);
	 	    	 if ((a[i]-a[i-1])<0)
	 	 	    {
	 	 	    	count=count + (a[i-1]-a[i]);
	 	 	    	plot[id]=a[i];
	 	 	    	id=id+1;

	 	 	    	 System.out.println(a[i-1]+" "+a[i]);
	 	 	    }
	 	 	    else
	 	 	    {
	 	 	    	count=count - (a[i-1]-a[i]);
	 	 	    	plot[id]=a[i];
	 	 	    	id=id+1;

	 	 	    	System.out.println(a[i-1]+" "+a[i]);
	 	 	    }

	 	     }
	 	  //  System.out.println("Total Seek Time");
	 	  //  System.out.println(count);
	 	   return count;
	}
	public int[] graph()
	{
	    return plot;
	}
	}