package Day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("ИВАН СЕРГЕЕВИЧ", "Математика");
        Student student = new Student("Николай");

        String studentName = student.getName();
        teacher.evaluate(studentName);
    }
}
