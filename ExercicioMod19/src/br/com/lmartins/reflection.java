package br.com.lmartins;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class reflection {

	public static void main(String[] args) {
        Class<?> clazz = Anotacao.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = clazz.getAnnotation(Tabela.class);
            String nomeTabela = tabelaAnnotation.nome();
            System.out.println(nomeTabela);
        } else {
            System.out.println("A Tabela não está presente na classe.");
        }
    }
}