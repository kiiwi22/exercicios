package arquivo;

import pessoa.Pessoa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArmazenadorPessoa {

    public void armazenaPessoa(Pessoa pessoa){
        File file = new File("pessoas.txt");
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("Nome da pessoa " + pessoa.getNome());
            bw.close();
            fw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

}
