import java.util.Date;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String rg;
    private String nomeVacina;
    private Date data;

    public Pessoa(String nome, String sobrenome, String rg, String nomeVacina, Date data) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.nomeVacina = nomeVacina;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Object[] informacoes(){
        Object[] informacao = new Object[3];
        informacao[0]=rg;
        informacao[1]=data;
        informacao[2]=nomeVacina;
        return informacao;
    }
}
