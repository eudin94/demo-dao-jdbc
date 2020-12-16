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
	}
}
