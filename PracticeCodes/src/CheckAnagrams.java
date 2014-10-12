
import java.util.ArrayList;
import java.util.Arrays;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth
 */
public class CheckAnagrams {
    
    public static void main(String args[]){
        String s = new String("pappu");
        String s1 = new String("paupp");
        
        if(s.length()==s1.length()){
            char[]sc = s.toCharArray();
            char[] s1c = s1.toCharArray();
            Arrays.sort(sc);
            Arrays.sort(s1c);
            if(sc[4]==s1c[4]){
                System.out.println("true");
            }
            else{
                System.out.println("true false");
            }
        }
        else
            System.out.println("false");
        
    }
}
