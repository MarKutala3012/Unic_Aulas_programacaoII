public class Devices {
    // Constantes padrão
    protected static final String COR_PADRAO = "branco";
    protected static final char CONSUMO_PADRAO = 'F';
    protected static final double PRECO_PADRAO = 100.0;
    protected static final double PESO_PADRAO = 5.0;

    // Atributos
    protected double precoBase;
    protected String cor;
    protected String marca;
    protected char consumoEnergia;
    protected double peso;

    // Construtor geral
    public Devices() {
        this.precoBase = PRECO_PADRAO;
        this.cor = COR_PADRAO;
        this.marca = "";
        this.consumoEnergia = CONSUMO_PADRAO;
        this.peso = PESO_PADRAO;
    }

    // Construtor com preço e peso
    public Devices(double preco, double peso) {
        this.precoBase = preco;
        this.peso = peso;
        this.cor = COR_PADRAO;
        this.marca = "";
        this.consumoEnergia = CONSUMO_PADRAO;
    }

    // Construtor com todos os atributos
    public Devices(double precoBase, String cor, String marca, char consumoEnergia, double peso) {
        this.precoBase = precoBase;
        this.cor = verificarColor(cor);
        this.marca = marca;
        this.consumoEnergia = checkEnergyConsumption(consumoEnergia);
        this.peso = peso;
    }

    // Gets
    public double getPrecoBase()    { return precoBase; }
    public String getCor()          { return cor; }
    public String getMarca()        { return marca; }
    public char getConsumoEnergia() { return consumoEnergia; }
    public double getPeso()         { return peso; }

    // Verifica consumo de energia (privado)
    private char checkEnergyConsumption(char letter) {
        char l = Character.toUpperCase(letter);
        if (l >= 'A' && l <= 'F') return l;
        return CONSUMO_PADRAO;
    }

    // Verifica cor (privado)
    private String verificarColor(String color) {
        String c = color.toLowerCase();
        if (c.equals("branco") || c.equals("preto") || c.equals("vermelho")
                || c.equals("azul") || c.equals("cinza")) {
            return c;
        }
        return COR_PADRAO;
    }

    // Preço final baseado no consumo de energia
    public double precoFinal() {
        double preco = precoBase;
        switch (consumoEnergia) {
            case 'A': preco += 100; break;
            case 'B': preco += 80;  break;
            case 'C': preco += 60;  break;
            case 'D': preco += 50;  break;
            case 'E': preco += 30;  break;
            case 'F': preco += 10;  break;
        }
        return preco;
    }
}
