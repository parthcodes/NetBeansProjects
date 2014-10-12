/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scjp_samples;

/**
 *
 * @author Parth
 */
public class HashCode {
    
    public static void main(String[] args){
        
        Integer i=new Integer(5);
        Integer f = new Integer("5");
        HashCode h = new HashCode();
        System.out.println(h.hashCode());
        
        //equality test.
       
        
        if(i.equals(i)){
            System.out.println("equal true");
        }
        else{
            System.out.println("equal false");
        }
        
    }
}
