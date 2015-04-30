
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth
 */
public class TotalPalindromes {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String inputString = sc.nextLine();
        
        int total = totalPalindromes(inputString.toCharArray());
        System.out.println(total);
    }

    public static int totalPalindromes(char[] str ) {
        //add palindromes that starts at
        
        int i,j,k,count=0;
	
        for(i=0;i<str.length-1;i++){
		k=i-1;j=i+1;  //count odd length palindromes
		while(k>=0 && j<str.length-1 && str[k]==str[j])
		{
			++count;
			k--;j++;
		}

		k=i;j=i+1; //count even length palindrome
		while(k>=0 && j<str.length-1 && str[k]==str[j])
		{
			++count;
			k--;j++;
		}
        }
	
	return count;

    }
    
    
}
