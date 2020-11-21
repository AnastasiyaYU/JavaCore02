package Day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Player(){
        Random random = new Random();
        stamina = 90 + random.nextInt(11);

        if (countPlayers<6) {
            countPlayers++;
        }
    }

    public void run(){
        if (stamina>0) {
            stamina--;
            if (stamina == 0) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        if(countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
