package classes;
import java.lang.*;
import interfaces.*;

public class FoodCourt implements RestaurantOperations, EmployeeOperations {
	public static Restaurant restaurants[] = new Restaurant[50];
	public static Employee[] employees = new Employee[150];


	public boolean CheckRestaurantsId(String id) {
		boolean flag = false;
		for (int i = 0; i < restaurants.length; i++) {
			if (restaurants[i] != null) {
				if (restaurants[i].getRid().equals(id)) {
					flag = true;
					break;
				}
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public boolean insertRestaurant(Restaurant r) {
		boolean flag = false;
		for (int i = 0; i < restaurants.length; i++) {
			if (restaurants[i] == null) {
				restaurants[i] = r;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeRestaurant(Restaurant r) {
		boolean flag = false;
		for (int i = 0; i < restaurants.length; i++) {
			if (restaurants[i] == r) {
				restaurants[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public  Restaurant searchRestaurant(String rid) {

		Restaurant r = null;

		for (int i = 0; i < restaurants.length; i++) {
			if (restaurants[i] != null) {
				if (restaurants[i].getRid().equals(rid)) {
					r = restaurants[i];
					break;
				}
			}
		}
		return r;
	}

	public void showAllRestaurants() {
		for (int i = 0; i < restaurants.length; i++) {
			if (restaurants[i] != null) {
				System.out.println("---------------------------------------------");
				System.out.println("Restaurant ID : " + restaurants[i].getRid());
				System.out.println("Restaurant Name : " + restaurants[i].getName());
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
				restaurants[i].showAllFoodItems();
				System.out.println("---------------------------------------------");
			}
		}
	}

	public boolean CheckEmployeesId(String id) {
		boolean flag = false;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null) {
				if (employees[i].getEmpId().equals(id)) {
					flag = true;
					break;
				}
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public boolean insertEmployee(Employee e) {
		boolean flag = false;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				employees[i] = e;
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public boolean removeEmployee(Employee e) {
		boolean flag = false;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == e) {
				employees[i] = null;
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public  Employee searchEmployee(String empId) {
		Employee e = null;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null) {
				if (employees[i].getEmpId().equals(empId)) {
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}

	public void showAllEmployees() {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null) {
				System.out.println("\n---------------------------------------------------\n");
				System.out.println("Employee ID : " + employees[i].getEmpId());
				System.out.println("Employee Name : " + employees[i].getName());
				System.out.println("Employee Salary : " + employees[i].getSalary());
				System.out.println("\n---------------------------------------------------\n");
			}
		}
	}

	public static String showAllId(int i) {
				return employees[i].getEmpId();
	}
	public static String showAllName(int i) {return employees[i].getName();}
	public static Double showAllSalary(int i) {
		return employees[i].getSalary();
	}

	public static String showAllRId(int i) {
		return restaurants[i].getRid();
	}
	public static String showAllRName(int i) {
		return restaurants[i].getName();
	}


}