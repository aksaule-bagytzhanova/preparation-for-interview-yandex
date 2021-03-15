package yandex;

public class bus1 {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D23HA6";
    public final int SERIAL_NUMBER2 = 245678;

    public void go(){
        System.out.println("GO");
    }

    public int showKm(){
        int km = 65;
        String str = "70 km";
        return km;

    }

    public Engine showEngineKm(){
        engine = new Engine();
        return engine;
    }

    public void shoKm(int km2){
        km2 = km2 +2;
        System.out.println(km2);
    }




}
