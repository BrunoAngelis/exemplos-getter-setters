public enum EstadoBrasileiro {
    SAO_PAULO("São Paulo","SP"),
    RIO_JANEIRO("Rio de Janeiro", "RJ"),
    PIAUI("Piaui","PA"),
    MARANHÃO("Maranhão","MA"),
    BELO_HORIZONTE("Belo Horizonte", "BH");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    private String nomeMaisculo(){
        return nome.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaisculo(){
        return nomeMaisculo();
    }
}
