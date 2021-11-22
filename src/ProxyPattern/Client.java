package ProxyPattern;

public class Client {
    public static void main(String[] args) {
        ProxyFileLoader loader = new ProxyFileLoader();
        loader.loadFile("~/test.txt");
        loader.loadFile("~/test.txt");
    }
}
