import javax.xml.namespace.QName;
import java.util.*;
class Employee{
    private String Name;
   private  int id;

    public Employee(){
        id= 2015;
        Name= "Dripta Majumdar";
    }
    public Employee(String MyName, int MyId){
        Name= MyName;
        id= MyId;
    }
    public void setName(String n){
        this.Name= n;
    }
    public String getName(){
        return Name;
    }
    public void setId(int i){
        this.id= i;
    }
    public int getId(){
        return id;
    }

}
public class Constructor_overloading {
    public static void main(String[] args) {
        Employee Dripta= new Employee();
        Employee Hello= new Employee("DRIPTA MAJUMDAR",1190012115);
        System.out.println(Dripta.getName());
        System.out.println(Dripta.getId());
        System.out.println(Hello.getName());
        System.out.println(Hello.getId());

    }
}
