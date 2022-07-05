public class Cartao extends MetodoDePagamento {
    private long numeroCartao;
    private String validadeCartao;
    private String codigoSeguranca;
    private String nomeCompleto;
    private String dataNascimento;

    public Cartao(Conta conta) {
        super(conta);
    }

    public long getNumeroCartao() {
        return numeroCartao;
    }

    public String getValidadeCartao() {
        return validadeCartao;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    

}
