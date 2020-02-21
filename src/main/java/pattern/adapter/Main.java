package pattern.adapter;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        System.out.println("\n******************Motor Comun*********************");
        main.useCommonMotor();
        System.out.println("**************************************************\n");
        System.out.println("*****************Motor Economico******************");
        main.useEconomicMotor();
        System.out.println("**************************************************\n");
        System.out.println("*****************Motor Electrico******************");
        main.useElectricMotor();
        System.out.println("**************************************************\n");
    }

    private void useCommonMotor() {
        Engine engine = new CommonEngine();
        engine.turnOn();
        engine.speedUp();
        engine.turnOff();
    }

    private void useElectricMotor() {
        Engine engine = new EngineElectricAdapter() ;
        engine.turnOn();
        engine.speedUp();
        engine.turnOff();
    }

    private void useEconomicMotor() {
        Engine engine = new EconomicEngine();
        engine.turnOn();
        engine.speedUp();
        engine.turnOff();
    }
}
