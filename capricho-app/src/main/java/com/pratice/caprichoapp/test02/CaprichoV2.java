package com.pratice.caprichoapp.test02;

import java.util.List;
import java.util.Scanner;

public class CaprichoV1 {
    public static void main(String[] args) {
        Questions questionSet = new Questions();

        Scanner sc = new Scanner(System.in);

        Integer countYes = 0;

        System.out.println("Seja bem vindo a Capricho magazine");
        System.out.println("***** Vamos começar *****");
        System.out.println("Responda com s(Sim) ou n(Nao) as perguntas seguintes: ");

        List<Question> questions = questionSet.getQuestions();

        for (Question question : questions) {
            System.out.println(question.getQuestionText());

            char character;
            do {
                System.out.print("Digite s para Sim ou n para Não: ");
                character = sc.next().toLowerCase().charAt(0);

                if (character == 's') {
                    countYes++;
                } else if (character == 'n') {
                    // não sei o que fazer aqui por enquanto já que n precisa ser tratado
                } else {
                    System.out.println("Entrada inválida. Tente novamente!");
                }
            } while (character != 's' && character != 'n');
        }

        //com if e else

//
//        if (countYes <= 2) {
//            System.out.println(Pontuacao.FRIENDZONE.getMessage());
//        } else if (countYes <= 4) {
//            System.out.println(Pontuacao.MAYBE_LOVE.getMessage());
//        } else {
//            System.out.println(Pontuacao.LOVE.getMessage());
//        }


        //com ternario rs
        System.out.println(
                countYes <= 2 ? Pontuacao.FRIENDZONE.getMessage() :
                        countYes <= 4 ? Pontuacao.MAYBE_LOVE.getMessage() :
                                Pontuacao.LOVE.getMessage()
        );


    }
}
