package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class XOGame {

    public static char [][] map; // карта
    public  static final int  SIZE = 5; //размер игрового поля
    public static final char symbol_empty = '.';
    public static  final char symbol_x = 'X';
    public  static  final  char symbol_0= '0';

    public static  Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
//иницилизируем поле
        init_map();
//выоводим игровое поле
        print_map();
        do {
            //ход человека
            stepMan();
           print_map();

           if(checkWin0(symbol_x))
           {
               System.out.println("Победил человек");
               break;

           }

           if(checkFreefield())
           {
               System.out.println("Ничья!");
               break;

           }

           //ход ВМ
            stepVM();
           print_map();
            if(checkWin0(symbol_0))
            {
                System.out.println("Победил Компьютер");
                break;

            }

            if(checkFreefield())
            {
                System.out.println("Ничья!");
                break;

            }

        }while (true);
    }

    //проверка, что есть свободые клетки
    private static boolean checkFreefield() {
        for (int i = 0; i <SIZE ; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j]==symbol_empty)
                    return  false;
            }

        }

        return true;
    }

    public static boolean checkWin0(char symb) {


        int counter = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <SIZE ; j++) {
                if(map[i][j] == symb)
                {
                    counter++;
                    if(counter== SIZE)
                    {
                        return true;
                    }

                }else  break;
            }
            counter =0;
        }
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i <SIZE ; i++) {
                if(map[i][j] == symb)
                {
                    counter++;
                    if(counter== SIZE)
                    {
                        return true;
                    }

                }else  break;
            }
            counter =0;
        }

        //--------------------- начало проверяем диагональ -------------------------------------

        if(map[(SIZE-1)/2][(SIZE-1)/2]==symb) { // проверяем центральный элемент, если он не равен проверяемому символу, проверка на диагональ бессмыслена
            for (int j = 0; j < SIZE; j++) {
                for (int i = 0; i < SIZE; i++) {
                    if (i == j)
                        if (map[i][j] == symb) {

                            counter++;
                            if (counter == SIZE) {
                                return true;
                            }

                        } else  break;
                }

            }


            for (int i = 1; i <=SIZE; i++) {
                for (int j = SIZE; j >1; j--) {
                     if (map[i-1][j-i] == symb) {

                            counter++;
                            if (counter == SIZE) {
                                return true;
                            }
                         break;
                        } return false;
                }

            }
        }

        //--------------------- конец проверяем диагональ -------------------------------------


//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;

        return false;
    }
    //выоводим игровое поле
    private static void print_map() {

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    //иницилизируем поле
    public static void init_map() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i <SIZE ; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j]= symbol_empty;
            }
        }

    }

// ход человека
public static  void stepMan()
{
   int x;
   int y;
   do {
       System.out.println("введите координату X");
       x = scaner.nextInt();
       System.out.println("введите координату Y");
       y = scaner.nextInt();
   }while (correct_input(x-1,y-1));

map[x-1][y-1] = symbol_x;

}

//проверка на корректность  ввода
    public static boolean correct_input(int x, int y)
    {
        if(x<0||x>SIZE && y<0|| y>SIZE ) {

            System.out.println("Не корректное значение попробуйте еще раз");
            return true;
        }
        if(map[x][y]!= symbol_empty) {

            System.out.println("Не корректное значение попробуйте еще раз");
            return true;
        }
        return false;
    }

    //ход виртуальной машины
    public static void stepVM()
    {
        int x;
        int y;
        Random random = new Random();
        do {

            x =random.nextInt(SIZE);
            y =random.nextInt(SIZE);
        }while (correct_input(x,y));

        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = symbol_0;
    }


}
