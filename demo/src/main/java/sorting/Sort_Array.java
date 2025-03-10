package sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class Sort_Array {

    public int[] array = {};

    // Constructor: reads an input file that contains an array
    public Sort_Array(String filename) throws IOException {
    	
    	try {
    		  String data = null;
    	      File myObj = new File(filename);
    	      Scanner myReader = new Scanner(myObj);
    	      while (myReader.hasNextLine()) {
    	        data = myReader.nextLine();
    	        System.out.println(data);
    	      }
    	      myReader.close();
    	      
    	      if (data != null) {
    	            String[] parts = data.split(",");
    	            array = new int[parts.length];
    	            for (int i = 0; i < parts.length; i++) {
    	                array[i] = Integer.parseInt(parts[i].trim());
    	            }
    	       }
    	    } catch (FileNotFoundException e) {
    	      System.out.println("An error occurred.");
    	      e.printStackTrace();
    	}
        
        
    
    }
}
