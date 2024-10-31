package com.gul.java8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 
public class SerializationExample {

	public static void main(String[] args) {
		        // Create a new Person object
		        Person person = new Person("Alice", 30);

		        // Serialize the object
		        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
		            out.writeObject(person);
		            System.out.println("Serialization successful: " + person);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        // Deserialize the object
		        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
		            Person deserializedPerson = (Person) in.readObject();
		            System.out.println("Deserialization successful: " + deserializedPerson);
		        } catch (IOException | ClassNotFoundException e) {
		            e.printStackTrace();
		        }
		    }

}

class Person implements Serializable {
	    private static final long serialVersionUID = 1L; // Recommended for Serializable classes
	    private String name;
	    private int age;

	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + '}';
	    }
	}
