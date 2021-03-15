package yandex;

public class OperatorSwitch {
    int value = 2, firstValue = 1, secondValue = 2, thirdValue = 3;

    public void foo() {
        switch(48){
            case 44:
                System.out.println(44);
                break;
            case 73:
                System.out.println(73);
                break;
            case 23:
                System.out.println(23);
                break;
            default:
                System.out.println("Not found");
        }
    }
}
