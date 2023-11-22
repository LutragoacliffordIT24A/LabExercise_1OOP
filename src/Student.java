

class Student extends Person {
    private String major;

    // Constructor for Student
    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    // Getter method for major
    public String getMajor() {
        return major;
    }

    // Setter method for major
    public void setMajor(String major) {
        this.major = major;
    }

    // toString method for Student
    
    public String toString() {
        return "Student (Name= " + getName() + ", YearOfBirth= " + getYearOfBirth() + ", Major= " + major + ")";
    }
}