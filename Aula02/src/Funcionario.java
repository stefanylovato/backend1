public abstract class Funcionario {

    private String nome;
    private String sobrenome;
    private String numeroConta;

    public Funcionario(String nome, String sobrenome, String numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
    }

    public void pagamentoSalario(){
        double quantia;
        quantia = calcularPagamento();
        imprimirRecibo(quantia);
        depositar(quantia);
    }

    public abstract double calcularPagamento();
    public abstract void imprimirRecibo(double quantia);
    public void depositar(double quantia){
        System.out.println("Foi depositada uma quantia de R$"+quantia+" na conta "+numeroConta+" de "+nome+" "+sobrenome);;
    };
}
