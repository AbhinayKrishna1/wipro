package Lab7_Arrays_And_Collections.programs;

import java.util.Objects; 

public	class Employee implements Comparable<Employee> {
	    private int id;
	    private String name;
	    private double salary;
	    private String insuranceScheme; 

	    public Employee(int id, String name, double salary, String insuranceScheme) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.insuranceScheme = insuranceScheme;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public String getInsuranceScheme() {
	        return insuranceScheme;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	               "id=" + id +
	               ", name='" + name + '\'' +
	               ", salary=" + salary +
	               ", insuranceScheme='" + insuranceScheme + '\'' +
	               '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Employee employee = (Employee) o;
	        return id == employee.id; 
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }

	   
	    @Override
	    public int compareTo(Employee other) {
	        return Integer.compare(this.id, other.id);
	    }
	}

