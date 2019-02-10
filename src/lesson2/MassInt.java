package lesson2;

import java.util.Arrays;

public class MassInt {


    public static void main(String[] args) {

        int [] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        System.out.println(Arrays.toString(mass));
        for (int i=0; i< mass.length;i++)
        {
            if(mass[i]==0)
            {
                mass[i]=1;
            }else mass[i]=0;

        }
        System.out.println(Arrays.toString(mass));
    }

}
