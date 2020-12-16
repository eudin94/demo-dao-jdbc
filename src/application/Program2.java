package application;

import java.util.List;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("===== Test 1: findAll =====");
		DepartmentDAO depDao = DAOFactory.createDepartmentDAO();
		List<Department> list = depDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
	}
}
