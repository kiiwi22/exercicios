package validador;

import exceptions.PessoaInvalidaException;
import pessoa.Pessoa;

public class ValidadorPessoa {

    public void validaPessoa(Pessoa pessoa){
        if(pessoa.getNome() == null || pessoa.getNome().isEmpty()){
            throw new PessoaInvalidaException("O nome da pessoa deve ser fornecido!");
        }
    }

}
