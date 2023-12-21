import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		
		lst.add(1001);
		lst.add(1002);
		lst.add(1003);
		lst.add(1004);
		lst.add(1005);
		lst.add(1006);
//		System.out.println(lst);
		
		List<Employee> empList = new ArrayList<>();
		
		Employee emp1 = new Employee(1001, "Jhon", 100000);
		Employee emp2 = new Employee(1002, "alex", 200000);
		Employee emp3 = new Employee(1003, "priyanka", 300000);
		Employee emp4 = new Employee(1004, "anil", 400000);
		Employee emp5 = new Employee(1005, "shirisha", 500000);
		Employee emp6 = new Employee(1006, "zameer", 600000);
		Employee emp7 = new Employee(1007, "venky", 700000);
		
//		System.out.println(emp1);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);
		
		
		System.out.println(empList);
		
		List<String> empNames= new ArrayList<>();
		
		for (Employee employee : empList) {
			if(employee.getSalary()>300000)
				empNames.add(employee.getName());
		}
		
		System.out.println(empNames);
		
		Employee empLamdaNames = empList.stream().min((employee1,employee2)-> employee1.getSalary()<employee2.getSalary()?1:-1).get();
		
		System.out.println(empLamdaNames);
		
		Map<Integer, String> mapOfEmpIdEmpName = empList.stream().collect(Collectors.toMap(emp->emp.getId(), emp->emp.getName()));
		
		
		
		
		/*
//	
		
		List<String> empNames = new ArrayList<>();
		
		for (Employee emp : empList) {
			
			if(emp.salary > 300000) {
				empNames.add(emp.getName());
			}
			
		}
		
		System.out.println(empNames);
		
		List<Integer> names = empList.stream().filter(emp -> emp.getSalary()>300000).map(emp -> emp.getId()).toList();
		System.out.println(names);
		
		
		
		Employee employee = empList.stream().max((empployee1, empployee2)->empployee1.getSalary() > empployee2.getSalary() ? 1: -1).get();    
        System.out.println(employee.getName());    
        
        // min() method to get min Product price    
        Employee MaxsalaryEmp = empList.stream().min((empployee1, empployee2)->empployee1.getSalary() > empployee2.getSalary() ? 1: -1).get();    
        System.out.println(MaxsalaryEmp.getName());
        
        
        long count = empList.stream()  
                .filter(emp -> emp.getSalary()>300000)  
                .count();  
		System.out.println(count);
		
		
		  Map<Integer,String> productPriceMap =   
				  empList.stream()  
		                        .collect(Collectors.toMap(p->p.id, p->p.name));  
		  
		  System.out.println(productPriceMap);
		  
		  for (Map.Entry  map : productPriceMap.entrySet()) {
			  System.out.println(map.getValue());
			
		}
		  
		  System.out.println(productPriceMap.entrySet().stream().map(entry ->entry.getValue()).collect(Collectors.toList()));
		  
		  */
		
		

	}

}
