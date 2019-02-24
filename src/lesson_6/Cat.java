package lesson_6;

public class Cat implements Animals {

    public int MAX_RUN = 200;
    public double MAX_JUMP = 2;
    public double MIN_JUMP = 0;
    public int MAX_SWIM = 0;




    public  Cat() {

    }



    // перегрузим конструктор, для возможности задавать огранияения
    public  Cat(int max_run, double max_jump, double min_jump, int max_swim) {
        this.MIN_JUMP = min_jump;
        this.MAX_RUN = max_run;
        this.MAX_JUMP = max_jump;
        this.MAX_SWIM = max_swim;


    }

    @Override
    public void run(int longg) {
        System.out.println("Кошка пробежала на " + longg + " метров");
    }

    @Override
    public void swim(int longg) {
        System.out.println("Кошка проплыла на " + longg + " метров");
    }

    @Override
    public void jump(double height) {
        System.out.println("Кошка прыгнула " + String.format("%.2f", height) + " метров в высолту ");
    }
}
