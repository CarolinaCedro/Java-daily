package com.pratice.caprichoapp.test02;

import com.pratice.caprichoapp.test01.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionsV2 {
    private List<Question> questions = new ArrayList<>();

    public QuestionsV2() {
        initializeQuestions();
    }

    private void initializeQuestions() {
        questions.add(new Question("Você já sonhou que seu melhor amigo era um unicórnio voando sobre arco-íris cor-de-rosa enquanto segurava um buquê de salsichas?"));
        questions.add(new Question("Você já se viu dançando a dança do frango em homenagem ao aniversário do seu melhor amigo, vestida de pinguim?"));
        questions.add(new Question("Se seu melhor amigo fosse um sorvete, ele seria o sorvete de pistache?"));
        questions.add(new Question("Você pensa em patos de borracha quando olha para o seu melhor amigo?"));
        questions.add(new Question("Você já escreveu um poema de amor épico para o seu melhor amigo usando apenas emojis de vegetais?"));
        questions.add(new Question("Você acha que seu melhor amigo seria um bom companheiro numa luta contra zumbis alienígenas usando almofadas como armas?"));
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
