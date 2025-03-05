package com.smartphone.application;

import com.smartphone.entities.Iphone;

public class Program {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Solider Side");
        System.out.println();

        iphone.ligar("4002-8922");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();

        iphone.exibirPagina("www.google.com");
        iphone.adcionarNovaAba();
        iphone.atualizarPagina();

    }
}
