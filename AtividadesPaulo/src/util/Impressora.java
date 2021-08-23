package util;

import animal.Animal;

import java.util.List;

public class Impressora {

    private Impressora(){}

    public static void imprime(Animal animal){
        System.out.println(animal);
    }

    public static void imprime(List<Animal> animais){
        for (Animal animal: animais){
            imprime(animal);
        }
    }

    public static void imprime(String titulo, Animal animal){
        System.out.println(titulo + animal.toString());
    }
}
