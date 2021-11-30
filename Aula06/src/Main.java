public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Interestellar","EUA");
        Filme filme2 = new Filme("Dona Flor","Brasil");
        Filme filme3 = new Filme("Y Tu Mama Tambien","Colômbia");
        Filme filme4 = new Filme("A Pele Que Habito","Argentina");

        GradeDeFilmes catalogo = new GradeDeFilmes();

        catalogo.addFilme(filme1);
        catalogo.addFilme(filme2);
        catalogo.addFilme(filme3);
        catalogo.addFilme(filme4);

        IGradeDeFilmes clienteArgentina = new GradeDeFilmesProxy(11,117,222,244,catalogo);

        try {
            clienteArgentina.getFilme("Dona Flor");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

        try {
            clienteArgentina.getFilme("A Pele Que Habito");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

        IGradeDeFilmes clienteBrasil = new GradeDeFilmesProxy(72,117,222,244,catalogo);

        try {
            clienteBrasil.getFilme("Dona Flor");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

        try {
            clienteBrasil.getFilme("Interestellar");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

        IGradeDeFilmes clienteColombia = new GradeDeFilmesProxy(112,117,222,244,catalogo);

        try {
            clienteColombia.getFilme("Y Tu Mama Tambien");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

        try {
            clienteColombia.getFilme("Interestellar");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

    }

}

// etapa 1: cliente pede nome do filme String filme. Retorna um objeto filme (contem o link)
// pedido do cliente vem com IP 4 inteiros int IP 255.255.255.255 (de 0 a 255).
// Primeiro int do IP mostra de onde vem:
// 0-49: Argentina
// 50 - 99: Brasil
// 100 - 149: Colômbia
// Uma Interface IGradeDeFilmes que define um método getFilme que recebe o nome, devolvendo um objeto filme.
// Uma classe GradeDeFilmes que implementa a interface IGradeDeFilmes e devolve um filme.
// classe proxy tem atributo IP pede um filme à GradeDeFilmes - com getFilme e "filtra" de acordo com o país.