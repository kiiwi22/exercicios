package pessoa;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibeNome(){
        System.out.println(nome);
    }

}
