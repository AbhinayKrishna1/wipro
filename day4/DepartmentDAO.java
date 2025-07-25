package wipro.day4;

import java.util.List;
import wipro.day4.DepartmentNotFoundException;
import wipro.day4.Department;

public interface DepartmentDAO {
    void addDepartment(Department dept);
    Department getDepartmentById(int id) throws DepartmentNotFoundException;
    List<Department> getAllDepartments();
    void updateDepartment(Department dept) throws DepartmentNotFoundException;
    void deleteDepartment(int id) throws DepartmentNotFoundException;
}
