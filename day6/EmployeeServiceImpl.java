package Lab7_Arrays_And_Collections.programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner; 
public class EmployeeServiceImpl {
	
	    private Map<Integer, Employee> employeeMap;

	    public EmployeeServiceImpl() {
	        this.employeeMap = new HashMap<>();
	    }

	  
	    public void addEmployee(Employee emp) {
	        if (employeeMap.containsKey(emp.getId())) {
	            System.out.println("Error: Employee with ID " + emp.getId() + " already exists.");
	        } else {
	            employeeMap.put(emp.getId(), emp);
	            System.out.println("Employee " + emp.getName() + " added successfully.");
	        }
	    }

	    
	    public void displayEmployeesByInsuranceScheme(String insuranceScheme) {
	        System.out.println("\nEmployees with Insurance Scheme: " + insuranceScheme);
	        boolean found = false;
	        for (Employee emp : employeeMap.values()) { 
	            if (emp.getInsuranceScheme().equalsIgnoreCase(insuranceScheme)) {
	                System.out.println(emp);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No employees found for insurance scheme: " + insuranceScheme);
	        }
	    }

	    public boolean deleteEmployee(int id) {
	        if (employeeMap.containsKey(id)) {
	            Employee removedEmp = employeeMap.remove(id);
	            System.out.println("Employee " + removedEmp.getName() + " with ID " + id + " deleted successfully.");
	            return true;
	        } else {
	            System.out.println("Error: Employee with ID " + id + " not found.");
	            return false;
	        }
	    }

	    public void displayAllEmployeesSortedBySalary() {
	        System.out.println("\nAll Employees Sorted by Salary (Ascending):");

	        List<Employee> employeeList = new ArrayList<>(employeeMap.values());

	        Collections.sort(employeeList, new EmployeeClassComparator());

	        if (employeeList.isEmpty()) {
	            System.out.println("No employees to display.");
	        } else {
	            for (Employee emp : employeeList) {
	                System.out.println(emp);
	            }
	        }
	    }

	    public void displayAllEmployees() {
	        System.out.println("\nAll Employees (Unsorted):");
	        if (employeeMap.isEmpty()) {
	            System.out.println("No employees in the system.");
	            return;
	        }
	        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
	            System.out.println("ID: " + entry.getKey() + ", Details: " + entry.getValue());
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        EmployeeServiceImpl service = new EmployeeServiceImpl();

	        System.out.println("--- Adding Sample Employees ---");
	        service.addEmployee(new Employee(101, "Alice Smith", 60000.0, "Scheme A"));
	        service.addEmployee(new Employee(102, "Bob Johnson", 75000.0, "Scheme B"));
	        service.addEmployee(new Employee(103, "Charlie Brown", 50000.0, "No Scheme"));
	        service.addEmployee(new Employee(104, "Diana Prince", 80000.0, "Scheme A"));
	        service.addEmployee(new Employee(105, "Eve Adams", 65000.0, "Scheme B"));
	        service.addEmployee(new Employee(101, "Duplicate ID", 10000.0, "Scheme C")); // Test duplicate ID

	        service.displayAllEmployees(); 

	        System.out.println("\n--- Search by Insurance Scheme ---");
	        System.out.print("Enter insurance scheme to search (e.g., Scheme A, Scheme B, No Scheme): ");
	        String scheme = scanner.nextLine();
	        service.displayEmployeesByInsuranceScheme(scheme);

	        System.out.println("\n--- Delete Employee ---");
	        System.out.print("Enter employee ID to delete: ");
	        int idToDelete = scanner.nextInt();
	        scanner.nextLine(); 
	        service.deleteEmployee(idToDelete);
	        service.displayAllEmployees(); 
	        System.out.println("\n--- Display Employees Sorted by Salary ---");
	        service.displayAllEmployeesSortedBySalary();

	        System.out.println("\n--- Test Deleting Non-Existent Employee ---");
	        service.deleteEmployee(999);

	        scanner.close();
	    }
	}

