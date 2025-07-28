package Lab7_Arrays_And_Collections.programs;
import java.util.Comparator;

public class EmployeeClassComparator  implements Comparator<Employee> {


	    @Override
	    public int compare(Employee emp1, Employee emp2) {
	        // Compare salaries. For ascending order, return (emp1.salary - emp2.salary)
	        // Using Double.compare to handle double precision correctly
	        return Double.compare(emp1.getSalary(), emp2.getSalary());
	    }
	}

