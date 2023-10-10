package telefone;

public class Celular implements AparelhoTelefonico {

    int tentativas = 5;

    public static void main(String[] args) {
        Celular celular = new Celular();
        for (int i = 0; i < celular.tentativas; i++) {
            celular.ligar();
            if (celular.atendido()) {
                celular.atender();
                break; // Encerra o loop se a chamada for atendida
            } else {
                celular.iniciarCorreiodeVoz();
            }
        }
    }

    @Override
    public void ligar() {
        System.out.println("Ligando... ");
    }

    @Override
    public void atender() {
        System.out.println("Atendido! ");
    }

    @Override
    public boolean atendido() {
        return (tentativas <= 0);
    }

    @Override
    public void iniciarCorreiodeVoz() {
        System.out.println("Não atendido, iniciando correio de voz... ");
        tentativas--; // Decrementa o número de tentativas
    }
}