package LinkedList.singlyLinkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public  boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o==null || getClass() != o.getClass()){
            return false;
        }
        Employee employee = (Employee) o;

        if(id!= employee.id){
            return false;
        }
        if(!firstName.equals(employee.firstName)){
            return false;
        }
        return lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode(){
        int result = firstName.hashCode();
        result = 31 * result +lastName.hashCode();
        result = 31 * result + id;
        return result;

    }

    @Override
    public String toString(){
        return "Employee(" + "firstName='" + firstName + '\'' + ", lastname='" +lastName +'\'' + ", id= '" +id + '}';
    }

}
