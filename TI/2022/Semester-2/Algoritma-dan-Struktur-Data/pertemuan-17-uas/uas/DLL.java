

public class DLL {
    Node2P head;

    public DLL() {
        head = null;
    }
    
    //soal 1
    int[] toArray(){
       
    }

    //soal 2
    DLL sublist(int start, int end){
        
    }

    //soal 3
    void addAll(DLL list){
        
    }

    //soal 4
    boolean containsAll(DLL list){
        
    }

    //soal 5
    void removeAll(DLL list){
       
    }

    int get(int idx){
        if(idx<0||idx>=size()){
            System.out.println("Idx invalid!");
            return -1;
        }else{
            Node2P tmp = head;
            for(int i=0;i<idx;i++){
                tmp=tmp.next;
            }
            return tmp.data;
        }
    }

    void deleteByData(int data){
        Node2P tmp = head;
        while(tmp!=null){
            if(tmp.data == data){
                if(tmp.prev == null){
                    deleteFirst();
                }else if(tmp.next == null){
                    deleteLast();
                }else{
                    tmp.prev.next = tmp.next;
                    tmp.next.prev = tmp.prev;
                }
            }
            tmp = tmp.next;
        }
    }

    boolean isEmpty(){
        return head==null? true:false;
    }
    int size(){
        int n = 0;
        Node2P tmp = head;
        while (tmp!=null){
            n++;
            tmp = tmp.next;
        }
        return n;
    }
    
       void addLast(int in){
        Node2P newNode = new Node2P(in);
        if(isEmpty()){
            head = newNode;
        }else{
            Node2P tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
            newNode.prev = tmp;
        }     
    }
    
    void deleteFirst(){
        if(isEmpty()){
            System.out.println("Data kosong! operasi deleteFirst gagal!");
        }else if(size()==1){
            head=null;
        }else{
            Node2P del = head;
            head.next.prev = null;
            head = head.next;
            del = null;
        }
    }
    void deleteLast(){
        if(isEmpty()){
            System.out.println("Data kosong! Operasi deleteLast gagal!");
        }else if(size()==1){
            head=null;
        }else{
            Node2P tmp = head;
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.prev.next = null;
            tmp.prev = null;
            tmp = null;
        }
    }
    
    void print(){
        if(isEmpty()){
            System.out.println("Data kosong! Operasi print gagal");
        }else{
            Node2P tmp = head;
            while(tmp!=null){
                System.out.print(""+tmp.data);
                if(tmp.next!=null)
                    System.out.print("-");
                tmp=tmp.next;
            }
            System.out.println("");
        }
    }
}
