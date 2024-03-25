package Classes;

public class Animal {
    private int idAanimal;
    private String nomeAnimal;
    private String especie;
    private String raca;
    private int idade;
    private String genero;
    private Cliente idDono;
    private Vacina idVacina;

    public Animal(int idAanimal, String nomeAnimal, String especie, String raca, int idade, String genero, Cliente idDono, Vacina idVacina) {
        this.idAanimal = idAanimal;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.genero = genero;
        this.idDono = idDono;
        this.idVacina = idVacina;
    }
    
    

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
