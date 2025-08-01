package varsions.java8.strams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

@Data
@Builder
@AllArgsConstructor
class Employee{
        int id, salery;
        String name ,department;
}


public class GroupByDemo {
    public static void main(String[] args) {
        Employee e1 = Employee.builder()
                .id(1)
                .name("Harish")
                .department("HR")
                .salery(10000).build();
        Employee e2 = Employee.builder()
                .id(2)
                .name("Sohail")
                .department("HR")
                .salery(10000).build();
        Employee e3 = Employee.builder()
                .id(3)
                .name("Akshay")
                .department("FINANCE")
                .salery(10000).build();
        Employee e4 = Employee.builder()
                .id(4)
                .name("Akash")
                .department("FINANCE")
                .salery(10000).build();
        Employee e5 = Employee.builder()
                .id(5)
                .name("Rohit")
                .department("MARKETING")
                .salery(10000).build();
        Employee e6 = Employee.builder()
                .id(6)
                .name("Kumar")
                .department("IT")
                .salery(10000).build();

        List<Employee> list_of_employees = List.of(e1,e2,e3,e4,e5,e6);
        Map<String, List<Employee>> collect = list_of_employees.stream()
                .collect(groupingBy(Employee::getDepartment));
        Map<String, Integer> employee_Dept_salery = new HashMap<>();
        for (Map.Entry<String, List<Employee>> x : collect.entrySet()) {
            int sum = x.getValue().stream().mapToInt(y -> y.getSalery()).sum();
            employee_Dept_salery.put(x.getKey(),sum);
        }
        System.out.println(collect);
        System.out.println(employee_Dept_salery);

    }
}
