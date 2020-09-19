package q3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable{
	private int house_no;
	private String locality;
	private String city;
	private int pincode;
	
	public Address() {}
	public Address(int house_no, String locality, String city, int pincode) {
		this.house_no = house_no;
		this.locality = locality;
		this.city = city;
		this.pincode = pincode;
	}
	public int getHouse_no() {
		return house_no;
	}
	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [house_no=");
		builder.append(house_no);
		builder.append(", locality=");
		builder.append(locality);
		builder.append(", city=");
		builder.append(city);
		builder.append(", pincode=");
		builder.append(pincode);
		builder.append("]");
		return builder.toString();
	}
	
	
}

class Employee implements Serializable{
	private String name;
	private String id;
	private Address address;
	private transient double salary;
	
	public Employee() {}
	public Employee(String name, String id, Address address, double salary) {
		
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", id=");
		builder.append(id);
		builder.append(", address=");
		builder.append(address);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	
   public void display() {
	   System.out.println(this);
   }

}

public class SerDeSer {

	public static void main(String[] args) {
		Employee emp = new Employee("Akash", "20" , new Address(46, "Civil Lines", "Etawah", 206001), 40000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("Akash.ser")))) {
			System.out.println("Employee details before Serialization ");
			emp.display();
			oos.writeObject(emp);
			
			}catch(IOException e) {
				e.printStackTrace();
			}
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("Akash.ser")))) {
			Employee emp1 = (Employee) ois.readObject();
			System.out.println("Employee details after Deserialization ");
			emp1.display();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}

	}

}
