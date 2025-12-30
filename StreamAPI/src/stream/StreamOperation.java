package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamOperation {

	public static void main(String[] args) {
		List<Employee> emp=employeesList();
		System.out.println("Object Created !!"+emp);
		
		
		

	}
	private static List<Employee> employeesList(){
		List<Employee> empList= new ArrayList<>();
		
		empList.add(Employee.getBuild().setId(1).setName("One").setGender("Female").setAge(32).setDepartment("HR")
				.setCity("Noida").setYearOfJoining(2011).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(2).setName("Two").setGender("Male").setAge(25).setDepartment("Sales")
				.setCity("Noida").setYearOfJoining(2015).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(3).setName("Three").setGender("Male").setAge(29).setDepartment("Infrastructure")
				.setCity("Noida").setYearOfJoining(2016).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(4).setName("Four").setGender("Female").setAge(28).setDepartment("Development")
				.setCity("Noida").setYearOfJoining(2007).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(5).setName("Five").setGender("Female").setAge(27).setDepartment("HR")
				.setCity("Noida").setYearOfJoining(2013).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(6).setName("Six").setGender("Male").setAge(43).setDepartment("Security")
				.setCity("Noida").setYearOfJoining(2008).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(7).setName("Seven").setGender("Male").setAge(35).setDepartment("Finance")
				.setCity("Noida").setYearOfJoining(2010).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(8).setName("Eight").setGender("Male").setAge(31).setDepartment("Development")
				.setCity("Noida").setYearOfJoining(2016).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(9).setName("Nine").setGender("Female").setAge(24).setDepartment("Sales")
				.setCity("Noida").setYearOfJoining(2001).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(10).setName("Ten").setGender("Female").setAge(25).setDepartment("Sales")
				.setCity("Noida").setYearOfJoining(2009).setSalary(10000).build());
		
		return empList;
	}

}
