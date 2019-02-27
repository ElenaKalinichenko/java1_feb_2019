package lesson_5;

import java.text.MessageFormat;

public class Employee {

    public long id;
    public  static long id_incriment = 0;
    public  String FIO;
    public  String position;
    public  String email;
    public  String phone;
    public  int salary;
    public  int age;

    public  Employee()
    {
        id_incriment++;
        id = id_incriment;
        FIO = "н/у";
        position = "н/у";
        email = "н/у";
        phone = "н/у";
        salary = 0;
        age = 0;

    }


    public Employee( String FIO, String position, String email, String phone, int salary, int age) {

        id_incriment++;
        id = id_incriment;

        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo()
    {
        System.out.println(MessageFormat.format("ФИО: {0}, \nДолжность : {1} , email: {2} ,  телефон : {3},  Зарплата : {4},  Возрост : {5}" ,FIO, position, email, phone, salary, age));
    }

}
