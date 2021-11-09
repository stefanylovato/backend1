public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Efetivo("Odair", "Antunes", "3898914",
                5000.0, 1000.0, 500.0);
        funcionario1.pagamentoSalario();

        funcionario1 = new Contratado("Marlene", "Peixoto", "8940320", 100.0,80);
        funcionario1.pagamentoSalario();
    }
}
