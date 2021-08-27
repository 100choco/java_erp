package java_erp.dao;

import java.util.ArrayList;

import java_erp.dto.Department;


public interface DepartmentDao {
	ArrayList<Department> selectDepartmentByAll();
	
	Department selectDepartmentByNo(Department department);
	
	int insertDepartment(Department department);
	int updateDepartment(Department department);
	int deletDepartment(Department department);
}
