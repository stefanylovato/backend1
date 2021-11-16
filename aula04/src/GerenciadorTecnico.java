public class GerenciadorTecnico extends Gerenciador{
    @Override
    public void verificar(Mail mail) {
        if((mail.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) ||
                (mail.getAssunto().equalsIgnoreCase("Tecnico"))){
            System.out.println("Enviado ao departamento técnico");

            if(this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(mail);
            }
        } else{
            if(this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(mail);
            }
        }
    }
}
