package yandex;

public class Constructor {

    public void foo(){
        Flower flower = new Flower();
        flower.name = "Ромашка";
        flower.color ="Белая";

        Flower flower2 = new Flower("Rose", "red");
        Flower flower3 = new Flower("Orange tree", "orange");

        System.out.println(flower.name+ " " + flower.color);
        System.out.println(flower2.name + " " + flower2.color);
        System.out.println(flower3.name + " " + flower3.color);

        Apples number1 = new Apples("name1", "color1", 5);

        System.out.println(number1.name+ " " + number1.color + " " + number1.number);

    }
}
