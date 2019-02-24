package lesson_5.computer;

import java.text.MessageFormat;
import java.util.Scanner;

public class Desktop {

   private long id ;
   public static int id_incriment = 0;
    CPU cpu = new CPU();
    Keyboard keyboard = new Keyboard();
    Monitor monitor = new Monitor();
    Scanner scanner = new Scanner(System.in);

    public Desktop() {

        id_incriment++;
        id = id_incriment;
        System.out.println("Введите характеристики процессора");
        System.out.println("Производитель: ");
        cpu.setManufacturer(scanner.nextLine());

        System.out.println("Внешняя тактовая частота: ");
        cpu.setClockFrequencyExternal(scanner.nextInt());

        System.out.println("Внутреняя тактовая частота: ");
        cpu.setClockFrequencyInner(scanner.nextInt());


        System.out.println("разрядность: ");
        cpu.setBitDepth(scanner.nextInt());

        cpu.printInfoCPU();

        System.out.print("Клавиатура: ");
        System.out.println(" ");

       ///------не понятная фигня, не поняла почему именно  в этом моменте проскакивает один сканер
        System.out.println("Цвет: ");
        keyboard.setColor(scanner.nextLine());
        keyboard.setColor(scanner.nextLine());

        System.out.println("Производитель: ");
        keyboard.setManufacturer(scanner.nextLine());

        System.out.println(" Конструктивный тип: ");
        keyboard.setConstructiveType(scanner.nextLine());

        keyboard.printInfoKeyboard();

        System.out.println("Монитор: ");
        monitor.printInfoMonitor();
    }

    public Desktop(String cpuManufacturer, int cpuClockFrequencyExternal, int cpuClockFrequencyInner, int cpuBitDepth, String kManufacturer, String kColor, String kConstructiveType) {

        id_incriment++;
        id = id_incriment;
        cpu.setManufacturer(cpuManufacturer);
        cpu.setClockFrequencyExternal(cpuClockFrequencyExternal);
        cpu.setClockFrequencyInner(cpuClockFrequencyInner);
        cpu.setBitDepth(cpuBitDepth);
        keyboard.setManufacturer(kManufacturer);
        keyboard.setColor(kColor);
        keyboard.setConstructiveType(kConstructiveType);


    }


    public void printInfoDesktop() {
        System.out.println(MessageFormat.format("Ваш компьютер номер {13}  имеет   CPU: \n производитель : {0}, внешняя тактовая частота : {1},  внутреняя тактовая частота{2}, разрядность{3}" +
                        "\n Клавиатура:  \n Производитель: {4}, Цвет: {5}, Конструктивный тип: {6} " +
                        "\n Монитор :\n Диагональ :{7}, Разрешение по вертикали {8}, Разрешение по горизонтали  {9}, Тип {3}, Тип матрицы {10}, Производитель {11}", cpu.getManufacturer(), cpu.getClockFrequencyExternal(), cpu.getClockFrequencyInner(), cpu.getBitDepth(),
                keyboard.getManufacturer(), keyboard.getColor(), keyboard.getConstructiveType(), monitor.diagonal, monitor.resolutionVertical, monitor.resolutionHorizontal, monitor.Type, monitor.TypeMatrix, monitor.manufacturer, id));

    }

}
