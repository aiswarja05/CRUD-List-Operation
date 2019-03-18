package CRUD;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class Testing {

	@Test
	public void test() throws IOException {
		Employee E1=new Employee("Joye","Manager","Abc","12000");
		
		Employee E2=new Employee("Aiswarja","Accountant","Naztech","15000");
	
		Employee E3=new Employee("Saha","Developer","Tech","17000");
	
		Employee E4=new Employee("Rimi","Developer","Technoheaven","13000");
		
		ArrayList<Employee> L1=new ArrayList<Employee>();
		ArrayList<Employee> L2=new ArrayList<Employee>();
		L1.add(E1);
		L1.add(E2);
		L2.add(E3);
		L2.add(E4);
		//switch
		Operations p=new Operations(); 
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/aiswarja.saha/Desktop/File/Records.txt")); 
		String i;
		i=br.readLine();
		
		
		p.add(L1);
		p.add(L2);
		BufferedReader tr = new BufferedReader(new FileReader("C:/Users/aiswarja.saha/Desktop/File/Records.txt"));
	    String vt; 
	    vt = tr.readLine();
	    	
	    	assertNotEquals(i,vt);
	    
		assertEquals("Present",p.Search());
		
		
	}

}
