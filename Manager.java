package Inheritance;
class Manager extends Employee {
    // New attribute specific to Manager
    private int teamSize;

    // Constructor for Manager, using 'super' to call the base class constructor
    public Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);  // Call to the Employee constructor
        this.teamSize = teamSize;
    }

    // Additional method specific to Manager
    public void displayManagerDetails() {
        // Call base class method to display common details
        displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
