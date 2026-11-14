package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIIntermediate {
    public static void main(String[] args) {
//        EmployeeBasedOnSalary();
        getAverageAgeOfPerson();
        partitionNumberInEvenOdd();
        groupWordByLength();
    }
    //Sort List Of Employees by Salary
    private final static  void EmployeeBasedOnSalary(){
        List<Employee> employees = Arrays.asList(
                new  Employee(101,"John",50000),
                new  Employee(102,"Alica",70000),
                new  Employee(103,"Bob",450000),
                new  Employee(104,"David",90000)
        );
        //Sort Asc Order
       List<Employee> salaryEmp = employees.stream()
               .sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println("Sort Emp Based on Salary in Asc Order "+salaryEmp);

        //Sort Desc Order
        salaryEmp = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println("Sort Emp Based on Salary in Desc Order "+salaryEmp);
    }
    //Calculate the average age of a list of person objects
    private static final void getAverageAgeOfPerson(){
        List<Person> person = Arrays.asList(
                new Person("Alice",25),
                new Person("Bob",30),
                new Person("Charlie",28),
                new Person("David",35)
        );

        Double age = person.stream().mapToInt(Person::getAge).average().orElse(0.0);
        System.out.println("Average Age "+age);
    }
    //Partition numbers in even and odd list
    private static final void partitionNumberInEvenOdd(){
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Even Number
       Map<Boolean,List<Integer>> output = num.stream().collect(Collectors.partitioningBy( x->x%2==0)) ;
        System.out.println("Even Numbers "+output.get(true));
        System.out.println("Odd Numbers "+output.get(false));

    }
    //Group a list of words by their length
    private static final void groupWordByLength(){
        List<String> words = Arrays.asList("Apple","bat","ball","cat","banana","dog","goat");
        Map<Integer,List<String>>  val = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Group Words based on Length "+val);
    }

    //Count occurrences of each element in a list
    private static final void countOccurrences(){

    }

    //Group employees by department and calculate average salary











    static class Employee{
        private int id;
        private String name;
        private int salary;

        Employee(int id,String name,int salary){
            this.id=id;
            this.name=name;
            this.salary = salary;
        }
        public int getSalary(){
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
