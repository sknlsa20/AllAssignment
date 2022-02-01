package day4;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment {

	    public static void main(String args[])
	    {
	  
	        // Get the ArrayList
	        ArrayList<String> list = new ArrayList<String>();
	  
	        list.add("Green");
	        list.add("red");
	        list.add("Blue");
	        list.add("White");
	        list.add("Orange");
	        list.add("yellow");
	        list.add("black");
	        list.add("brown");
	  
	        
	        System.out.println("Unsorted ArrayList: " + list);
	  
	        // Sorting ArrayList in descending Order
	        // using Collection.sort() method
	        // by passing Collections.reverseOrder() as comparator
	        Collections.sort(list, Collections.reverseOrder());
	  
	        // Print the sorted ArrayList
	        System.out.println("in Descending order : " + list);
	    }
	}
	

