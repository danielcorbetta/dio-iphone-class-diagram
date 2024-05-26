package classes;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }

    @Override
    public void selecionarMusica(String muscia) {
        System.out.println("Selecionando música...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página no navegador...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba ao navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}