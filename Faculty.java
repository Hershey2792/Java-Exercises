public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    //constructor
    public Faculty(String name, String officeHours, String rank){
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    //getters setters
    public String getOfficeHours(){
        return officeHours;
    }
    public void setOfficeHours(){
        this.officeHours = officeHours;
    }

    public String getRank(){
        return rank;
    }
    public void setRank(){
        this.rank = rank;
    }

    //String 
    @Override
    public String toString(){
        return "\n\nFaculty: " + getName() + "\nRank: " + getRank();
    }

}