package ObjectOrientedProgrammin;

import java.util.*;

public class Review {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Rohit", 1, 2345));
		list.add(new Employee("Nived", 2, 3455));
		list.add(new Employee("Rohit", 1, 2345));
		list.add(new Employee("Raj", 3, 2653));
		list.add(new Employee("Sachin", 4, 2345));
		System.out.println(list.stream().distinct().toList());

	}

}

class Employee {
	String name;
	int id;
	int salary;

	public Employee(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		Employee e = (Employee) o;
		return this.name.equals(e.name) && this.id == e.id && this.salary == e.salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name,this.id,this.salary);
	}
	
	public String toString() {
		return this.name +" "+ this.id +" "+this.salary;
	}
}
