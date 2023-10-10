package musical;

public class Musica implements ReprodutorMusical {

    private int volume = 20;

    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.play();
        musica.next();
        musica.previous();
        musica.adcVolume();
        System.out.println("Volume aumentou para " + musica.getVolume());
        musica.dcrVolume();
        System.out.println("Volume diminuiu para " + musica.getVolume());
        musica.pause();
        
    }

    @Override
    public void play() {
        System.out.println("Você deu play na música... ");
    }

    @Override
    public void pause() {
        System.out.println("Você pausou a música...");
    }

    @Override
    public void next() {
        System.out.println("você passou para a próxima música...");
    }

    @Override
    public void previous() {
        System.out.println("Você voltou uma música...");
    }

    @Override
    public void adcVolume() {
        if(volume < 100){
            volume += 10;
        }
    }

    @Override
    public void dcrVolume() {
        if(volume > 0 ){
            volume -= 10;
        }
    }

    public int getVolume() {
        return volume;
    }

}
