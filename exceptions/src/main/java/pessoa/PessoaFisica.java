package pessoa;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void exibeNome() {
        System.out.println("Pessoa física: "+this.getNome());
    }
}
