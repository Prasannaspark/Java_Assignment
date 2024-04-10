package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.jar.Attributes;
import java.util.stream.Collectors;

public class StreamMain {
	public static void main(String[] args) {
		Department marketing = new Department(1, "Marketing");
		Department finance = new Department(2, "Finance");
		Department informationTech = new Department(3, "IT");
		Department operations = new Department(4, "Operations");

		Employee emp1 = new Employee(1, "name1", marketing, 18000.00, 23, "Associate");
		Employee emp2 = new Employee(2, "name2", finance, 15500.00, 26, "Manager");
		Employee emp3 = new Employee(3, "name3", marketing, 25000.00, 25, "Sr Associate");
		Employee emp4 = new Employee(4, "name4", operations, 15500.00, 25, "Associate");
		Employee emp5 = new Employee(5, "name5", marketing, 45000.00, 27, "Director");
		Employee emp6 = new Employee(6, "name6", finance, 65500.00, 21, "VP");
		Employee emp7 = new Employee(7, "name7", informationTech, 35000.00, 22, "Associate");
		Employee emp8 = new Employee(8, "name8", operations, 11500.00, 29, "Director");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);
		empList.add(emp8);

		System.out.println("---GROUP EMPLOYEES BY JOB TITLE---");
		Map<String, List<Employee>> filteredByJobTitles = empList.stream()
				.collect(Collectors.groupingBy(Employee::getJobTitle));
		System.out.println("********************");
		System.out.println(filteredByJobTitles);
		System.out.println("*********************");

		for (String key : filteredByJobTitles.keySet())

		{
			System.out.println(key);
			String keyValue = key.toString();
			System.out.println(keyValue);
			List<Employee> value = filteredByJobTitles.get(key);
			System.out.println(keyValue + " : " + value);
		}
		System.out.println(" ");

		System.out.println("---GROUP EMPLOYEES BY JOB TITLE---");
		Map<Department, List<Employee>> filteredByDepartment = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		for (Department key : filteredByDepartment.keySet()) {
			String keyValue = key.toString();
			List<Employee> value = filteredByDepartment.get(key);
			System.out.println(keyValue + " : " + value);
		}
		System.out.println();

		System.out.println("---EMPLOYEE WITH MAX SALARY---");
		Optional<Employee> maxSalary = empList.stream().max(Comparator.comparing(Employee::getSalary));
		maxSalary.ifPresent(o -> System.out.println(o));
		System.out.println(maxSalary);
		System.out.println();

		System.out.println("---TOP FIVE EMPLOYEES WITH MAX SALARY---");
		Collections.sort(empList, Comparator.comparing(Employee::getSalary));
		Collections.reverse(empList);
		System.out.println(empList.get(0));
		System.out.println(empList.get(1));
		System.out.println(empList.get(2));
		System.out.println(empList.get(3));
		System.out.println(empList.get(4));
		System.out.println();

		System.out.println("---DISPLAY ALL DIRECTORS---");
		List<Employee> directors = empList.stream().filter(o -> (o.getJobTitle().equals("Director")))
				.collect(Collectors.toList());
		directors.forEach(System.out::println);
		System.out.println();

		System.out.println("average salary");

		double avgsal = empList.stream().collect(Collectors.averagingDouble(o -> o.getSalary()));
		System.out.println(avgsal);
		
		

//		
//		Map<String,Double> avgsallist=new  HashMap<String,Double>();
//		for(Map.Entry<String,List<Employee>> m: a.entryset()) {
//			
//		}
		
		

	}
}
