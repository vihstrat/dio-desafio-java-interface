
public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Testando iPhone 2007:");

        // Testando Reprodutor Musical
        iphone.selecionarMusica("Uma música qualquer");
        iphone.tocar();
        iphone.pausar();

        // Testando Aparelho Telefônico
        iphone.ligar("1234567890");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando Navegador Internet
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
