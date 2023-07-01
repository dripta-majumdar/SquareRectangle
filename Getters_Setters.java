import java.util.*;
class Employee{
    private String name;
    private long Id;

    public void setName(String n){
        this.name =n;
    }
    public String getName(){
        return name;
    }
    public void setId(long i){
        this.Id= i;
    }
    public long getId(){
        return Id;
    }
}
public class Getters_Setters {
    public static void main(String[] args){
        Employee dripta= new Employee();
        dripta.setName("DRIPTA MAJUMDAR");
        System.out.println("The Name is:"+dripta.getName());
        dripta.setId(11900121);
        System.out.println("The Id is:"+dripta.getId());
    }
}

