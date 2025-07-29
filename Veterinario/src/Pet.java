import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pet {
    private int id;
    private String nome;
    private String pet;
    private String diagnosticoInicial;
    private int idade;
    private String especie;
    private String raca;
    private String sexo;
    private String coloracao;
    private String status;
    private Date dataEntrada;
    private float peso;

    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    public int getId() {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getDiagnosticoInicial() {
        return diagnosticoInicial;
    }

    public void setDiagnosticoInicial(String diagnosticoInicial) {
        this.diagnosticoInicial = diagnosticoInicial;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColoracao() {
        return coloracao;
    }

    public void setColoracao(String coloracao) {
        this.coloracao = coloracao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDataEntrada(String dataEntrada) {
        try {
            this.dataEntrada = formatter.parse(dataEntrada);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getDataEntrada() {
        return formatter.format(dataEntrada);
    }


    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
