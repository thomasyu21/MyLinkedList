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
  }
}
