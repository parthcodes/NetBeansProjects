/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth
 */
public class ReplaceSpaces {
    public static void main(String[] args){
        String s = new String("parth patel is the software eng.");
        char[] c = s.toCharArray();
        
        doReplace(c);
    }
    
    public static void doReplace(char[] str){
        
        int length = str.length;
        int space=0;
        int n=0;
        for(int i=0;i<length;i++){
            if(str[i]== ' '){
                space++;
            }
           
        }
        
        char[] ch = new char[length+(3*space)];
        for(int i=0 ;i<length; i++){
            
            if(str[i]!=' '){
                ch[n]=str[i];
                n++;
            }
            else{
                ch[n++]='%';
                ch[n++]='2';
                ch[n++]='0';
            }
            
        }
        for(int i=0;i<46;i++)
        System.out.print(ch[i]);
    }   
    
}
