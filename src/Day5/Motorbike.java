package Day5;

public class Motorbike {
    private int releaseYear;
    private String color;
    private String model;

    public Motorbike(){
        this.releaseYear = 1990;
        this.color = "Цвет по умолчанию";
        this.model = "Модель по умолчанию";
    }

    public Motorbike(int releaseYear, String color, String model){
        this.releaseYear = releaseYear;
        this.color = color;
        this.model = model;
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
