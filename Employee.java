public class Employee {
    protected String name;
    protected String employeeId;
    protected double basicSalary;

    public Employee(String name, String employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: ₹" + calculateSalary());
        System.out.println();
    }

    public static void main(String[] args) {
        Employee professor = new Professor("Dr. Sharma", "P101", 60000);
        Employee labAssistant = new LabAssistant("Rahul", "L102", 30000);
        Employee adminStaff = new AdministrativeStaff("Priya", "A103", 40000);

        professor.display();
        labAssistant.display();
        adminStaff.display();
    }
}

class Professor extends Employee {
    public Professor(String name, String employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + 20000;
    }
}

class LabAssistant extends Employee {
    public LabAssistant(String name, String employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + 10000;
    }
}

class AdministrativeStaff extends Employee {
    public AdministrativeStaff(String name, String employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + 5000;
    }
}