import java.util.Scanner;
public class ProgressaoAritmetica {

    public Integer[] fazProgressaoAritmetica () {

        DadosProgressao dadosProgressao = leDadosProgressao();
        int constantePermanente = dadosProgressao.getConstanteProgressao();
        Integer[] progressao = new Integer[dadosProgressao.getTamanhoProgressao()];
        progressao[0] = 0;

        for (int i = 0; i < progressao.length; i++) {
            progressao[i] = constantePermanente;
            constantePermanente += dadosProgressao.getConstanteProgressao();
        }
        return progressao;
    }

    public DadosProgressao leDadosProgressao(){
        Scanner valor = new Scanner (System.in);
        Integer tamanhoProgressao, constanteProgressao;

        System.out.println("Digite o tamanho da progressão: ");
        tamanhoProgressao = valor.nextInt();
        System.out.println("Digite a constante da progressão: ");
        constanteProgressao = valor.nextInt();

        return new DadosProgressao(tamanhoProgressao, constanteProgressao);
    }
}

class DadosProgressao {

    private Integer tamanhoProgressao;
    private Integer constanteProgressao;

    DadosProgressao(Integer tamanhoProgressao, Integer constanteProgressao){
        this.tamanhoProgressao = tamanhoProgressao;
        this.constanteProgressao = constanteProgressao;
    }

    Integer getConstanteProgressao() {
        return constanteProgressao;
    }

    Integer getTamanhoProgressao() {
        return tamanhoProgressao;
    }
}
