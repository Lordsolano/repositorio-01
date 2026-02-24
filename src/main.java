public class main
{
    public static void main(String[] args)
    {
        Carro fusca = new Carro("fusca","volkswagen","verde",1997);
        fusca.ligar();
        fusca.acelerar("forte");

        System.out.println(fusca.aceleracao);
        System.out.println(fusca.ligado);
    }
}
