public class CheckMail {
    Gerenciador inicial;

    public CheckMail(){
        this.inicial = new GerenciadorGerencia();
        Gerenciador tecnico = new GerenciadorTecnico();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador spam = new GerenciadorSpam();

        inicial.setGerenciadorSeguinte(tecnico);
        tecnico.setGerenciadorSeguinte(comercial);
        comercial.setGerenciadorSeguinte(spam);

//        inicial.setGerenciadorSeguinte(new GerenciadorTecnico()
//                .setGerenciadorSeguinte(new GerenciadorComercial()
//                        .setGerenciadorSeguinte(new GerenciadorSpam())));

    }

    public void verificarEmails(Mail mail){
        inicial.verificar(mail);
    }
}
