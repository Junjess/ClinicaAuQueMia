package Classes;

import java.util.Date;

public class Vacina {
    private int idVacina;
    private String nomeVacina;
    private Date data;

    public Vacina(int idVacina, String nomeVacina, Date data) {
        this.idVacina = idVacina;
        this.nomeVacina = nomeVacina;
        this.data = data;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
