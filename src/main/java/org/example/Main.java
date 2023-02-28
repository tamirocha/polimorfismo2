package org.example;

public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Lobo b = new Lobo();
        Mamifero m = new Mamifero();

        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5);
        c.reagir(17, 4.5);
        c.emitirSom();

        b.emitirSom();

    }
}