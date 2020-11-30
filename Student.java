import java.lang.String;

public class Student extends Person {
    final String freshman = "Freshman";
    final String sophomore = "Sophomore";
    final String junior = "Junior";
    final String senior = "senior";
    final String status;

    //constructor 
    public Student(String name, String status){
        super(name);
        this.status = status;
    }
 
    //getters setters
    public String getStatus(String status){
        return status;
    }

    @Override 
    public String toString(){
        return "Status: " + status;
    }


}