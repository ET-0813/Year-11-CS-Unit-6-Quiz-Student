public class Student {
    private int age;
    private String firstName;
    private String lastName;
    private int year;
    private Address address;

    public Student(int a, String b, String c, int d, Address e) {
        age = a;
        firstName = b;
        lastName = c;
        year = d;
        address = e;
    }
    public int getAge() {
        return age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getYear() {
        return year;
    }
    public Address getAddress() {
        return address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    private void addOneAge() {
        this.age = this.age +1;
    }
    public int birthday() {
        addOneAge();
        return this.age;
    }
    public String toString() {
        return firstName + " " + lastName + ", age " + age + ", year " + year + ", " + address.toString();
    }


}