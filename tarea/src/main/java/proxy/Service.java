package proxy;

public class Service implements ServiceInterface{

    public Service() {
        configuracion();
    }

    @Override
    public void proceso() {
        System.out.println("Proceso completo.");
    }

    private void configuracion() {
        System.out.println("Cargando");
    }

}
