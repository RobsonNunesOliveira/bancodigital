package dio.desafio;

// Entidade: Conta Corrente  Atributos: agencia, numero e saldo

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato ContaCorrente ===");
        super.imprimirInformacoesComuns();

    }
}



