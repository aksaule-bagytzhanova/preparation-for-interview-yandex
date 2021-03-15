package yandex;

public class LoopControl {
    boolean value = true;
    int a =5, b=7;
    public void foo(){

//        OperatorSwitch os = new OperatorSwitch();
//
//        while (a<b) {
//            System.out.println(a);
//            a++;
//            b = os.foo();
//            if(b>a){
//                break;
//            }
//            else{
//                c++;
//            }
//            break;
//        }

        do {
            a++;
            System.out.println(a);
        }

        while (a<b);

    }
}
