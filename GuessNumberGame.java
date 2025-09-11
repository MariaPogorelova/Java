import java.util.Scanner;
import java.util.Random;
public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //создаем объекты random для случайных чисел
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("добро пожаловать в игру 'Угадай число'!");
        System.out.println("Я загадал число от 1 до 100. Попробуйте угадать!");

        //цикл будет повторяться, пока игрок не угадает
        while (guess != numberToGuess) {
            System.out.print("введите число: ");
            guess = scanner.nextInt();
            attempts++; //

            if (guess < numberToGuess) {
                System.out.println("загаданное число больше!");
            } else if (guess > numberToGuess) {
                System.out.println("Загаданное число меньше!");
            } else {
                System.out.println("поздравляю! Вы угадали число " + numberToGuess + " за " + attempts + " попыток!");
            }

        }
        scanner.close();
    }
}