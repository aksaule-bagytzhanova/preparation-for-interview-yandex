package yandex;

public class main {
    public static void main(String[] args){
        //Operation op = new Operation();
        //op.foo();

//        ControlOperators co = new ControlOperators();
//        co.foo();

//        OperatorSwitch op = new OperatorSwitch();
//        op.foo();

//        LoopControl lp = new LoopControl();
//        lp.foo();

//        ForLoop op = new ForLoop();
//        op.foo();

//        MyArrays arrays = new MyArrays();
//        arrays.foo();

//        Constructor flo = new Constructor();
//        flo.foo();

//        Modifiers modifiers = new Modifiers();
//        modifiers.foo();
//        String name = modifiers.name;

        bus1 busi = new bus1();
        int km = busi.showKm();
        System.out.println(km);
        System.out.println(busi.showEngineKm());

        busi.shoKm(45);

    }
}
