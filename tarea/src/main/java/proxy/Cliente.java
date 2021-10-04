package proxy;

public class Cliente {

    public static void main(String[] args) {
        ServiceInterface proxy = new Proxy();
        proxy.proceso();
        proxy.proceso();
        proxy.proceso();
    }

}
