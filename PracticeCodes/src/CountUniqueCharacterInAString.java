
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth
 */
public class CountUniqueCharacterInAString {
    
    public static void main(String[] args){
        
        HashMap<Character,Integer> map= new HashMap<Character, Integer>();
        
        String s = new String("pparrppatel");
        char[] c = s.toCharArray();
        
        for(int i=0 ;i<c.length;i++){
            
            Integer value;
            value = map.get((Character)c[i]);
            
            if(value!= null){
                map.put((Character)c[i], value+1);
            }
            else{
                map.put((Character)c[i], 1);
            }
            
        }
       
        System.out.println(map);
    }
}
