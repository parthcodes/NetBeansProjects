/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scjp_samples;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Parth
 */
public class MultiThreadingSample {
    
    public static void main(String[] args){
        
        RunCheck r = new RunCheck();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("Parth");
        t2.setName("Setu");
        t3.setName("Devu");
        
        t1.start();
        t2.start();
        t3.start();

        
        
    }
}

class RunCheck implements Runnable{
   
    @Override
    public void run(){
        
        for(int i=0;i<10;i++){
            
            if(i%10 !=0){
                System.out.println(Thread.currentThread().getName() + "remainders");
            }
            else{
                try {
                    System.out.println("went to sleep"+Thread.currentThread().getName());
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RunCheck.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
}