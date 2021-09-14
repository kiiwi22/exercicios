package main;

import arquivo.ArmazenadorPessoa;
import pessoa.Pessoa;
import validador.ValidadorPessoa;

public class Main {

    public static void main(String[] args) {
        ArmazenadorPessoa armazenadorPessoa = new ArmazenadorPessoa();
        ValidadorPessoa validadorPessoa = new ValidadorPessoa();

        Pessoa pessoa = new Pessoa(null);

        validadorPessoa.validaPessoa(pessoa);

        armazenadorPessoa.armazenaPessoa(pessoa);

    }
}
