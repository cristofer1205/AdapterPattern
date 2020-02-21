package pattern.adapter;

public class ElectricEngine {
    private boolean connected = false;

    public ElectricEngine() {
        System.out.println("Creando motor electrico");
        this.connected = false;
    }

    public void connect() {
        System.out.println("Conectando motor electrico");
        this.connected = true;
    }

    public void activate() {
        if (!this.connected) {
            System.out.println("No se puede activar porque no " +
                    "esta conectado el motor electrico");
        } else {
            System.out.println("Esta conectado, activando motor" +
                    " electrico....");
        }
    }

    public void increaseSpeed() {
        if (!this.connected) {
            System.out.println("No se puede mover rapido el motor " +
                    "electrico porque no esta conectado...");
        } else {
            System.out.println("Moviendo mas rapido...aumentando voltaje");
        }
    }

    public void stop() {
        if (!this.connected) {
            System.out.println("No se puede detener motor electrico" +
                    " porque no esta conectado");
        } else {
            System.out.println("Deteniendo motor electrico");
        }
    }

    public void disconnect() {
        System.out.println("Desconectando motor electrico...");
        this.connected = false;
    }
}
