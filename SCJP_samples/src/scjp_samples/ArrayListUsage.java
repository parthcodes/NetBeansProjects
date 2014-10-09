/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scjp_samples;
import java.util.*;

/**
 *
 * @author Parth
 */
public class ArrayListUsage {
    
    public static void main(String[] args){
        
        ArrayList<String> stringList = new ArrayList<String>();
                
        stringList.add("Parth");
        stringList.add("arth");
        stringList.add("patelparth");
        stringList.add("siddharth");
        stringList.add("devilal");
        
        Collections.sort(stringList);
        
        System.out.println(stringList);
       }
}
