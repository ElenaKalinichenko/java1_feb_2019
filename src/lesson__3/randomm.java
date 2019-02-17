package lesson__3;


import java.util.Random;
import java.util.Scanner;



public class randomm {

    public static void main(String[] args) {

        //генерируем случайное числ
        final Random random = new Random();
        int rundNumber =  random.nextInt(10);
        int numberTry = 3; // число попыток

        System.out.println("Угадайте число, от 0 до 9. У вас есть "+numberTry +" попытки   "+ rundNumber);
        Scanner scanner = new Scanner(System.in);
        int i = 1; //счетчик попыток
        do {

            if(scanner.nextInt()== rundNumber)
            {
                System.out.println("Вы угадали! с "+ i +"  попытки");
                break;
            }


            i++;
            if(numberTry-i <0) {
                System.out.println("Жаль, вы не смогли угадать");
                break;
            }

            System.out.println("Угадайте число, от 0 до 9. У вас есть "+(numberTry-i ==0 ? "последняя попытка" : (numberTry-i) +" попытки"));


        }while(numberTry-i >=0);
    }
}