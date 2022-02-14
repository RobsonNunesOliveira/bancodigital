package dio.desafio;

public class Main {
    public static void main(String[] args) {
        Cliente Robson = new Cliente();
        Robson.setNome("Robson");

        Conta cc = new ContaCorrente(Robson);
        Conta poupanca = new ContaPoupanca(Robson);

        cc.depositar(100);
        cc.transferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
