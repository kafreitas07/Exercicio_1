public class Main
{
    public static void main(String[] args)
    {

        Cliente c1 = new Cliente("Sophia", 123456789);
        Cliente c2 = new Cliente("Pedro", 987654321);
        Cliente c3 = null;

        Conta conta = new Conta(200, 100);

        conta.adicionaCliente(c1);
        conta.adicionaCliente(c2);
        conta.adicionaCliente(c3);

        conta.mostraInfo();


        System.out.println("O programa foi executado ate o final");

    }
}