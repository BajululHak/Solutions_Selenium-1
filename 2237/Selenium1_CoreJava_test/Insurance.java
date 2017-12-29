package com.htc.corejava.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Insurance {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
 
	        Person person = new Person("Bajulul",36,"Chicago","Health",300.00);
	        String filename = "file.ser";
	         
	        try
	        {   
	            FileOutputStream file = new FileOutputStream(filename);
	            ObjectOutputStream out = new ObjectOutputStream(file);
	             
	            out.writeObject(person);
	             
	            out.close();
	            file.close();
	             
	            System.out.println("Person has been serialized");
	 
	        }
	         
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	 
	 
	        Person personOne = null;
	 

	        try
	        {   
	            
	            FileInputStream file = new FileInputStream(filename);
	            ObjectInputStream in = new ObjectInputStream(file);

	            personOne = (Person)in.readObject();
	             
	            in.close();
	            file.close();
	             
	            System.out.println("Person has been deserialized ");
	
	        }
	         
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	         
	        catch(ClassNotFoundException ex)
	        {
	            System.out.println("ClassNotFoundException is caught");
	        }
	 
	    }
}
