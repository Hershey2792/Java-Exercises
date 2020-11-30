
public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person(String name){//constructor for name 
        this.name = name;
    }
    
    public Person(String name, String address, String phoneNumber, String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    //getters setters for name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //getters setters fir address
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //getters setters for phone number
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
     //getters setters for email address 
     public String getEmailAddress(){
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress){
        this.phoneNumber = emailAddress;
    }

    //method toString
    public String toString(){
        return "\nName: " + getName()  + "\naddress: " + getAddress() + 
        "\nPhone Number: " + getPhoneNumber() + "\nemail: " + getEmailAddress();
    }

}
