package com.smartphone.entities;

import com.smartphone.interfaces.AparelhoTelefonico;
import com.smartphone.interfaces.NavegadorDeInternet;
import com.smartphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo: " + url);
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Add aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }
}
