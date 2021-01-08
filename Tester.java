public class Tester{
  public static void main(String[] args){
    MyLinkedList a1 = new MyLinkedList();

    a1.add("test1");
    a1.add("test2");
    a1.add(0, "test");
    a1.add(3, "test3");

    System.out.println(a1.toString());
    System.out.println(a1.toStringReversed());

    System.out.println(a1.get(0));
    System.out.println(a1.get(1));
    System.out.println(a1.get(2));
    System.out.println(a1.get(3));

    a1.set(0, "hello");
    a1.set(1, "goodbye");
    a1.set(3, "okay");

    System.out.println(a1.toString());
    System.out.println(a1.toStringReversed());
    System.out.println();

    System.out.println("Remove from end");
    a1.remove(3);
    System.out.println(a1.toString());
    System.out.println(a1.toStringReversed());
    System.out.println();

    System.out.println("Remove from middle");
    a1.remove(1);
    System.out.println(a1.toString());
    System.out.println(a1.toStringReversed());
    System.out.println();
    System.out.println("Remove from start");
    a1.remove(0);
    System.out.println(a1.toString());
    System.out.println(a1.toStringReversed());
    System.out.println();
    System.out.println("Remove when size is 1");
    a1.remove(0);
    System.out.println(a1.toString());
    System.out.println(a1.toStringReversed());
    System.out.println();

    MyLinkedList words = new MyLinkedList();

    //add 0-9 in order
    for(int i = 0; i < 10; i++){
      words.add(i+"");
    }
    //insert 0x - 9x before each value 0-9
    for(int i = 0; i < 10; i++){
      words.add(2*i,i+"x");
    }
    //check the head/tail add
    words.add(0,"head");
    words.add(words.size(),"tail");

    try{
      words.add(-1,"");
      System.out.println("ERROR! Added to negative index");
    }catch(IndexOutOfBoundsException e){

    }

    try{
      words.add(words.size()+1,"");
      System.out.println("ERROR! Added to (size + 1) index");
    }catch(IndexOutOfBoundsException e){

    }

    System.out.println("Your result:\n"+words+" "+words.size());
    System.out.println("expected:\n[head, 0x, 0, 1x, 1, 2x, 2, 3x, 3, 4x, 4, 5x, 5, 6x, 6, 7x, 7, 8x, 8, 9x, 9, tail] 22");
    System.out.println("\nYour result:\n"+words.toStringReversed()+" "+words.size());
    System.out.println("expected:\n[tail, 9, 9x, 8, 8x, 7, 7x, 6, 6x, 5, 5x, 4, 4x, 3, 3x, 2, 2x, 1, 1x, 0, 0x, head] 22");

    MyLinkedList a = new MyLinkedList();
    MyLinkedList b = new MyLinkedList();
    for(int i = 0; i < 10; i++){
      if(i < 5){
        a.add(i+"");
      }else{
        b.add(i+"");
      }
    }
    System.out.println();
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());
    System.out.println();

    System.out.println("Extend with 2 non-empty LinkedLists");
    a.extend(b);
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());
    System.out.println("A reversed:"+a.toStringReversed()+a.size());
    System.out.println("B reversed:"+b.toStringReversed()+b.size());
    System.out.println();

    MyLinkedList c = new MyLinkedList();
    System.out.println("Extend with 1 empty and 1 non-empty LinkedLists");
    a.extend(c);
    System.out.println("A:"+a+a.size());
    System.out.println("C:"+c+c.size());
    System.out.println("A reversed:"+a.toStringReversed()+a.size());
    System.out.println("C reversed:"+c.toStringReversed()+c.size());
    System.out.println();

    c.extend(a);
    System.out.println("C:"+c+c.size());
    System.out.println("A:"+a+a.size());
    System.out.println("C reversed:"+c.toStringReversed()+c.size());
    System.out.println("A reversed:"+a.toStringReversed()+a.size());
    System.out.println();

    System.out.println("Extend with 2 empty LinkedLists");
    a.extend(b);
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());
    System.out.println("A reversed:"+a.toStringReversed()+a.size());
    System.out.println("B reversed:"+b.toStringReversed()+b.size());
  }
}
