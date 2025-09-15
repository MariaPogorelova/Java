import java.util.Scanner;
import java.util.Random;
public class GuessSumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //создаем объекты random для случайных чисел
        int num_1 = random.nextInt(100) + 1;
        int num_2 = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;
        int res = num_1 + num_2;

        System.out.println("добро пожаловать в игру 'математическая викторина'!");
        System.out.println("угадайте чему равна сумма чисел: " + num_1 + "+" + num_2);

        //цикл будет повторяться, пока игрок не угадает
        while (guess != res) {
            System.out.print("введите число: ");
            guess = scanner.nextInt();
            attempts++; //

            if (guess < res) {
                System.out.println("загаданное число больше!");
            } else if (guess > res) {
                System.out.println("Загаданное число меньше!");
            } else {
                System.out.println("поздравляю! Вы угадали число " + res + " за " + attempts + " попыток!");
            }

        }
        scanner.close();
    }
}
