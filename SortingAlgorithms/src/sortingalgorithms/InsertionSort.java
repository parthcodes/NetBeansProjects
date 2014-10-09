/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortingalgorithms;

/**
 *
 * @author Parth
 */
public class InsertionSort {
    public static void main(String []args){
        int[]a = {5,4,3,2,1};//This is the sample input.
        int i=0,j=0,key=0;
        
        for(j=1;j<a.length;j++){
            i=j-1;
            key = a[j];
             while(i>=0 && a[i]>key){ // check if i is greater than or equal to 0 then only check a[i]>key
                     a[i+1]=a[i];
                     i--;
             }
             a[i+1]= key;
        }
        
        for(i=0;i<a.length;i++)//display the output
        System.out.println(a[i]);
    }
}


