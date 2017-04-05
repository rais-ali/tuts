import java.io.*;
import java.lang.*;
import java.util.*;

class disjoint {
	public static void main(String srgs[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt(),n=sc.nextInt();
		HashSet<Integer> hash=new HashSet<Integer>(m);
		
		int flag=0;
		for(int i=0;i<m;i++)
			hash.add(sc.nextInt());
		System.out.println("Enter elements of array 2");
    /*    for(int i=0;i<n;i++)
		{
			if(hash.contains(sc.nextInt()))
			{
                 flag=1;
			}
		}
		if(flag==1)
			System.out.println("Not Disjoint");
		else
			System.out.println(" Disjoint sets");
*/
	}
}
