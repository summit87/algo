package com.mypractice.org.shorting;

public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*      8
		 * 	   888
		 *    88888	
		 *     888
		 *      8
		 * */
		int n=6;
		int j=5;
		for(int i=1;i<=n;i++)
			{
				for(int l=1;l<=n-i;l++)
				{
					System.out.print("  ");
				}
				for(int k=2*i-1;k>0;k-- )
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		n--;
		int o=1;
		for(int i=1;i<=n;i++)
		{
			for(int l=1;l<=o;l++)
			{
				System.out.print(" ");
			}
			o=o+2;
			for(int k=2*n-i;k>=i;k--)
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
//		for(int i=0;i<4;i++)
//		{
//			for(int j=i;j<4;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
