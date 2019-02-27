package lesson_7;

public class Plate {

    private int food;
    private int need = 0; //  каком количестве еды нуждаеться кот

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int decreaseFood(int n) {

        // тарелка пустая, кот не наелся нуждаеться в  need еде
        if (food == 0) {
            need = n;
            return need;
        }

        if ((food - n) < 0) {
            //  food =0; // еда закончилась
            need = n - food; // кот не наелся, нуждаеться в  need еде

            return need;
        }

        need = 0; // кот не нуждаеться в еде
        food -= n;
        return need;
    }

    //добавляем еду в тарелку
    public void addFood(int newFood) {
        food += newFood;

    }

    public int getFood() {
        return food;
    }
}
