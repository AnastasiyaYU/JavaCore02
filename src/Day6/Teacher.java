package Day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String discipline;

    public Teacher(String name, String discipline){
        this.name =name;
        this.discipline = discipline;
    }

    void evaluate(String nameStudent){
        Random random = new Random();
        int evaluate = 2 + random.nextInt(4);

        String evaluateString = "";
        switch (evaluate){
            case 2:
                evaluateString = "неудовлетворительно";
                break;
            case 3:
                evaluateString = "удовлетворительно";
                break;
            case 4:
                evaluateString = "хорошо";
                break;
            case 5:
                evaluateString = "отлично";
                break;
            /*default:
                evaluateString = "неявка";*/
        }

        System.out.println("Преподаватель " + name +" оценил студента с именем " + nameStudent + " по предмету " + discipline + " на оценку " + evaluateString);
    }

}
