package quiz2_nama;

public class SingleLinkedList {
    Node head, tail;
    int size;
    
    SingleLinkedList(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head = nu;
        }
        size++;
    } 
    void deleteFirst(){
        Node tmp = head.n;
        head = head.n;
        tmp = null;
        size--;
    }
    void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(""+tmp.data+"-");
            tmp = tmp.n;
        }
        System.out.println("");
    } 
    //1.A. complete the missing code addLast
    /**
     * this method will add new node at the last
     */
    void addLast(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
           //complete here
           
        }
        size++;
    }
    //1.B. complete the deleteLast
    /**
     * this method will remove tail
     */
    void deleteLast(){
        
    }
}
