public class GuessGame {
    Player player1;
    Player player2;
    Player player3;

    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int guessPlayer1 = 0;
        int guessPlayer2 = 0;
        int guessPlayer3 = 0;

        boolean isPlayer1Right = false;
        boolean isPlayer2Right = false;
        boolean isPlayer3Right = false;

        int target = (int) (Math.random() * 10);
        System.out.println("Я загадываю число : " + target);

        while (true){
            System.out.println("Число, которое нужно угадать - " + target);

            player1.guess();
            player2.guess();
            player3.guess();

            guessPlayer1 = player1.number;
            System.out.println("Игрок 1 думает что это - " + guessPlayer1);
            guessPlayer2 = player2.number;
            System.out.println("Игрок 2 думает что это - " + guessPlayer2);
            guessPlayer3 = player3.number;
            System.out.println("Игрок 3 думает что это - " + guessPlayer3);

            if (guessPlayer1 == target){
                isPlayer1Right = true;
            }
            if (guessPlayer2 == target){
                isPlayer2Right = true;
            }
            if (guessPlayer3 == target){
                isPlayer3Right = true;
            }

            if (isPlayer1Right || isPlayer2Right || isPlayer3Right){
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + isPlayer1Right);
                System.out.println("Второй игрок угадал? " + isPlayer2Right);
                System.out.println("Третий игрок угадал? " + isPlayer3Right);
                break;
            }
            else {
                System.out.println("Игроки должны попробовать еще раз");
            }

        }
    }

}
