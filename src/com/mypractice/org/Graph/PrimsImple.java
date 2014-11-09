package com.mypractice.org.Graph;

import java.util.Scanner;



public class PrimsImple {

	
	private int[] key;
	private int[] parent;
	private boolean[] settled;
	private boolean[] unsettled;
	private int[][] adjMattrix;
	private int INFINITE=999;
	private int numberOfVertices;
	public PrimsImple(int numberOfVertices)
	{
		this.numberOfVertices = numberOfVertices;
		key=new int[numberOfVertices+1];
		parent = new int[numberOfVertices+1];
		settled=new boolean[numberOfVertices+1];
		unsettled = new boolean[numberOfVertices+1];
		adjMattrix = new int[numberOfVertices+1][numberOfVertices+1];
	}
	
	
	
	private int getUnsetVertex(boolean[] unsetVertex)
	{
		int c=0;
		for(int i=0;i<unsetVertex.length;i++)
		{
			if(unsetVertex[i])
			{
				c++;
			}
		}
		return c;
	}
	
	private void primsAlgo(int[][] adjMattrix)
	{
		try
		{
			System.out.println("HI...");
			for(int i=1;i<=numberOfVertices;i++)
			{
				for(int j=1;j<=numberOfVertices;j++)
				{
					this.adjMattrix[i][j]=adjMattrix[i][j];
				}
			}
			for(int i=1;i<=numberOfVertices;i++)
			{
				key[i]=INFINITE;
			}
			
			key[1]=0;
			parent[1]=1;
			unsettled[1]=true;
			while(getUnsetVertex(unsettled)!=0)
			{
				int m = getMinimumWeightVertex(unsettled);
				unsettled[m]=false;
				settled[m]=true;
				evaluateNebhours(m);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	private int getMinimumWeightVertex(boolean[] unsetVertex)
	{
		int min=INFINITE;
		int minIndex=0;
		int m=0;
		for(int i=1;i<=numberOfVertices;i++)
		{
			if(unsetVertex[i]==true && key[i]<min)
			{
				min=key[i];
				m=i;// Assigning vertex index value for minimum weight value
			}
		}
		return m;
	}
	
	
	private void evaluateNebhours(int minIndex)
	{
		for(int i=1;i<=numberOfVertices;i++)
		{
			if(settled[i]==false)
			{
				if(adjMattrix[minIndex][i]!=INFINITE)
				{
					if(adjMattrix[minIndex][i]<key[i])
					{
						key[i] = adjMattrix[minIndex][i];
						parent[i]=minIndex;
					}
					unsettled[i]=true;
				}
			}
		}
	}
	
	public void printMST()
    {
        System.out.println("SOURCE  : DESTINATION = WEIGHT");
        for (int vertex = 2; vertex <= numberOfVertices; vertex++)
        {
            System.out.println(parent[vertex] + "\t:\t" + vertex +"\t=\t"+ adjMattrix[parent[vertex]][vertex]);
        }
    }
	
	
	
	public static void main(String[] args)
	{
		try
		{
			int INFINITE=999;
			
			int[][] adj;
			int numberOfVertices;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The number of vertices");
			numberOfVertices = sc.nextInt();
			adj = new int[numberOfVertices+1][numberOfVertices+1];
			System.out.println("Eneter the graph mattrix");
			for(int i=1;i<=numberOfVertices;i++)
			{
				for(int j=1;j<=numberOfVertices;j++)
				{
					adj[i][j] = sc.nextInt();
					if(i==j)
					{
						adj[i][j]=0;
						System.out.println("i-->"+i+"--j--->"+j);
						continue;
					}
					if(adj[i][j]==0)
					{
						adj[i][j]=INFINITE;
					}
				}
			}
			sc.close();
			/*        2    3
			      (0)--(1)--(2)
			       |   / \   |
			      6| 8/   \5 |7
			       | /     \ |
			      (3)-------(4)
			*/
			/*{
			          {0, 2, 0, 6, 0},
                      {2, 0, 3, 8, 5},
                      {0, 3, 0, 0, 7},
                      {6, 8, 0, 0, 9},
                      {0, 5, 7, 9, 0},
               };
			*/
			
			PrimsImple p = new PrimsImple(numberOfVertices);
			//p.init(numberOfVertices);
			p.primsAlgo(adj);
			p.printMST();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
