import java.lang.String;

public class Employee extends Person {
    protected int officeNum;
    protected int salary;
    MyDate dateHired;
    
    //constructor
   
   public Employee(String name){
       super(name);
   }

    public Employee(String name, int officeNum, int salary, MyDate dateHired){
        super(name);
        this.officeNum = officeNum;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    //getters and setters
    public int getOfficeNum(){
        return officeNum;
    }
    public void setOfficeNum(){
        this.officeNum = officeNum;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;
    }

    public MyDate getDateHired(){
        return dateHired;
    }
    public void setDateHired(){
        this.dateHired = dateHired;
    }
    @Override
    public String toString(){
        return "\n\nOffice Number: " + getOfficeNum();
    }
}

