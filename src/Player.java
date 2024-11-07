import java.util.Random;

public class Player {
    int number;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, что число - " + number);
    }
}
