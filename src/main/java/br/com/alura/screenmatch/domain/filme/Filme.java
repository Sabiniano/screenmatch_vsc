package br.com.alura.screenmatch.domain.filme;

public class Filme {
    
    //Attributes
    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoLancamento;
    private String genero;

    //Constructor
    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();
    }

    // Metodos especificos
    @Override
    public String toString() {
        return "Filme [nome=" + nome + ", duracaoEmMinutos=" + duracaoEmMinutos + ", anoLancamento=" + anoLancamento
                + ", genero=" + genero + "]";
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    

    

}
