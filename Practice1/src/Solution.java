import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isValid(String s){
        // Complete this function
        
    	Map<Character,Integer> m=new HashMap<Character,Integer>();
        for (int i=0;i<s.length();i++){
            
            
            if (m.containsKey(s.charAt(i))){
            	m.put(s.charAt(i),m.get(s.charAt(i))+1 );
            }
            else {
            	m.put(s.charAt(i),1 );
            }
            	
        }
        
         Iterator<Entry<Character, Integer>> it = m.entrySet().iterator();
         
         Map.Entry pair = (Map.Entry)it.next();
         int max= (int) pair.getValue();
         int temp=0;
         boolean unequal=false;
         boolean diff1=false;
         int count=0;
         
        while (it.hasNext()) {
             pair = (Map.Entry)it.next();
            
            temp=(int) pair.getValue();
            
            
            if(max!=temp && (Math.abs(max-temp))==1)
            {
            	            	
            	count++;
            	unequal=true;
            	diff1=true;
            }
            else if((max!=temp)&& (Math.abs(max-temp))!=1)
            {
            
           // System.out.println(pair.getKey() + " = " + pair.getValue());
            
            s= "NO";
            
            return s;
        	}
        
        }
        if( diff1==false ||(diff1==true && count==1))
        {
        	return "YES";
        }
        
        
		return "NO";
        
		
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
