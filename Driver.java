import java.util.Scanner;


public class Driver {
    public static void main(String[] args) throws Exception {

        
        Scanner input = new Scanner(System.in);
        
        System.out.println("1) to create a Student: ");
        System.out.println("2) to create an Employee: ");
        int userInput = Integer.parseInt(input.nextLine());

        if (userInput == 1){
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            
            System.out.print("Enter " + name + "'s address: ");
            String address = input.nextLine();

            System.out.print("Enter " + name + "'s phone number: ");
            String phone = input.nextLine();

            System.out.print("Enter " + name + "'s email: ");
            String email = input.nextLine();

            System.out.print("Enter " + name + "'s class status: ");
            String status = input.nextLine();

            

            Person person = new Person(name, address, phone, email);
            Student student = new Student(name, status);
            

            //user classes to define
            System.out.println(person.toString());
            System.out.println(student.toString());
            
        }

        else if (userInput == 2){
            System.out.print("Enter a name: ");
            String name = input.nextLine();

            System.out.print("Enter " + name + "'s address: ");
            String address = input.nextLine();

            System.out.print("Enter " + name + "'s phone number: ");
            String phone = input.nextLine();

            System.out.print("Enter " + name + "'s email: ");
            String email = input.nextLine();

            // Person person = new Person(name, address, phone, email);
            // Student student = new Student(name, status);

            System.out.println("\n1) to create a faculty member: ");
            System.out.println("2) to create an staff member: ");
            int userInput2 = Integer.parseInt(input.nextLine());


            if(userInput2 == 1){
                System.out.print("\nEnter an office number: ");
                int officeNum = input.nextInt();

                System.out.print("Enter a salary: $");
                int salary = input.nextInt();

                input.nextLine();

                System.out.print("Enter a hire date (mm/dd/yyyy): ");
                String dates = input.nextLine();

                System.out.print("Enter office hours: ");
                String offHours = input.nextLine();

                System.out.print("Enter a rank: ");
                String rank = input.nextLine();


                //instantiate new objects
                Person person = new Person(name, address, phone, email);
                Faculty faculty = new Faculty(name, offHours, rank);
                MyDate date = new MyDate(dates);
                Employee employee = new Employee(name, officeNum, salary, date);

                //Print yo Strings for employee

                System.out.println(faculty.toString());
                System.out.println("salary: $" + employee.getSalary());
                System.out.println("Date Hired: " + date.getDate());
                System.out.println("\n\nOffice Hours: " + faculty.getOfficeHours());
                System.out.println("Office Number: "+ employee.getOfficeNum());
                System.out.println("Address: " + person.getAddress());
                System.out.println("Phone number: " + person.getPhoneNumber());
                System.out.println("email: " + person.getEmailAddress());

            }

            else if (userInput2 == 2){
                System.out.print("\nEnter an office number: ");
                int officeNum = input.nextInt();

                System.out.print("Enter a salary: $");
                int salary = input.nextInt();

                input.nextLine();

                System.out.print("Enter office hours: ");
                String offHours = input.nextLine();

                System.out.print("Enter a rank: ");
                String rank = input.nextLine();

                System.out.print("Enter staff job title: ");
                String title = input.nextLine();

                System.out.print("Enter a hire date (mm/dd/yyyy): ");
                String dates = input.nextLine();

             





                //instantiate new objects
                Person person = new Person(name, address, phone, email);
                Staff staff = new Staff(name, title);
                Faculty faculty = new Faculty(name, offHours, rank);
                MyDate date = new MyDate(dates);
                Employee employee = new Employee(name, officeNum, salary, date);

                //Print yo Strings for employee
                System.out.println("Staff name: " + staff.getName());
                System.out.println("Staff title: " + staff.getStaff());
                System.out.println("Salary: $" + employee.getSalary());
                System.out.println("Date Hired: " + date.getDate());
                System.out.println("\n\nOffice Hours: " + faculty.getOfficeHours());
                System.out.println("Office Number: "+ employee.getOfficeNum());
                System.out.println("Address: " + person.getAddress());
                System.out.println("Phone number: " + person.getPhoneNumber());
                System.out.println("email: " + person.getEmailAddress());
            }


                
                





            }
            }



        }

            
        


