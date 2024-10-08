package Inheritance;

public class Manager_employ {
  
        public static void main(String[] args) {
            // Create an Employee object
            Employee emp = new Employee("John Doe", 101, 50000);
            System.out.println("Employee Details:");
            emp.displayDetails();
    
            // Create a Manager object
            Manager mgr = new Manager("Jane Smith", 102, 75000, 5);
            System.out.println("\nManager Details:");
            mgr.displayManagerDetails();
        }
    }
    

