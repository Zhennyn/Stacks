package one.digitalinnovation;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro ("FORD"));
        stackCarros.push(new Carro ("FERRARI"));
        stackCarros.push(new Carro ("BUGATTI"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);
    }
}
