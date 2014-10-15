/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scjp_samples;

import java.util.TreeMap;

/**
 *
 * @author Parth
 */
public class TreeMapCheck {
    
    public static void main(String[] args){
        
        TreeMap<String,String> t= new TreeMap<String,String>();
        t.put("z", "Zebra");
        t.put("d", "Dog");
        t.put("a", "apple");
        
        System.out.println(t);
    }
}
