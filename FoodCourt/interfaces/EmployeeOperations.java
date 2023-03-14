package interfaces;

import classes.*;

public  interface EmployeeOperations{

	boolean insertEmployee(Employee e);

	boolean removeEmployee(Employee e);

	Employee searchEmployee(String empId);

	void showAllEmployees();
}

