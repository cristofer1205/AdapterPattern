package pattern.adapter;

public class CommonEngine extends Engine {

    public CommonEngine(){
        super();
        System.out.println("Creando el motor comun");
    }

    @Override
    public void turnOn() {
        System.out.println("encendiendo motor comun");
    }

    @Override
    public void speedUp() {
        System.out.println("acelerando el motor comun");
    }

    @Override
    public void turnOff() {
        System.out.println("Apagando motor comun");
    }
}
