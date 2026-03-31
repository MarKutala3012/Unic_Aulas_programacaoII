# Unic_Aulas_programacaoII
Aulas sobre orientação a objectos onde irei postar todos os dados e resolução de exercicios aplicando a linguagem java


package retangulo;
public class retangulo1 {
   private double altura;
   private double largura;
   private int x;
   private int y;

   
    public retangulo1() {
        this.altura = 5.5;
        this.largura = 6.2;
        this.x = 2;
        this.y = 3;
    }
   
    public retangulo1(double altura, double largura, int x, int y) {
        this.altura = altura;
        this.largura = largura;
        this.x = x;
        this.y = y;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
   
}
    



