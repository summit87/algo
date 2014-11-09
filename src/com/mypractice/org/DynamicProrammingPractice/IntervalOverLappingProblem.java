package com.mypractice.org.DynamicProrammingPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class IntervalOverLappingProblem {

	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			Stack<Interval> stackIntervalList = new Stack<Interval>();
			ArrayList<Interval> intervalList = new ArrayList<Interval>();
			System.out.println("Enter Interval Pair..");
			for(int i=0;i<4;i++)
			{
				String[] s = sc.next().split(",");
				intervalList.add(new Interval(Integer.parseInt(s[0]),Integer.parseInt(s[1])));
			}
			Collections.sort(intervalList,new StartPointShorting());
			stackIntervalList.push(intervalList.get(0));
			//System.out.println(intervalList.get(0).startTime+" > "+intervalList.get(0).endTime);
			for(int i=1;i<intervalList.size();i++)
			{
				Interval in = stackIntervalList.pop();
				System.out.println(intervalList.get(i).startTime+" > "+intervalList.get(i).endTime);
				if(in.endTime<intervalList.get(i).startTime)
				{
					stackIntervalList.push(intervalList.get(i));
					System.out.println(intervalList.get(i).startTime+" > "+intervalList.get(i).endTime);
				}
				else if(in.endTime<intervalList.get(i).endTime)
				{
					in.endTime=intervalList.get(i).endTime;
					Interval in1 = stackIntervalList.pop();
					in1.endTime=in.endTime;
					in1.startTime=in.startTime;
					stackIntervalList.push(in1);
				}
			}
			Iterator<Interval> it = stackIntervalList.iterator();
			while(it.hasNext())
			{
				Interval inte = it.next();
				System.out.println("{"+inte.startTime+","+inte.endTime+"}");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	
	
	
}
class StartPointShorting implements Comparator<Interval>
{

	@Override
	public int compare(Interval o1, Interval o2) {
		// TODO Auto-generated method stub
		return o1.startTime-o2.startTime;
	}
	
}
class Interval
{
	int startTime;
	int endTime;
	public Interval(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

}