package lesson_5.computer;

import java.text.MessageFormat;

public class Keyboard {

    private   String manufacturer; // производитель
    private   String color; // цвет
    private   String constructiveType; // Конструктивный тип

    public  void  setManufacturer( String manufacturer)
    {
       this.manufacturer = manufacturer;
    }

    public String getManufacturer()
    {
        return  manufacturer;
    }

    public  void  setColor( String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return  color;
    }

    public  void  setConstructiveType( String constructiveType)
    {
        this.constructiveType = constructiveType;
    }

    public String getConstructiveType()
    {
        return  constructiveType;
    }


    public void  printInfoKeyboard()
    {
        System.out.println(MessageFormat.format("Клавиатура \nПроизводитель : {0} , Цвет : {1}, Конструктивный тип : {2}", manufacturer, color, constructiveType));
    }

}
