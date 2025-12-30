package stream;

public class Employee {
	private int id;
	private String name;
	private String city;
	private String gender;
	private String department;
	private int age;
	private int yearOfJoining;
	private double salary;
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getCity() {
		return city;
	}


	public String getGender() {
		return gender;
	}


	public String getDepartment() {
		return department;
	}


	public int getAge() {
		return age;
	}


	public int getYearOfJoining() {
		return yearOfJoining;
	}


	public double getSalary() {
		return salary;
	}
	//here no one create object of Employee class without builder object
	//Due to this builder class responsible for create object assign value
	// and validation
	private Employee(empBuilder empb) {
		if( empb.name !=null && empb.gender != null && empb.department != null) {
		this.id=empb.id;
		this.name=empb.name;
		this.city=empb.city;
		this.gender=empb.gender;
		this.department=empb.department;
		this.age=empb.age;
		this.yearOfJoining=empb.yearOfJoining;
		this.salary=empb.salary;
		}else {
			throw new IllegalArgumentException("Name , gender and department must be required !!! ");
		}
	}
	//getBuild is responsible for return Builder Object
	public static empBuilder getBuild() {
		return new empBuilder();
	}

	public static class empBuilder{
		private int id;
		private String name;
		private String city;
		private String gender;
		private String department;
		private int age;
		private int yearOfJoining;
		private double salary;
		// Each setter set value and return current instance
		public empBuilder setId(int id) {
			if(id == 0) {
				throw new NullPointerException("Kindly Assign the Id Value ");
			}
			this.id = id;
			return this;			
		}
		public empBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public empBuilder setCity(String city) {
			this.city = city;
			return this;
		}
		public empBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}
		public empBuilder setDepartment(String department) {
			this.department = department;
			return this;
		}
		public empBuilder setAge(int age) {
			if(age>17) {
				this.age = age; 
			}else {
				throw new SecurityException("Age is not Below 18 ");
			}
			return this;
		}
		public empBuilder setYearOfJoining(int yearOfJoining) {
			this.yearOfJoining = yearOfJoining;
			return this;
		}
		public empBuilder setSalary(double salary) {
			this.salary = salary;
			return this;
		}
		//build method responsible for build Employee object
		public Employee build() {
			return new Employee(this);
		}
		 
		
	}
	

}
