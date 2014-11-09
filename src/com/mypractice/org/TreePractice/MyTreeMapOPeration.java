package com.mypractice.org.TreePractice;

public class MyTreeMapOPeration {
    
    MyTreeMap treeMap;
    public void putItem(int key,int value)
    {
	try
	{
	    MyTreeMap myMap = new MyTreeMap(key,value,null,null);
	    if(treeMap==null)
	    {
		treeMap = myMap;
	    }
	    else
	    {
		MyTreeMap currentMap = treeMap;
		MyTreeMap parentNode;
		while(true)
		{
		    parentNode=currentMap;
		    if(key<currentMap.getKey())
		    {
			currentMap = currentMap.getLeftChild();
			if(currentMap==null)
			{
			    parentNode.setLeftChild(myMap);
			    break;
			}
		    }
		    else if(key>currentMap.getKey())
		    {
			currentMap = currentMap.getRightChild();
			if(currentMap==null)
			{
			    parentNode.setRightChild(myMap);
			    break;
			}
		    }
		    else
		    {
			currentMap.setValue(value);
			parentNode = currentMap;
			break;
		    }
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    public void printKey(MyTreeMap myTreeMap)
    {
	if(myTreeMap!=null)
	{
	    printKey(myTreeMap.getLeftChild());
	    System.out.print(myTreeMap.getKey()+",");
	    printKey(myTreeMap.getRightChild());
	}
    }

    
    public int findValue(int key)
    {
	try
	{
	    MyTreeMap currentTreeMap = treeMap;
	    while(currentTreeMap.getKey()!=key)
	    {
		if(key<currentTreeMap.getKey())
		{
		    currentTreeMap = currentTreeMap.getLeftChild();
		}
		else
		{
		    currentTreeMap = currentTreeMap.getRightChild();
		}
		
		if(currentTreeMap==null)
		{
		    return Integer.MAX_VALUE;
		}
	    }
	    return currentTreeMap.getValue();
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return Integer.MAX_VALUE;
    }
    
    
    
    
    
    
    

    public MyTreeMap getTreeMap() {
        return treeMap;
    }


    public void setTreeMap(MyTreeMap treeMap) {
        this.treeMap = treeMap;
    }
    
    
    
    
    
    
    
    
    
    
}
