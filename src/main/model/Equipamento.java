package main.model;


public class Equipamento {

    private Long id;
    private Long patrimonio;
    private String nome;
    private String descricao;
    private String localDeUso;
    private String marca;

    public Equipamento(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Long patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalDeUso() {
        return localDeUso;
    }

    public void setLocalDeUso(String localDeUso) {
        this.localDeUso = localDeUso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
