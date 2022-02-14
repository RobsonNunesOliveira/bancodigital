package dio.desafio;

public interface Iconta {

    // Métodos: Indicam açao.
     void sacar(double valor);

     void depositar(double valor);

     void transferir(double valor, Conta contaDestino);

     void imprimirExtrato();
}
