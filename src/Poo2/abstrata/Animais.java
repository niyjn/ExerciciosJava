package Poo2.abstrata;

abstract class Animal {
    public void emitirSom(){}
}

class Cachorro extends Animal {
    public void emitirSom(){
        System.out.println("auau");
    };
}

class Gato extends Animal {
    public void emitirSom(){
        System.out.println("meau");
    }
}

public class Animais {
    public static void main(String[] args) {
        Animal[] animais = new Animal[2];

        animais[0] = new Cachorro();
        animais[1] = new Gato();

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
