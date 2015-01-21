/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth
 */
public class BinaryTrees {
    
    public static void main(String[] args){
        
        TreeOperations t = new TreeOperations();
        t.addNode(10);
        t.addNode(15);
        t.addNode(10);
        t.addNode(21);
        t.addNode(5);
        
        t.inOrdered(t.root);
        System.out.println(t.findKey(21));
        

        
    }
    
    
}
class TreeOperations{
    
    Node root;
    
    public void addNode(int key){
            Node newNode = new Node(key);

            if(root == null){
                root = newNode;
            }
            else{
                Node currentNode = root;
                Node parent; 
                while(true){
                    parent =currentNode;
                    if(key>currentNode.value){
                        currentNode= currentNode.rightChild;
                        
                        if(currentNode == null){
                            parent.rightChild = newNode;
                            return;
                        }
                    }
                    else{
                        currentNode = currentNode.leftChild;
                        if(currentNode==null){
                            parent.leftChild = newNode;
                            return;
                        }
                    }
                }
            }
    }
    
    public void inOrdered(Node currentNode){
        
        if(currentNode !=null){
            inOrdered(currentNode.leftChild);
            System.out.println(currentNode.value);
            inOrdered(currentNode.rightChild);
        }
        
    }
    public void  preOrdered(Node currentNode){
        
        if(currentNode !=null){
            System.out.println(currentNode.value);
            inOrdered(currentNode.leftChild);
            inOrdered(currentNode.rightChild);
        }
        
    }
    public void postOrdered(Node currentNode){
        
        if(currentNode !=null){
            inOrdered(currentNode.leftChild);
            inOrdered(currentNode.rightChild);
            System.out.println(currentNode.value);

        }
        
    }
    
    public boolean findKey(int key){
        Node currentNode =this.root;
        
        while(true){
            
            if(currentNode == null)return false;
            if(currentNode.value==key)return true;
            else if(key<=currentNode.value){
                currentNode = currentNode.leftChild;
                continue;
            }
            else if(key>currentNode.value){
                currentNode = currentNode.rightChild;
            }
            
        }
        
    }
}

class Node{
    
    int value;
    Node rightChild;
    Node leftChild;
    
    public Node(int value){
        this.value = value;
    }
}
