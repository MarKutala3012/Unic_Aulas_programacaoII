public class Main {
    public static void main(String[] args) {

        // Objeto Devices
        Devices d = new Devices(150.0, "azul", "Samsung", 'B', 8.0);
        System.out.println("=== Device ===");
        System.out.println("Marca: " + d.getMarca());
        System.out.println("Preco final: " + d.precoFinal() + " euros");

        // Objeto WashingMachine
        WashingMachine wm = new WashingMachine(35.0, 200.0, "branco", "Bosch", 'A', 70.0);
        System.out.println("\n=== Maquina de Lavar ===");
        System.out.println("Marca: " + wm.getMarca());
        System.out.println("Carga: " + wm.getCarga() + " kg");
        System.out.println("Preco final: " + wm.precoFinal() + " euros");

        // Objeto Televisao
        Televisao tv = new Televisao(55, true, 500.0, "preto", "LG", 'C', 15.0);
        System.out.println("\n=== Televisao ===");
        System.out.println("Marca: " + tv.getMarca());
        System.out.println("Resolucao: " + tv.getResolucao() + " polegadas");
        System.out.println("Sintonizador TDT: " + tv.getSintonizadorTDT());
        System.out.println("Preco final: " + tv.precoFinal() + " euros");
    }
}
