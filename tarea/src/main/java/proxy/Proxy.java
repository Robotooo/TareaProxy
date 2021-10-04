package proxy;

public class Proxy implements  ServiceInterface{
    private static ServiceInterface objeto;

    @Override
    public void proceso() {
        if (objeto == null) {
            objeto = new Service();
        }
        objeto.proceso();
    }
}

