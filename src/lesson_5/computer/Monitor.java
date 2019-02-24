package lesson_5.computer;

import java.text.MessageFormat;

public class Monitor {

   public    float diagonal;
   public    int resolutionVertical;
   public    int resolutionHorizontal;
   public    String Type;
   public    String TypeMatrix;
   public    String manufacturer;

    public Monitor()
    {
        diagonal = 17;
        resolutionVertical = 1920;
        resolutionHorizontal = 1024;
        Type = "LCD";
        TypeMatrix = "IPS";
        manufacturer = "Тайланд";
    }

    public void  printInfoMonitor()
    {
        System.out.println(MessageFormat.format("Характеристики монитора \nДиагональ :{0}, Разрешение по вертикали {1}, Разрешение по вертикали  {2}, Тип {3}, Тип матрицы {4}, Производитель {5}", diagonal,resolutionVertical,resolutionHorizontal, Type, TypeMatrix, manufacturer));
    }
}
