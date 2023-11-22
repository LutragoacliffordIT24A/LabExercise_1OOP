


class Person {
    private String name;
    private int yearOfBirth;

    // Constructor for Person
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for yearOfBirth
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for yearOfBirth
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    // toString method for Person
    
    public String toString() {
        return "Person name= " + name + ", yearOfBirth=" + yearOfBirth + "]";
    }
}
                   


