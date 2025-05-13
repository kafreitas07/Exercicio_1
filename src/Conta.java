import java.util.*; // importa as classe do pacote java.util (Hashset, set...)

public class Conta
{
    private float saldo;
    private float limite;
    private Set<Cliente> clientes = new HashSet<>();


    public Conta(float saldo, float limite)
    {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void adicionaCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }

    public void mostraInfo()
    {
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);


        for (Cliente cliente : clientes)
        {
            try
            {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Cpf: " + cliente.getCpf());
            }
            catch (NullPointerException e)
            {
                System.out.println("Nenhum cliente registrado");
            }
        }
    }
}