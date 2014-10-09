/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scjp_samples;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Parth
 */
public class PrintLastKLines {
    
    public static void main(String[] args) throws IOException{
        String temp;
        FileReader f = null;
        try {
            f = new FileReader("/Users/Parth/NetBeansProjects/SCJP_samples/src/scjp_samples/sample.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrintLastKLines.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(f);
        
        ArrayList<String> a = new ArrayList<>();
        
        while((temp = br.readLine())!=null){
            
            a.add(temp);
        }
        System.out.println(a);
        for(int i=a.size()-1;i>(a.size()-5);i--){
            System.out.println(a.get(i));
        }
    }
}
