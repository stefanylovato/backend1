public interface IGradeDeFilmes {
    public abstract Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException;
}
