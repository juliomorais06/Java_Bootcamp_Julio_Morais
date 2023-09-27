package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExemploPredicate {
    public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<String> linguagens = Arrays.asList("Java", "Kotlin", "Javascript", "C#", "Ruby");

    // Usar o Predicate com expressão lambda para filtrar números pares
    Predicate<String> acimaCincoLetras = palavra -> palavra.length() > 5;

    // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
    List<String> numerosPares = linguagens.stream()
        .filter(acimaCincoLetras)
        .collect(Collectors.toList());

    // Imprimir a lista de números pares
    numerosPares.forEach(System.out::println);
  }
}
