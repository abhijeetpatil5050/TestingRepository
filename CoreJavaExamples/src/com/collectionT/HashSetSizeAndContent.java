package com.collectionT;

import java.util.HashSet;
import java.util.Set;

public class HashSetSizeAndContent {
	
	
	public static void main(String[] args) {
		
		
		Emp e1 = new Emp(1,"Abhijeet");
		Emp e2 = new Emp(1,"Abhijeet");
		Emp e3 = e1;
		
		Set<Emp> st1= new HashSet<>();
		
		
		st1.add(e1);
		st1.add(e2);
		st1.add(e3);
		
		System.out.println(st1);
		
		System.out.println(st1.size());
		
		
		System.out.println(e1.equals(e2));//false unless we dont add equals and hashcode methods in employee class based on id
		System.out.println(e2.equals(e3));//false unless we dont add equals and hashcode methods in employee class based on id
		
		
		System.out.println(e3.equals(e1));//true no effect of equals and hashcode methods.
		
		
	}
	
	
	

}

class Emp
{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}


	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		return true;
	}





	private int id;
	private String name;
	
	
	
	
	
	
}