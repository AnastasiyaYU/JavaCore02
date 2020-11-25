package Day9;

public class Teacher extends Human {
    private String discipline;

    public Teacher(String name, int age, String discipline) {
        super(name, age);
        this.discipline = discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }
}
