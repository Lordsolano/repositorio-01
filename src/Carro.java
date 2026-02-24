public class Carro {
    public String modelo;
    public String marca;
    public String cor;
    public int ano;
    public boolean ligado;
    public int aceleracao;


    public Carro(String modelo, String marca, String cor, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.ligado = false;
        this.aceleracao = 0;

    }

    public void ligar() {
        if (this.ligado == true) {
            return;
        }
        this.ligado = true;
    }

    public void desligar() {
        if (!this.ligado){
            return;
        }
        this.aceleracao = 0;
        this.ligado = false;
    }
    public void acelerar(String tipoaceleracao)
    {
        switch (tipoaceleracao) {
            case "forte":
                this.aceleracao += 1000;
                break;
            case "fraca":
                this.aceleracao += 500;
                break;
            default:
                this.aceleracao += 750;
        }
    }
}
