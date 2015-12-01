package disk;

import java.util.Random;

public class sstf 
{
	public int result(int hd,int n,int st,int ed)
	{
		int i=0,c=0;
		Random R= new Random();
	int d[]=new int[n];
	int in[]=new int[n];
	System.out.println("Input");
	for(i=0;i<n;i++)
	{
		in[i]=R.nextInt(ed-st)+st;
		System.out.println(in[i]);
	}
	int m=0,k=0;
	System.out.println("Output :");
	for(i=0;i<n;i++)
	{
		for(k=0;k<n;k++)
		{
		//	if(in[k]!=hd)
		//	{
				d[k]=in[k]-hd;
				if(d[k]<0)
					d[k]=-d[k];
		//	}
		}
		m=fun(d,n);
		System.out.println(hd+" "+in[m]);
		if(in[m]>hd)
			c=c+(in[m]-hd);
		else
			c=c+(hd-in[m]);
		hd=in[m];
		in[m]=100000000;
	}
	return c;
//	res.setText(String.valueOf(count));
	}
public int fun(int a[],int q)
{
	int min=a[0],j,p=0;
	for(j=0;j<q;j++)
	{
		if(a[j]<min)
		{
			min=a[j];
			p=j;
		}
	}
	return p;
}
}
