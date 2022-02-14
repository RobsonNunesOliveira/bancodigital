package dio.desafio;

public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected int cpf;
    protected double saldo;
    protected Cliente cliente;




    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
// Método Get: para obter um retorno.

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInformacoesComuns() {
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Conta: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
    }

    // Implementando os métodos da Interface (Contrato)
    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}

