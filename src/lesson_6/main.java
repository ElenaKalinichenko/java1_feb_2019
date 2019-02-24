package lesson_6;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new  Dog();
        Random random = new Random();

        int max_local_jump_max_dog = 10; //  максимальное ограниечение перменной высоты прыжка, при определение максимума собаки рандомным способом
        int min_local_jump_max_dog = 1;   //  минимальное ограниечение перменной высоты прыжка, при определение максимума собаки рандомным способом

        int max_local_jump_min_dog = 1; //  максимальное ограниечение перменной высоты прыжка, при определение минимума собаки рандомным способом
        int min_local_jump_min_dog = 0;   //  минимальное ограниечение перменной высоты прыжка, при определение минимума собаки рандомным способом

        int max_local_jump_max_cat = 10; //  максимальное ограниечение перменной высоты прыжка, при определение максимума кошки рандомным способом
        int min_local_jump_max_cat = 1;   //  минимальное ограниечение перменной высоты прыжка, при определение максимума кошки рандомным способом

        int max_local_jump_min_cat = 1; //  максимальное ограниечение перменной высоты прыжка, при определение минимума кошки рандомным способом
        int min_local_jump_min_cat = 0;   //  минимальное ограниечение перменной высоты прыжка, при определение минимума кошки рандомным способом


        cat.run(random.nextInt(cat.MAX_RUN));

        cat.jump(cat.MIN_JUMP + (cat.MAX_JUMP-cat.MIN_JUMP)* random.nextDouble());

       dog.run(random.nextInt(dog.MAX_RUN));
        dog.jump(dog.MIN_JUMP + (dog.MAX_JUMP-dog.MIN_JUMP)* random.nextDouble());


        Cat[] cats = new Cat[10];
        Dog[] dogs = new  Dog[10];

        double max_local_jump;
        double min_local_jump;
        for (int i = 0; i < cats.length; i++) {
             max_local_jump = min_local_jump_max_dog + (max_local_jump_max_dog-min_local_jump_max_dog)* random.nextDouble();
             min_local_jump = min_local_jump_min_dog + (max_local_jump_min_dog-min_local_jump_min_dog)* random.nextDouble();
             dogs[i] = new Dog(random.nextInt(1000)+1,max_local_jump, min_local_jump, random.nextInt(10)+1);

            cats[i] = new Cat(random.nextInt(1000)+1, min_local_jump_max_cat + (max_local_jump_max_cat-min_local_jump_max_cat)* random.nextDouble(),  min_local_jump_min_cat + (max_local_jump_min_cat-min_local_jump_min_cat)* random.nextDouble(), random.nextInt(10)+1);
        }


        for (Cat catt: cats
        ) {
            catt.run(random.nextInt(catt.MAX_RUN));
            catt.swim(random.nextInt(catt.MAX_SWIM));
            catt.jump(catt.MIN_JUMP + (catt.MAX_JUMP-catt.MIN_JUMP)* random.nextDouble());

            System.out.println("MAX_RUN = "+catt.MAX_RUN); //вывод просто для проверки, что он меняеться
        }

        for (Dog dogg: dogs
        ) {
            dogg.run(random.nextInt(dogg.MAX_RUN));
            dogg.swim(random.nextInt(dogg.MAX_SWIM));
            dogg.jump(dogg.MIN_JUMP + (dogg.MAX_JUMP-dogg.MIN_JUMP)* random.nextDouble());
            System.out.println("MAX_RUN = "+dogg.MAX_RUN); //вывод просто для проверки, что он меняеться
        }
    }
}
