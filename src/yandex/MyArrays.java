package yandex;

import org.w3c.dom.ls.LSOutput;

public class MyArrays {
    int [] array = new int[3];
    Candy [] box = new Candy[5];

    int [] array2 = {10,3,7};
    Candy candyFirst = new Candy();
    Candy candySecond = new Candy();
    Candy candyThird = new Candy();

    Candy [] box2 = {candyFirst, candySecond, candyThird};

    Candy [] box3;


    public void foo(){
        int [][] array3 = new int[2][2];
        int [][] array4 = {{2,3},{3,4}};

        System.out.println(array4[1][0]);
        }


    }

