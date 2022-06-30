public class Jogo implements IGerarDesconto {
    private final String nome;
    private final EnumTipoDeJogo tipoJogo;
    private final EnumPlataforma plataforma;
    private final EnumQuantidadeJogadores quantidadeJogadores;
    private final String descricao;
    private final double preco;
    public Jogo(String nome, EnumTipoDeJogo tipoJogo,EnumPlataforma plataforma, EnumQuantidadeJogadores quantidadeJogadores, String descricao, double preco) {
        this.nome = nome;
        this.tipoJogo = tipoJogo;
        this.quantidadeJogadores = quantidadeJogadores;
        this.plataforma = plataforma;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    public EnumTipoDeJogo getTipoJogo() {
        return tipoJogo;
    }
    public EnumQuantidadeJogadores getQuantidadeJogadores() {
        return quantidadeJogadores;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
        return preco;
    }
    public EnumPlataforma getPlataforma() {
        return plataforma;
    }
    @Override
    public double gerarDesconto(Jogo jogo) {
        return jogo.getPreco() * 0.9;
    }

    @Override
    public String toString() {
        System.out.println("==========| Jogo |==========");
        return "Nome do Jogo: " + nome + "\n"
                + "Tipo de Jogo : " + tipoJogo + "\n"
                + "Quantidade de Jogadores : " + quantidadeJogadores + "\n"
                + "Plataforma : " + plataforma + "\n"
                + "Descrição : " + descricao + "\n"
                + "Preço : " + "R$ " + preco;
    }
}
