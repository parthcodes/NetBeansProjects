/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth
 */
public class ErrorCheck {
    
    public static void main(String []args){
        
        doSomething();
    }
    
    static void doSomething(){
        
        try{
            throw new Error();
        }
        catch(Error e){
            System.out.println("This error was cought !!" +e);
        }
    }
}
