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
     n.setPrev(end);
     end = n;
   }
   size++;
   return true;
 }

 public void add(int index, String value){
   if (index < 0 || index > size){
     throw new IndexOutOfBoundsException("Index " + index + " is out of bounds. The range is index > 0 && index <= size. The size is " + size() + ".");
   }
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
     while (count < index-1){
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
   if (index < 0 || index >= size){
     throw new IndexOutOfBoundsException("Index " + index + " is out of bounds. The range is index > 0 && index < size. The size is " + size() + ".");
   }
   int count = 0;
   Node current = start;
   while (count < index){
     current = current.getNext();
     count++;
   }
   return current.getData();
 }

  public String set(int index, String value){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds. The range is index > 0 && index < size. The size is " + size() + ".");
    }
    int count = 0;
    Node current = start;
    while (count < index){
      current = current.getNext();
      count++;
    }
    String temp = current.getData();
    current.setData(value);
    return temp;
  }

  public String remove(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds. The range is index > 0 && index < size. The size is " + size() + ".");
    }
    if (size == 1){
      String temp = start.getData();
      start = null;
      end = null;
      size--;
      return temp;
    }else if (index == size-1){
      String temp = end.getData();
      (end.getPrev()).setNext(null);
      end = end.getPrev();
      size--;
      return temp;
    }else if (index == 0){
      String temp = start.getData();
      (start.getNext()).setPrev(null);
      start = start.getNext();
      size--;
      return temp;
    }else{
      Node temp = start;
      int count = 0;
      while (count < index){
        temp = temp.getNext();
        count++;
      }
      (temp.getPrev()).setNext(temp.getNext());
      (temp.getNext()).setPrev(temp.getPrev());
      size--;
      return temp.getData();
    }
  }

  public String toString(){
    if (size == 0){
      return "[]";
    }
    String result = "[";
    Node current = start;
    while (current != null){
      result+= current.getData() + ", ";
      current = current.getNext();
    }
    return result.substring(0, result.length()-2) + "]";
  }

  public String toStringReversed(){
    if (size == 0){
      return "[]";
    }
    String result = "[";
    Node current = end;
    while (current != null){
      result+= current.getData() + ", ";
      current = current.getPrev();
    }
    return result.substring(0, result.length()-2) + "]";
  }
}
