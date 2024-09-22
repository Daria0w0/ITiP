class Teacher extends Person {
    private String subject;
    private int experience;

    public Teacher(String name, int age, String gender, String subject, int experience) {
        super(name, age, gender);
        this.subject = subject;
        this.experience = experience;
    }

    public Teacher() {
        this("Неизвестно", 0, "Неизвестно", "Неизвестно", 0);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void displayInfo() {
        System.out.println("Преподаватель: " + getName() + ", Возраст: " + getAge() + ", Пол: " + getGender() +
                ", Предмет: " + subject + ", Опыт: " + experience + " лет");
    }
}