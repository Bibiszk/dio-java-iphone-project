public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Reprodutor Musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Aparelho Telefônico
        meuIphone.ligar("11999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Navegador na Internet
        meuIphone.exibirPagina("www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}