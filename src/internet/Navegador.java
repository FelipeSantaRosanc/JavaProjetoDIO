package internet;

public class Navegador implements Internet {

    public static void main(String[] args) {
        Navegador navegador = new Navegador();

        navegador.adcNovaPagina();
        navegador.exibirPagina();
        navegador.atualizarPagina();
        navegador.excluirPagina();

    }

    @Override
    public void exibirPagina() {

        System.out.println("A página foi exibida! ");
    }

    @Override
    public void adcNovaPagina() {

        System.out.println("Adicionando nova página!");
    }

    @Override
    public void excluirPagina() {

        System.out.println("Página excluida! ");
    }

    @Override
    public void atualizarPagina() {

        System.out.println("Página atualizada!");
    }

}
