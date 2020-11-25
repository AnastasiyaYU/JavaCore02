package Day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Коля Юрлов", 7, "Группа 68");
        Teacher teacher = new Teacher("Александр Николаевич Семенов", 50, "Техническое моделирование");

        System.out.println(student.getGroup());
        System.out.println(teacher.getDiscipline());
        student.printInfo();
        teacher.printInfo();
    }
}
