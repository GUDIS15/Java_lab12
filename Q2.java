package LAB12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Q2 {
	public static void main(String a[]){
	    ListIterator<String> litr = null;
	    List<String> Books = new ArrayList<String>();
	    Books.add("Book1");
	    Books.add("Book2");
	    Books.add("Book3");
	    Books.add("Book4");
	    Books.add("Book5");
	    //Obtaining list iterator
	    litr=Books.listIterator();
	 
	    System.out.println("Traversing the list in forward direction:");
	    while(litr.hasNext()){
	       System.out.println(litr.next());
	    }
	    System.out.println("\nTraversing the list in backward direction:");
	    while(litr.hasPrevious()){
	       System.out.println(litr.previous());
	    }
	  }

}
