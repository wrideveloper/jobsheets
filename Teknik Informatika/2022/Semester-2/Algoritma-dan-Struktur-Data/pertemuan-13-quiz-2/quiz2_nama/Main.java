/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2_nama;

public class Main {
    public static void main(String[] args){
        SingleLinkedList dll = new SingleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        //continue to call addLast, deleteLast, 
        
        //merge, split,
        
    } 
    //2.A.
    public static void merge(SingleLinkedList l1, SingleLinkedList l2){
        //complete this method
        
    }
    //2.B. this will split sll to be 2 sll
    public static void split(SingleLinkedList l){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //1-> 2,3,4,34
        //2-> 2,3,45,4
        
    }
}
