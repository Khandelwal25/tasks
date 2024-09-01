import java.util.*;
public class numberGame{
    public static int generateRandom(int range){
        Random rand = new Random();
        return rand.nextInt(range);

    }
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int range = 100;
        int score = 0;
        int target = generateRandom(range);
        System.out.println("Enter 1 to start the game");
        int start = one.nextInt();
        while(start == 1){
            for(int i=0;i<10;i++){
                System.out.println("Guess the Number");
                int guess = one.nextInt();
                if(target == guess){
                    System.out.println("Congratulations! You Won");
                    break;
                }
                while(target != guess){
                    score++;
                    if(guess > target){
                        System.out.println("Too Big!");
                        break;
                    }else{
                        System.out.println("Too Small!");
                        break;
                    }
                }
            }
            System.out.println(10-score);
            System.out.println("Enter 1 for New Game and 0 to quit");
            int newGame = one.nextInt();
            start = newGame;
        }
    }
}
