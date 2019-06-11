package newInt;

import java.util.HashMap;

import java8Practice.Static_Method_Impl;
import java8Practice.Static_Method_In_Interface;


public class TestClass_Ex_01 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {
		/*Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3= new Employee();
		HashMap<Employee,String> employeeHm = new HashMap<Employee,String>();
		employeeHm.put(emp1, "Employee1");
		employeeHm.put(emp2, "Employee2");
		employeeHm.put(emp3, "Employee3");
		employeeHm.put(null, "Employee_null");
		employeeHm.put(emp3, null);*/
		
		/*java.lang.String string = null;
		System.out.println(employeeHm.size());
		System.out.println(employeeHm.get(emp3));
		
		Employee emp4 = new Employee();*/
//		Employee emp5 = (Employee) Class.forName("Employee").newInstance();
		
		/*
		String str = "RAM";
		str.concat("JI");
				System.out.println(str.substring(9));
				System.out.println(str.concat("JI"));
				
				Employee em = new Employee();
				em.clone();	*/		
		
				Static_Method_In_Interface obj = new Static_Method_Impl();
		
				
				System.out.println(Static_Method_In_Interface.count);
	}

}
