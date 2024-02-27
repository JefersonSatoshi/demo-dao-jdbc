package Application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1: department findById ====");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n=== Test 2: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department dep2 : list) {
			System.out.println(dep2);
		}
		
		
		System.out.println("\n=== Test 4: department insert ====");
		Department newDepartment = new Department(null, "Home and Garden");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== Test 5: department update ====");
		dep = departmentDao.findById(1);
		dep.setName("Books and Gibis");
		departmentDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("\n=== Test 6: department delete ====");
		System.out.println("Enter id for delete test: ");
		int id = 10;
		departmentDao.deleteById(id);
		System.out.println("DELETE Completed");

	}

}
