public class WashingMachine extends Devices {
    private static final double CARGA_PADRAO = 5.0;
    private double carga;

    // Construtor geral
    public WashingMachine() {
        super();
        this.carga = CARGA_PADRAO;
    }

    // Construtor com preço e peso
    public WashingMachine(double preco, double peso) {
        super(preco, peso);
        this.carga = CARGA_PADRAO;
    }

    // Construtor com todos os atributos
    public WashingMachine(double carga, double precoBase, String cor,
                          String marca, char consumoEnergia, double peso) {
        super(precoBase, cor, marca, consumoEnergia, peso);
        this.carga = carga;
    }

    // Get
    public double getCarga() { return carga; }

    @Override
    public double precoFinal() {
        double preco = super.precoFinal(); // chama o método da classe mãe

        // Preço por tamanho da carga
        if (carga >= 0 && carga <= 19)       preco += 10;
        else if (carga >= 20 && carga <= 49) preco += 50;
        else if (carga >= 50 && carga <= 79) preco += 80;
        else if (carga > 80)                 preco += 100;

        // Carga superior a 30 kg -> +50€
        if (carga > 30) preco += 50;

        return preco;
    }
}
