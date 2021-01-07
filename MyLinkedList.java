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
       count++;
     }
     n.setNext(current.getNext());
     (current.getNext()).setPrev(n);
     current.setNext(n);
     n.setPrev(current);
   }
   size++;
 }

 public String get(int index){
   int count = 0;
   Node current = start;
   while (count <= index){
     current = current.getNext();
     count++;
   }
   return current.getData();
 }

  public String set(int index, String value){
    int count = 0;
    Node current = start;
    while (count <= index){
      current = current.getNext();
      count++;
    }
    String temp = current.getData();
    current.setData(value);
    return temp;
  }

  public String toString(){
    String result = "[";
    Node current = start;
    while (current != null){
      result+= current.getData() + ", ";
      current = current.getNext();
    }
    return result.substring(0, result.length()-2) + "]";
  }

  public String toStringReverse(){
    String result = "[";
    Node current = end;
    while (current != null){
      result+= current.getData() + ", ";
      current = current.getPrev();
    }
    return result.substring(0, result.length()-2) + "]";
  }
}
