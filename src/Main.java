public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Usando o reprodutor musical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Minha música favorita");
        meuIphone.pausar();

        // Usando o aparelho telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Usando o navegador na internet
        meuIphone.exibirPagina("https://www.exemplo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
