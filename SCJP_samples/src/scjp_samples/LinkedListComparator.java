/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scjp_samples;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Parth
 */
public class LinkedListComparator {
    
    public static void main(String[] args){
        
        LinkedList<Company> c = new LinkedList<Company>();
        c.add(new Company("patel", 12334));
        c.add(new Company("parth", 300));
        c.add(new Company("Popat", 43));
        c.add(new Company("Krunal", 14));
        
        SortSalary s = new SortSalary();
        Collections.sort(c, s);
        
        for(Company cr: c){
            System.out.println(cr.salary);
        }
    }
}
class SortSalary implements Comparator<Company>{

    @Override
    public int compare(Company o1, Company o2) {
        if(o1.salary>o2.salary){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}

class Company{
    String name;
    int salary;
    Company(String n, int s){
        name = n;
        salary = s;
    }
    public int getSalary(){
        return this.salary;
    }
}
