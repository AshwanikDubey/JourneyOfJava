package stream;

import java.util.ArrayList; 
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {

	public static void main(String[] args) {
		List<Employee> employees=employeesList(); 
		fetchEmpName(employees);
		fetchEmpAge(employees);
		System.out.println("City Name Of Emp:: "+fetchEmpCity(employees));
		System.out.println("Unique City Name Of Emp:: "+fetchUniqueEmpCity(employees));
		countEmp(employees);
		firstThreeEmp(employees);
		ignoreThreeEmp(employees);
		verifyEmp(employees);
		checkEmp(employees);
		checkEmpjoin(employees);
		checkEmpSalary(employees);
	}
	
	private static void checkEmpSalary(List<Employee> employees ) {
		//Check Every Employee salary above 10000
		// noneMatch return true if no one match and false any one matching
		boolean ans=employees.stream().noneMatch(emp -> emp.getSalary()<10000);
		if(ans) {
			System.out.println("Yes All Employee salary above 10000");
		}else {
			System.out.println("Not All Employee are salary above 10000");
		} 
	}
	
	private static void checkEmpjoin(List<Employee> employees ) {
		//Check Employee are joined after 2000
		boolean ans=employees.stream().allMatch(emp -> emp.getYearOfJoining()>2000);
		if(ans) {
			System.out.println("Yes All Employee are joined after 2000");
		}else {
			System.out.println("Not All Employee are joined after 2000");
		} 
	}
	
	private static void checkEmp(List<Employee> employees ) {
		//Check if any Employee are joined before 2019
		boolean ans=employees.stream().anyMatch(emp -> emp.getYearOfJoining()<2019);
		if(ans) {
			System.out.println("Yes Employee joined before 2019");
		}else {
			System.out.println("No Employee joined before 2019");
		} 
	}
	
	private static void verifyEmp(List<Employee> employees ) {
		//verify any Employees below 18
		boolean ans=employees.stream().anyMatch(emp -> emp.getAge()<18);
		if(!ans) {
			System.out.println("No Employees are present below 18 ");
		}else {
			System.out.println("Employees are present below 18 ");
		} 
	}
	
	private static void ignoreThreeEmp(List<Employee> employees ) {
		//Ignore First 3 Employees
		List<String> ans=employees.stream().skip(3).map(emp -> emp.getName()).toList();
		System.out.println("Exclude First 3 Employees :: "+ans);
	}
	
	private static void firstThreeEmp(List<Employee> employees ) {
		//Get First 3 Employees
		List<String> ans=employees.stream().limit(3).map(emp -> emp.getName()).toList();
		System.out.println(ans);
	}
	
	private static void countEmp(List<Employee> employees ) {
		//Get Count of employees whose salary is > 20K
		long countEmp=employees.stream().filter(emp -> emp.getSalary()>20000)
							.count();
		System.out.println("Count Of Emp Greather Than 20K "+countEmp);
	}
	
	private static List<String> fetchEmpCity(List<Employee> employees ) {
		List<String> ecity=employees.stream()
				.map(emp -> emp.getCity())
				.collect(Collectors.toList());
		return ecity;
	}
	
	private static List<String> fetchUniqueEmpCity(List<Employee> employees ) {
		List<String> ecity=employees.stream()
				.map(emp -> emp.getCity()).distinct()
				.collect(Collectors.toList());
		return ecity;
	}
	
	private static void fetchEmpAge(List<Employee> employees ) {
		//Fetch Employees with age > 25 
		List<String> empNames=employees.stream()
				.filter(emp -> emp.getAge()>25) //Get All Emp object with age > 25
				.map(emp -> emp.getName()).toList(); // get name of emp with Emp object
		System.out.println("Name :: "+empNames);
	}
	  
	private static void fetchEmpName(List<Employee> employees ) {
		//Get All Employee Names as List
				// Without Stream
				List<String> empNames = new ArrayList<String>();
				for(Employee em:employees) { 
					empNames.add(em.getName());
				}
				System.out.println("Name :: "+empNames);
				
				//With Stream		
				Stream<Employee>empStream=employees.stream();
				List<String> allEmpNames =empStream.map(emp -> emp.getName()).toList();
				
				System.out.println("Name :: "+allEmpNames);
	}
	private static List<Employee> employeesList(){
		List<Employee> empList= new ArrayList<>();
		
		empList.add(Employee.getBuild().setId(1).setName("One").setGender("Female").setAge(32).setDepartment("HR")
				.setCity("Noida").setYearOfJoining(2011).setSalary(16000).build());
		empList.add(Employee.getBuild().setId(2).setName("Two").setGender("Male").setAge(25).setDepartment("Sales")
				.setCity("Gr.Noida").setYearOfJoining(2015).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(3).setName("Three").setGender("Male").setAge(29).setDepartment("Infrastructure")
				.setCity("Agra").setYearOfJoining(2016).setSalary(15000).build());
		empList.add(Employee.getBuild().setId(4).setName("Four").setGender("Female").setAge(28).setDepartment("Development")
				.setCity("Mathura").setYearOfJoining(2007).setSalary(30000).build());
		empList.add(Employee.getBuild().setId(5).setName("Five").setGender("Female").setAge(27).setDepartment("HR")
				.setCity("Dwarka").setYearOfJoining(2013).setSalary(25000).build());
		empList.add(Employee.getBuild().setId(6).setName("Six").setGender("Male").setAge(43).setDepartment("Security")
				.setCity("Pune").setYearOfJoining(2008).setSalary(14000).build());
		empList.add(Employee.getBuild().setId(7).setName("Seven").setGender("Male").setAge(35).setDepartment("Finance")
				.setCity("Goa").setYearOfJoining(2010).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(8).setName("Eight").setGender("Male").setAge(31).setDepartment("Development")
				.setCity("Kriti Nagar").setYearOfJoining(2016).setSalary(10000).build());
		empList.add(Employee.getBuild().setId(9).setName("Nine").setGender("Female").setAge(24).setDepartment("Sales")
				.setCity("Basti").setYearOfJoining(2001).setSalary(30000).build());
		empList.add(Employee.getBuild().setId(10).setName("Ten").setGender("Female").setAge(25).setDepartment("Sales")
				.setCity("Noida").setYearOfJoining(2009).setSalary(20000).build());
		
		return empList;
	}

}
