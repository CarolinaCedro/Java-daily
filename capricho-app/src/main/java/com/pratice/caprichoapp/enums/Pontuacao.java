package com.pratice.caprichoapp.test01;

public enum Pontuacao {
    FRIENDZONE("Você colocou seu melhor amigo na friendzone. O que é ótimo porque talvez ele seja apenas seu amigo."),
    MAYBE_LOVE("Talvez haja amor, talvez seja hormônios. Vale a pena experimentar uns cinco minutos de trocação de beijo sem estragar a amizade."),
    LOVE("É o amor /Que mexe com minha cabeça e me deixa assim/ Que faz eu pensar em você e esquecer de mim/ Que faz eu esquecer que a vida é feita pra viver");

    private final String message;

    Pontuacao(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
