package com.mypractice.org.TreePractice;

public class MyTreeImpl {

    /**
     * @param args
     */
    public static void main(String[] args) {


	try
	{
	    MyTreeMapOPeration m = new MyTreeMapOPeration();
	    m.putItem(1,1221);
	    m.putItem(3,223);
	    m.putItem(11,121);
	    m.putItem(10,112);
	    m.putItem(10,113);
	    m.putItem(3,23);
	    m.putItem(11,122);
	    m.printKey(m.getTreeMap());
	    int mt = m.findValue(10);
	    System.out.println("\n>>"+mt);
	    
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

}
