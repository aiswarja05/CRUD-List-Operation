package CRUD;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Operations implements Information{
	
	public String add(ArrayList<Employee> l1) {
		 String path ="C:/Users/aiswarja.saha/Desktop/File/Records.txt";
		 File file =new File(path);
		 
		 file.mkdir();
		 String st = null; 
		 String path1 = file.getAbsolutePath();
		 
		// System.out.println(path1);
		 
		 FileWriter textFile;
		try {
			textFile = new FileWriter(path1,true);
			 BufferedWriter bw = new BufferedWriter(textFile);
			 int size = l1.size();
	        for (int i=0;i<size;i++) {
			 String str = l1.get(i).toString();
			 bw.write(str);
		        }
	         bw.close();

			 
			 //read
	         BufferedReader br = new BufferedReader(new FileReader("C:/Users/aiswarja.saha/Desktop/File/Records.txt")); 
	 	    
	 	   
	 	    while ((st = br.readLine()) != null) {
	 	    	return st;
	 	    }
			    
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	
      return st;
		 
				   
	}
	
	public String Remove() {
		
		return null;
	}

	public String Search() {
		 
	 try {
	    	  BufferedReader br = new BufferedReader(new FileReader("C:/Users/aiswarja.saha/Desktop/File/Records.txt")); 
	 		 String s;
	 		 String[] words=null;
	 		 String search="designation=Manager,";
	 		 int count=0; 
			while(( s=br.readLine())!=null)   //Reading Content from the file
			  {
			     words=s.split(" ");  //Split the word using space
			      for (String word : words) 
			      {
			             if (word.equals(search))   //Search for the given word
			             {
			               count++; 
			             }
			      }
			                                         }
			if(count>=1) 
		      {
		         return "Present";
		      }
		      else
		      {
		    	  return "Not Present";
		      }
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			return null;
	
	      
	   }
	

	public String Update() {


		return null;
		 
	
	}


}
