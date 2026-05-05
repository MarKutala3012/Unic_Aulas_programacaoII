public class Televisao extends Devices {
    private static final int RESOLUCAO_PADRAO = 20;
    private static final boolean SINTONIZADOR_PADRAO = false;

    private int resolucao;
    private boolean sintonizadorTDT;

    // Construtor geral
    public Televisao() {
        super();
        this.resolucao = RESOLUCAO_PADRAO;
        this.sintonizadorTDT = SINTONIZADOR_PADRAO;
    }

    // Construtor com preço e peso
    public Televisao(double preco, double peso) {
        super(preco, peso);
        this.resolucao = RESOLUCAO_PADRAO;
        this.sintonizadorTDT = SINTONIZADOR_PADRAO;
    }

    // Construtor com todos os atributos
    public Televisao(int resolucao, boolean sintonizadorTDT, double precoBase,
                     String cor, String marca, char consumoEnergia, double peso) {
        super(precoBase, cor, marca, consumoEnergia, peso);
        this.resolucao = resolucao;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Gets
    public int getResolucao()           { return resolucao; }
    public boolean getSintonizadorTDT() { return sintonizadorTDT; }

    @Override
    public double precoFinal() {
        double preco = super.precoFinal(); // chama o método da classe mãe

        // Resolução superior a 40 polegadas -> +30%
        if (resolucao > 40) preco *= 1.30;

        // Sintonizador TDT -> +50€
        if (sintonizadorTDT) preco += 50;

        return preco;
    }
}
