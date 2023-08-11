package Iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegador.NavegarNaInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegarNaInternet, AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Estou ligando");
    }

    @Override
    public void atender() {
        System.out.println("Estou atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de Voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Esta tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Esta pausado");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione a Musica");
    }
}
