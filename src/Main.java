import Iphone.Iphone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        // Navegar na internet
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        //Aparelho Telefonico
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        //Reprodutor de Musica
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

    }
}