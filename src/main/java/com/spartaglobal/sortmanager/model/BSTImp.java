package com.spartaglobal.sortmanager.model;

import org.w3c.dom.Node;

public class BSTImp {
    class Node {
        //stores information about the node and info on what its child nodes are
        int value;
        Node left;
        Node right;
        int count;
        // constructor for when a new node is added to the tree
        Node (int value){
            this.value = value;
            this.count = 1;
            right = null;
            left = null;
        }
    }
    Node root;
    BSTImp(){
        root = null;
    }
    private Node populateTree(Node current, int value){
        // if the node we are on is null, it changes the node to the current value we are checking
        if (current == null){
            return new Node(value);
        }
        //count duplicate values
        if (current.value  == value){
            current.count += 1;
            return current;
        }

        if(current.value < value){
            current.left = populateTree(current.left, value);
        }
        else if(value > current.value){
            current.right =    populateTree(current.right, value);
        }
        return current;
    }
    public void add(int value){
        root = populateTree(root, value);
    }

    public void inOrderArray(Node root){
        if (root != null){
             inOrderArray(root.left);
             if(root.count >1){
                 for (int i = 0; i <root.count;i++){
                     System.out.println(root.value + " ");
                 }
             }
             else{
                 System.out.printf(root.value + " ");
                 inOrderArray(root.right);
             }

        }
    }
    public void treeIn(int arr[]){
        for(int i = 0; i<arr.length; i++){
           add(arr[i]);
        }
    }

}
