package lesson_7;

import java.util.Random;
import java.util.Scanner;

public class main {

    private static int COUNT_CATS = 10; // количесвто котов
    private static int COUNT_PLATES = 10;  // количесвто тарелок
    private static String[] NAME_CATS = {"Пушистик", "Шарик", "Мурзик", "Гав", "Милка", "Няшка", "Матроскин", "Раз", "Два", "Три", "Четыре", "Пять"};
    private static int MAX_APPETITE = 500; // максимальный аппетит, для рандома

    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 200);
        Plate plate = new Plate(1000);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.info();

        Scanner scanner;

        Random random = new Random();

        Cat[] cats = new Cat[random.nextInt(COUNT_CATS + 1)];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(NAME_CATS[random.nextInt(NAME_CATS.length)], random.nextInt(MAX_APPETITE + 1));
            cats[i].eat(plate);

            do {
                if (cats[i].getFull() == false) {
                    System.out.println(" Еды в миске " + plate.getFood() + ", а у кота аппетит  " + cats[i].getAppetite());
                    System.out.println("Коту по имени " + cats[i].getName() + " не хватает еды " + (cats[i].getAppetite() - plate.getFood()) + " , добавить? 1 =  да,  0 - нет");
                    scanner = new Scanner(System.in);

                    if (scanner.nextInt() == 1) // добавляем еды
                    {
                        plate.addFood(random.nextInt(MAX_APPETITE + 1));

                        System.out.println("Добавли еду в миску, сейчсас еды " + plate.getFood());
                        cats[i].eat(plate); // еще раз кормим этого  же кота
                        cats[i].info();
                    } else break;
                } else cats[i].info();
                break;
            } while (true);
        }

//        for (Cat catt: cats
//             ) {
//            catt.info();
//        }
    }
}
