/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyMap;

/**
 *
 * @author SUMIT
 */
public class MapImple {
 
    public static void main(String[] args)
    {
        try
        {
            MapEntry map = new MapEntry();
            map.put("1", "HI");
            map.put("2", "HI2");
            map.put("3", "HI3");
            map.put("4", "HI4");
            map.put("5", "HI5");
            System.out.println(map.get("5").getValue()); 
            System.out.println(map.keySet());
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
