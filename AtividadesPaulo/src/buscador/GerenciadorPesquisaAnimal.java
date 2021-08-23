package buscador;

import animal.Animal;
import util.Leitor;

import java.util.List;

public class GerenciadorPesquisaAnimal {

    private final BuscadorAnimal buscadorAnimal = new BuscadorAnimal();
    private final Leitor leitor = new Leitor();

    public List<Animal> buscaAnimalPorNome(List<Animal> animais){
        String termoPesquisa = this.leitor.leString("Qual sua pesquisa?");
        return buscadorAnimal.buscaNomeAnimal(animais, termoPesquisa);
    }

    public Animal pesquisaAnimalMaiorIdade(List<Animal> animais){
        return buscadorAnimal.pesquisaAnimalMaiorIdade(animais);
    }

    public Animal pesquisaAnimalMaiorPeso(List<Animal> animais){
        return buscadorAnimal.pesquisaAnimalMaiorPeso(animais);
    }
}
