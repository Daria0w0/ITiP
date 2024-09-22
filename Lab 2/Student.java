class Student extends Person {
    private String major;
    private double gpa;
    private static int studentCount = 0;

    public Student(String name, int age, String gender, String major, double gpa) {
        super(name, age, gender);
        this.major = major;
        this.gpa = gpa;
        studentCount++;
    }

    public Student() {
        this("Неизвестно", 0, "Неизвестно", "Неизвестно", 0.0);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        System.out.println("Студент: " + getName() + ", Возраст: " + getAge() + ", Пол: " + getGender() +
                ", Специальность: " + major + ", GPA: " + gpa);
    }

    public static int getStudentCount() {
        return studentCount;
    }

}
