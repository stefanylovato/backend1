public class Main {
    public static void main(String[] args) {
        ComputadorFactory computador = new ComputadorFactory();

        Computador mac = computador.getComputador(8,500,1);
        Computador windows = computador.getComputador(16,128,2);
        Computador mac2 = computador.getComputador(16,128,3);
        Computador windows2 = computador.getComputador(16,128,2);

        System.out.println(mac);
        System.out.println(windows);
        System.out.println(mac2);
        System.out.println(windows2);
    }
}
