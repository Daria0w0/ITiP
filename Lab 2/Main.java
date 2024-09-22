public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Натлья", 19, "Женский", "Информатика", 4.8);
        Student student2 = new Student("Илья", 21, "Мужской", "Информатика", 4.5);
        Teacher teacher1 = new Teacher("Сергей", 45, "Мужской", "Математика", 20);
        Assistant assistant1 = new Assistant("Елена", 30, "Женский", "Химия", 5, "Пн-Пт 10:00-12:00");
    

        student1.displayInfo();
        student2.displayInfo();
        teacher1.displayInfo(); 
        assistant1.displayInfo(); 

        System.out.println("Количество созданных студентов: " + Student.getStudentCount());
    }
}