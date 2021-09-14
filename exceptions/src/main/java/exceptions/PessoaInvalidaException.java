package exceptions;

public class PessoaInvalidaException extends RuntimeException {

    public PessoaInvalidaException(String mensagem){
        super(mensagem);
    }

}
