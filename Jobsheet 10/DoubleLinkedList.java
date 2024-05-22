public class DoubleLinkedList {
    Node09 head;
    Node09 tail;

    public boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if(!isEmpty()){
            System.out.print("Isi linked list: ");
            Node09 currentNode09 = head;

            while(currentNode09 != null){
                System.out.print(currentNode09.data + "\t");
                currentNode09 = currentNode09.next;
            }

            System.out.println("");
        }else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input){
        Node09 newNode09 = new Node09(input);

        if(isEmpty()){
            head = newNode09;
            tail = newNode09;
        }else{
            newNode09.next = head;
            head.prev = newNode09;
            head = newNode09;
        }
    }

    public void addLast(int input){
        Node09 newNode09 = new Node09(input);

        if (isEmpty()){
            head = newNode09;
            tail = newNode09;
        } else {
           tail.next = newNode09;
           newNode09.prev = tail;
           tail = newNode09;
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked list kosong");
        }else if(head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list kosong");
        }else if (head == tail){
            head = null;
            tail = null;
        }else {
          tail = tail.prev;
          tail.next = null;
        }
    }

    public int getData(int index){
        Node09 currentNode09 = head;
        
        for (int i=0; i< index; i++){
            if(currentNode09 == null){
                return -1;
            }
            currentNode09 = currentNode09.next;
        }
        
        return currentNode09.data;
    }

    public int indexOf(int key){
        Node09 currentNode09 = head;
        int index =0;
        
        while(currentNode09 != null && currentNode09.data !=key){
            currentNode09 = currentNode09.next;
            index++;
        }

        if(currentNode09==null){
            return -1;
        }else {
            return index;
        }
    }

    
    public void reservePrint() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node09 currentNode09 = tail; // Mulai dari node09 terakhir (tail)
            while (currentNode09 != null) {
                System.out.print(currentNode09.data + " "); // Cetak data dari currentNode09
                currentNode09 = currentNode09.prev; // Pindah ke node09 sebelumnya (prev)
            }
            System.out.println();
        }
    }

    //Tugas
    public void insertAfter(int key, int input){
        Node09 newNode09 = new Node09(input);

        if(!isEmpty()){
            Node09 currentNode09 = head;

            do{
                if (currentNode09.data == key){
                    if (currentNode09 == tail){
                        addLast(input);
                    }else {
                        newNode09.next = currentNode09.next;
                        currentNode09.next.prev = newNode09;
                        currentNode09.next = newNode09;
                        newNode09.prev = currentNode09;
                    }
                    
                    break;
                }

                currentNode09 = currentNode09.next;
            }while (currentNode09 != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }
}
