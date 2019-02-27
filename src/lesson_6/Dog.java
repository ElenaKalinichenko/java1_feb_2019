package lesson_6;

public  class Dog  implements Animals{

    public int MAX_RUN = 500;
    public double MAX_JUMP = 0.5;
    public double MIN_JUMP = 0;
    public int MAX_SWIM = 10;

    public  Dog() {

    }

    // перегрузим конструктор, для возможности задавать огранияения
    public  Dog(int max_run, double max_jump, double min_jump, int max_swim) {
        this.MIN_JUMP = min_jump;
        this.MAX_RUN = max_run;
        this.MAX_JUMP = max_jump;
        this.MAX_SWIM = max_swim;


    }

    @Override
    public void run(int longg) {
        System.out.println("Собака пробежала на "+ longg  +" метров");
    }

    @Override
    public void swim(int longg) {
        System.out.println("Собака проплыла на "+ longg  +" метров");
    }

    @Override
    public void jump(double height) {
        System.out.println("Собака прыгнула на "+  String.format("%.2f",height)  +" метров в высолту ");
    }
}
