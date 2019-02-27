package lesson_7;

public class Cat {

    private String name;
    private int appetite;
    private boolean full; // поле сытости, если кот голодный false  , иначе true

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite) > 0) {
            full = false;

        } else full = true;
    }

    public void info() {
        System.out.println("Кот/Кошка по имени " + name + " \n С аппетитом " + appetite + " ,  " + (full == true ? " кот сытый" : " кот голодный"));
    }

    public boolean getFull() {

        return full;
    }

    public int getAppetite() {

        return appetite;
    }

    public String getName() {

        return name;
    }
}
