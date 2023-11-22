
class Instructor extends Person {
    private double salary;

    // Constructor for Instructor
    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method for Instructor
    
    public String toString() {
        return "Instructor (Name= " + getName() + ", YearOfBirth= " + getYearOfBirth() + ", Salary= " + salary + ")";
    }
}

