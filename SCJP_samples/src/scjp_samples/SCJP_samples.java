/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scjp_samples;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Parth
 */
 

public class SCJP_samples {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
     String csv = "Sue,5,true,3";
    Scanner scanner = new Scanner(csv); 
    scanner.useDelimiter(",");
    String age = scanner.nextLine();
        System.out.println(age);
    }
    
   
   
}
