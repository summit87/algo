/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyMap;

import MyMap.MapEntry.SMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author SUMIT
 */
public class MapEntry {
    
    public static final int MAX_SIZE = 16;
    private SMap map[] = new SMap[MAX_SIZE];
    class SMap
    {
        final String key;
        String value;
        SMap next;
        public SMap(String key,String value)
        {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        public String getKey()
        {
            return key;
        }
    }
    
    public SMap get(String key)
    {
        int size = key.hashCode()%MAX_SIZE;
        System.out.println("Current Key > "+size+" > "+key.hashCode()); 
        SMap mapa = map[size];
        while(mapa!=null)
        {
            if(mapa.key.equals(key))
            {
                return mapa;
            }
            mapa = mapa.next;
        }
        return null;
    }
    
    public void put(String key,String value) 
    {
        int size = key.hashCode()% MAX_SIZE;
        System.out.println("Value Key > "+size+" > "+ key.hashCode()); 
        SMap smap = map[size];
        if(smap!=null)
        {
            if(smap.key.equals(key)) 
            {
                smap.value = value;
            }
            else
            {
                while(smap.next!=null)
                {
                    smap = smap.next;
                }
                SMap newMap = new SMap(key, value);
                smap.next = newMap;
            }
        }
        else
        {
            SMap newMap = new SMap(key, value);
            map[size] = newMap;
        }
    }
    
    public Set<String> keySet()
    {
        Set<String> key = new HashSet<String>();
        int i=0;
        while(i<map.length)
        {
            key.add(map[i].getKey());
            i++;
        }
        return key;
    }
}
