package com.mypractice.org.Graph;

import java.awt.font.NumericShaper;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Discarder;

public class DijkstraAlgo {

	private int numberOfVertices;
	private boolean[] settled;
	private boolean[] unsettled;
	private int[][] adjMattrix;
	private int[] weight;
	private int INFINITY=999;
	private int source;
	
	public DijkstraAlgo(int numberOfVertices,int source)
	{
		this.numberOfVertices = numberOfVertices;
		this.source = source;
		this.settled = new boolean[numberOfVertices+1];
		this.unsettled = new boolean[numberOfVertices+1];
		this.adjMattrix = new int[numberOfVertices+1][numberOfVertices+1];
		this.weight = new int[numberOfVertices+1];
	}
	
	
	private void initWeight()
	{
		for(int i=1;i<=numberOfVertices;i++)
		{
			weight[i]=INFINITY;
		}
	}
	
	
	private int getUnsettledVertex(boolean[] unset)
	{
		int c=0;
		for(int i=1;i<=numberOfVertices;i++)
		{
			if(unset[i])
			{
				c++;
			}
		}
		return c;
	}
	
	private void impleDijkstraAlgoritham(int[][] adjMattrix,int source)
	{
		try
		{
			for(int i=1;i<=numberOfVertices;i++)
			{
				for(int j=0;j<numberOfVertices;j++)
				{
					this.adjMattrix[i][j]=adjMattrix[numberOfVertices+1][numberOfVertices+1];
				}
			}
			initWeight();
			unsettled[source]=true;
			weight[source]=0;
			while(getUnsettledVertex(unsettled)!=0)
			{
				int vertexIndex = getVertexIndexForMinimumWeight(unsettled);
				unsettled[vertexIndex]=false;
				settled[vertexIndex]=true;
				computeWeightOfVertex(vertexIndex);
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	private void computeWeightOfVertex(int minIndex)
	{
		try
		{
			int editDistance=0;
			int newDistnace=0;
			for(int i=1;i<=numberOfVertices;i++)
			{
				if(!settled[i]&&adjMattrix[minIndex][i]!=INFINITY)
				{
					editDistance=adjMattrix[minIndex][i];
					newDistnace = editDistance+weight[minIndex];
					if(newDistnace<=weight[i])
					{
						weight[i]=newDistnace;
					}
					unsettled[i]=true;
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	private int getVertexIndexForMinimumWeight(boolean[] unset)
	{
		int minIndex=0;
		try
		{
			int min=weight[0];
			for(int i=1;i<=numberOfVertices;i++)
			{
				if(unset[i] && weight[i]<=min)
				{
					min=weight[i];
					minIndex=i;
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return minIndex;
	}
	
	
	public static void main(String[] args)
	{
		try
		{
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
