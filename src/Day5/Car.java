package Day5;

public class Car {
    int releaseYear;
    String color;
    String model;

    public void setReleaseYear(int userReleaseYear){
        if(userReleaseYear < 1900) {
            System.out.println("Вы указали не верный год выпуска. Человечество еще не изобрело автомобиль");
        } else {
            releaseYear = userReleaseYear;
        }
    }
    public void setColor(String userColor){
        if(userColor.isEmpty()){
            System.out.println("Вы не ввели цвет атомобиля");
        } else {
            color = userColor;
        }
    }
    public void setModel(String userModel){
        if(userModel.isEmpty()){
            System.out.println("Вы не ввели модель атомобиля");
        } else {
            model = userModel;
        }
    }
    public int getReleaseYear(){
        return releaseYear;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
}
