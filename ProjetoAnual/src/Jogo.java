public class Jogo implements IGerarDesconto {
    private final String nome;
    private final EnumTipoDeJogo tipoJogo;
    private final int quantidadeDeJogadores;
    private final String descricao;
    private final double preco;
    public Jogo(String nome, EnumTipoDeJogo tipoJogo, int quantidadeDeJogadores, String descricao, double preco) {
        this.nome = nome;
        this.tipoJogo = tipoJogo;
        this.quantidadeDeJogadores = quantidadeDeJogadores;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    public EnumTipoDeJogo getTipoJogo() {
        return tipoJogo;
    }
    public int getQuantidadeDeJogadores() {
        return quantidadeDeJogadores;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
        return preco;
    }
    @Override
    public double gerarDesconto(Jogo jogo) {
        return getPreco()*0.9;
    }
}
