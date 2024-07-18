package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== Test 1: department insert ====");
		departmentDao.insert(new Department(null, "Foods"));
		
		System.out.println("\n==== Test 2: department findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n==== Test 3: department findAll ====");
		List<Department> departments = departmentDao.findAll();
		for(Department department1 : departments) {
			System.out.println(department1);
		}
		
		System.out.println("\n==== Test 4: department update ====");
		departmentDao.update(new Department(8, "Auto"));
		
		System.out.println("\n==== Test 5: department delete ====");
		departmentDao.deleteById(9);
	}

}
