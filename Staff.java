import java.lang.String;

public class Staff extends Employee {
    private String title;

   
    public Staff(String name, String title){
        super(name);
        this.title = title;
    }

    public String getStaff(){
        return title;
    }
    public void setStaff(){
        this.title = title;
    }
}