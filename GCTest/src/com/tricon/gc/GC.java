package com.tricon.gc;
import java.util.HashMap;
import java.util.Map;

public class GC {
    private static Map<Integer,Object> aMap = new HashMap<Integer,Object>();
    public static void createGCOverhead(){ 
        int i = 0;    
        try{
        while (true) {            
            aMap.put(i, new Object() );    
            System.out.println("Total Items "+i++);
        }
        }catch(Throwable e){
            System.err.println("\nError after adding "+ aMap.size()+" items"); 
            e.printStackTrace();
        }
    }
}
