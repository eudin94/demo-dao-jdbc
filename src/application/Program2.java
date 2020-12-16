package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DepartmentDAO depDao = DAOFactory.createDepartmentDAO();
		
		System.out.println("===== Test 1: findAll =====");
		List<Department> list = depDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n===== Test 2: findById =====");
		System.out.print("Enter department id: ");
		Department dep = depDao.findById(sc.nextInt());
		System.out.println(dep);
		
		System.out.println("\n===== Test 3: deleteById =====");
		System.out.print("Enter department id: ");
		depDao.deleteById(sc.nextInt());
		System.out.println("Department deleted!");
		
		System.out.println("\n===== Test 4: update =====");
		System.out.print("Enter department id: ");
		dep.setId(sc.nextInt());
		System.out.print("Enter department's new name (NO SPACES ALLOWED): ");
		dep.setName(sc.next());
		depDao.update(dep);
		System.out.println("Update Completed!");
		
		System.out.println("\n===== Test 5: insert =====");
		System.out.print("Enter new department name (NO SPACES ALLOWED): ");
		dep.setName(sc.next());
		depDao.insert(dep);
		System.out.println("Department created successfully! ID = " + dep.getId());
	}
}
