public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
   size = 0;
   start = null;
   end = null;
 }

 public int size(){
   return size;
 }

 public boolean add(String value){
   Node n = new Node(value);
   if (size == 0){
     start = n;
     end = n;
   }else{
     end.setNext(n);
     end = n;
   }
   size++;
   return true;
 }

 public void add(int index, String value){
   Node n = new Node(value);
   if (index == 0 && size == 0){
     start = n;
     end = n;
   }else if (index == 0){
     n.setNext(start);
     start.setPrev(n);
     start = n;
   }else if (index == size){
     n.setPrev(end);
     end.setNext(n);
     end = n;
   }else{
     int count = 0;
     Node current = start;
     while (count < index){
       current = current.getNext();
     }
     n.setNext(current.getNext());
     (current.getNext()).setPrev(n);
     current.setNext(n);
     n.setPrev(current);
     size++;
   }
 }

}
