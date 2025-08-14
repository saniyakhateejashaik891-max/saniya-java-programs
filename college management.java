class Person {
    public String name;
    public int age;
    public String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
class Student extends Person {
    public  String studentId;
    public String major;

    public Student(String name, int age, String address, String studentId, String major) {
        super(name, age, address); // Call parent constructor
        this.studentId = studentId;
        this.major = major;
    }
    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    // Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
class Faculty extends Person {
    public String facultyId;
    public String department;

    public Faculty(String name, int age, String address, String facultyId, String department) {
        super(name, age, address); // Call parent constructor
        this.facultyId = facultyId;
        this.department = department;
    }