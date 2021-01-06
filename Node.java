public class Node{
  public Node(String value){
    data = value;
    next = null;
    prev = null;
  }
  private String data;
  private Node next,prev;

  public String getData(){
    return data;
  }

  public Node getNext(){
    return next;
  }

  public Node getPrev(){
    return prev;
  }

  public void setData(String newValue){
    data = newValue;
  }

  public void setNext(Node newNext){
    next = newNext;
  }

  public void setPrev(Node newPrev){
    prev = newPrev;
  }
}
