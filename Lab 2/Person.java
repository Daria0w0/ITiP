abstract class Person {
    private String name;
    private int age;
    private String gender;

    // Конструктор, инициализирующий поля класса
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Конструктор по умолчанию
    public Person() {
        this("Неизвестно", 0, "Неизвестно");
    }

    //Геттер для имени
    public String getName() {
        return name;
    }

    //Сеттер для имени
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Абстрактный метод для вывода информации о человеке
    public abstract void displayInfo();
}