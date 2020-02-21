package pattern.adapter;

public class EngineElectricAdapter extends Engine {
    private ElectricEngine electricEngine;

    public EngineElectricAdapter(){
        super();
        this.electricEngine = new ElectricEngine();
        System.out.println("Creando motor Electrico adapter");
    }
    @Override
    public void turnOn() {
        System.out.println("Encendiendo engineElectricAdapter");
        this.electricEngine.connect();
        this.electricEngine.activate();
    }

    @Override
    public void speedUp() {
        System.out.println("Acelerando motor electrico...");
        this.electricEngine.increaseSpeed();
    }

    @Override
    public void turnOff() {
        System.out.println("Apagando motor electrico");
        this.electricEngine.stop();
        this.electricEngine.disconnect();
    }
}
