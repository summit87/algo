package com.mypractice.org.DynamicProrammingPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MaximumLengthChainofPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
			ArrayList<ChainOfPairs> al = new ArrayList<ChainOfPairs>();
			Set<ChainOfPairs> setCh = new LinkedHashSet<ChainOfPairs>();
			System.out.println("Enter the number of chain of pairs");
			int numberOfPairs=0;
			Scanner sc = new Scanner(System.in);
			numberOfPairs = sc.nextInt();
			System.out.println("Enter the value of chain of pairs (firstValue,scondValue)");
			for(int i=0;i<numberOfPairs;i++)
			{
				String[] s = sc.next().split(",") ;
				al.add(new ChainOfPairs(Integer.parseInt(s[0]),Integer.parseInt(s[1]))); 
			}
			Collections.sort(al,new SecondPointShorting());
			for(ChainOfPairs ch : al)
			{
				System.out.println(ch.firstPoint+","+ch.secondPoint);
			}
			int[] maxCL = new int[al.size()];
			for(int p=0;p<al.size();p++)
			{
				maxCL[p]=0;
			}
			for(int p=0;p<numberOfPairs;p++)
			{
				int maxLCS=0;
				for(int i=p+1;i<numberOfPairs;i++)
				{
					if((al.get(p).secondPoint<=al.get(i).firstPoint))
					{
						maxLCS++;
						maxCL[p]=maxLCS;
					}
				}
			}
			int max=0;
			for(int l=0;l<al.size();l++)
			{
				if(max<maxCL[l])
				{
					max=maxCL[l];
				}
			}
			System.out.println(max);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
	
}
class SecondPointShorting implements Comparator<ChainOfPairs>
{

	@Override
	public int compare(ChainOfPairs o1, ChainOfPairs o2) {
		// TODO Auto-generated method stub
		return o1.secondPoint-o2.secondPoint;
	}
	
}
class ChainOfPairs
{
	int firstPoint;
	int secondPoint;
	public ChainOfPairs(int firstPoint, int secondPoint) {
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
	}

}