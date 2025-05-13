public class Main
{
    public static void main(String[] args)
    {

        Cliente c1 = new Cliente("Kaik", 111222333);
        Cliente c2 = new Cliente("Cris", 333222111);
        Cliente c3 = null;

        Conta conta = new Conta(1000, 300);
        conta.adicionaCliente(c1);
        conta.adicionaCliente(c2);
        conta.adicionaCliente(c3);

        conta.mostraInfo();

        System.out.println("O código foi executado ate o final");

    }
}