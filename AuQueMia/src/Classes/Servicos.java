package Classes;

public class Servicos {
    private int idServicos;
    private String tipo;
    private double custo;
    private String descricao;
    private Animal id_animal;

    public Servicos(int idServicos, String tipo, double custo, String descricao, Animal id_animal) {
        this.idServicos = idServicos;
        this.tipo = tipo;
        this.custo = custo;
        this.descricao = descricao;
        this.id_animal = id_animal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
