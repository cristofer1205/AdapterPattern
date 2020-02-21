package pattern.adapter;

public class EconomicEngine extends Engine {
    public EconomicEngine(){
        super();
        System.out.println("Creando motor economico");
    }

    @Override
    public void turnOn() {
        System.out.println("Encendiendo motor economico.");
    }

    @Override
    public void speedUp() {
        System.out.println("Acelerando motor economico.");
    }

    @Override
    public void turnOff() {
        System.out.println("Apagando motor economico.");
    }
}
