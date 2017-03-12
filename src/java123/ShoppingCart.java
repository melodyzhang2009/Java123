/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java123;

/**
 *
 * @author Melody
 */
public class ShoppingCart {
    Node first;
    Node last;
    int size;
    
    
    public static class Node{
        String value;
        int quantity;
        Node next;
        Node previous;
        
        public Node(String data){
            this(data, 1);
        }
        
        public Node(String data, int quantity){
            this.value = data;
            this.quantity = quantity;
        }
       
        
    }
    
    public void deleteItem(Node node){
       
            if (node.previous != null) {
                node.previous.next = node.next;
            } else {
                first = node.next; 
            }
            if (node.next != null) {
                node.next.previous = node.previous;
            } else {
                last = node.previous;
            }
        
        size--;
        node.previous = null;
        node.next = null;
    }
    

    public void addItem(String data, int quantity){
        insertFirst(data, quantity);   
        
    }
    
    public void updateQuantity(Node node,int newQuantity){
        node.quantity = newQuantity;
    }
    
    private void insertFirst(String data, int quantity){
        if(size == 0){
            Node n1= new Node(data,quantity);
            first = last = n1;
        } else {
            Node n1 = new Node(data,quantity);
            first.previous = n1;
            n1.next = first;
            first = n1;
        }                    
        size++;
    }


    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Node n = new Node("kindle");
        cart.addItem("kindle", 1);
    }
    
}
