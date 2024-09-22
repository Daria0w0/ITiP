class Assistant extends  Teacher {
    private String officeHours;

    public Assistant(String name, int age, String gender, String subject, int experience, String officeHours) {
        super(name, age, gender, subject, experience); 
        this.officeHours = officeHours;
    }

    public Assistant() {
        this("Неизвестно", 0, "Неизвестно", "Неизвестно", 0, "Неизвестно");
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ассистент: " + getName() + ", Возраст: " + getAge() + ", Пол: " + getGender() +
                ", Предмет: " + getSubject() + ", Опыт: " + getExperience() + " лет, Часы работы: " + officeHours);
    }
}