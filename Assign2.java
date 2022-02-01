package day4;

import java.util.ArrayList;
import java.util.Collections;
	 
	public class Assign2 {

		public static void main(String[] args)
		    {
		        // Declaring arraylist without any initial size
		        ArrayList<Integer> arrayli = new ArrayList<Integer>();
		 
		        // Appending elements at the end of the list
		        arrayli.add(9);
		        arrayli.add(11);
		        arrayli.add(55);
		        arrayli.add(45);
		        arrayli.add(78);
		        arrayli.add(45);
		        arrayli.add(91);
		        arrayli.add(42);
		        System.out.print("Elements before reversing: ");
		        System.out.println(arrayli);
		
		        Collections.reverse(arrayli);
		        System.out.print("\nElements after reversing: ");
		        System.out.println(arrayli);
		    }
		 
		    // Iterate through all the elements and print
		    public static void printElements(ArrayList<Integer> alist)
		    {
		        for (int i = 0; i < alist.size(); i++) {
		            System.out.print(alist.get(i) + " ");
		        }
		    }
		}

