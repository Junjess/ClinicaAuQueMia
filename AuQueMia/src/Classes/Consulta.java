package Classes;

import java.util.Date;

public class Consulta {
    private int idConsulta;
    private Date dataHora;
    private String descricao;
    private String tratamento;
    private double custo;
    private Animal idPet;
    private Veterinario idVet;
    private boolean tomouVacina;

    public Consulta(int idConsulta, Date dataHora, String descricao, String tratamento, double custo, Animal idPet, Veterinario idVet, boolean tomouVacina) {
        this.idConsulta = idConsulta;
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.tratamento = tratamento;
        this.custo = custo;
        this.idPet = idPet;
        this.idVet = idVet;
        this.tomouVacina = tomouVacina;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public boolean isTomouVacina() {
        return tomouVacina;
    }

    public void setTomouVacina(boolean tomouVacina) {
        this.tomouVacina = tomouVacina;
    }
    
    
}
