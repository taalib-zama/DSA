package lambdaExpressions.userDefinedClass;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
public class Employee implements Comparable<Employee>{
    private String empId;
    private String empName;
    private Integer salary;
    private String empRole;

    @Override
    public int compareTo(Employee obj){
        /**
         * compareTo() compares two string values lexicographically
         * and returns either 1, 0 or -1.
         * 0 if both the strings are same.
         * 1 if str1>str2 (in str1.compareTo(str2))
         * -1 if str1<str2 (in str1.compareTo(str2))
         */

        return this.empName.compareTo(obj.empName);

    }

}
