package zoologico;

import java.util.ArrayList;

public class CadastradorAnimal extends Animal{

    private final Leitor leitor = new Leitor();

    public int quantidadeAnimaisCadastrados() {
        return leitor.leInteiro("Quantos animais deseja cadastrar?");
    }

    public ArrayList<Animal> cadastrandoAnimais(){
        int qtdAnimais = quantidadeAnimaisCadastrados();

        ArrayList<Animal> animais = new ArrayList<Animal>(qtdAnimais);

        Animal[] animal = new Animal[qtdAnimais];
        int especie;
        String nome;
        Integer idade;
        Double peso;

        for(int i = 0; i < qtdAnimais; i++) {
            animal[i] = new Animal();
            nome = leitor.leString("Qual o nome do animal?");
            animal[i].setNome(nome);
            idade = leitor.leInteiro("Qual a idade do animal?");
            animal[i].setIdade(idade);
            peso = leitor.leDouble("Qual o peso do animal?");
            animal[i].setPeso(peso);
            especie = leitor.leInteiro("Qual a espécie do animal? Digite 1 - Leão, 2 - Elefante, ou 3 - Macaco");
            switch(especie) {
                case 1:animal[i].setEspecieAnimal(getEspecieAnimal().Leão);
                break;
                case 2:animal[i].setEspecieAnimal(getEspecieAnimal().Elefante);
                break;
                case 3:animal[i].setEspecieAnimal(getEspecieAnimal().Macaco);
                break;
                default:
                    System.out.println("Código inválido.");
            }
            animais.add(animal[i]);
        }
        return animais;
    }
}
