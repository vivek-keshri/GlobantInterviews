package varsions.java8.strams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class EmployeeDetails{
  int employeeId;
  String employeeName;
  String employeeDepartment;
  String employeeDesignation;
    int employeeSalary;
}

public class ListToMap {
    public static void main(String[] args) {
        List list = List.of(100,200,300,400,500);
        Object collect = list.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));
        System.out.println(collect);

        EmployeeDetails ed1 = EmployeeDetails.builder()
                .employeeId(1)
                .employeeName("john")
                .employeeDepartment("IT")
                .employeeSalary(1000)
                .build();
        EmployeeDetails ed2 = EmployeeDetails.builder()
                .employeeId(2)
                .employeeName("harry")
                .employeeDepartment("Marketing")
                .employeeSalary(2000)
                .build();
        EmployeeDetails ed3 = EmployeeDetails.builder()
                .employeeId(3)
                .employeeName("fabio")
                .employeeDepartment("IT")
                .employeeSalary(2500)
                .build();
        List<EmployeeDetails> employeeList = List.of(ed1,ed2,ed3);
        Map<Integer, EmployeeDetails> collect1 = employeeList.stream().collect(Collectors.toMap(employeeDetails -> employeeDetails.getEmployeeId(), Function.identity()));
        System.out.println(collect1);

            }


}
