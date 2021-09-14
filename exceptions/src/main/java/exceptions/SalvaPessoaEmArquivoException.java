package exceptions;

import java.io.IOException;

public class SalvaPessoaEmArquivoException extends IOException {
    public SalvaPessoaEmArquivoException(String mensagem, Throwable ex){
        super(mensagem,ex);
    }
}
