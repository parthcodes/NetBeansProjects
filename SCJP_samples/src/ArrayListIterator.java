
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth
 */
class Pappu{
    String pName;
    Pappu(String name){
        pName = name;
    }
}
public class ArrayListIterator {
    
    public static void main(String[] args){
        
        ArrayList<Pappu> p = new ArrayList<>();//create ArrayList with 3 new pappus.
        p.add(new Pappu("Rahul Gandhi"));
        p.add(new Pappu("bhutto"));
        p.add(new Pappu("manmohan"));
        
        //create an Iterator with reference to p Arraylist
        
        Iterator<Pappu> i = p.iterator();
        while(i.hasNext()){
            System.out.println(i.next().pName);
        }
        i.remove();
        System.out.println(p.size());
       
        Object[] test = p.toArray();
        for(Object t : test){
            System.out.println(((Pappu)t).pName);
        }
    }
}
