public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv  smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Está ligada " + smartTv.ligada);
        System.out.println("Canal Atual " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Está ligada " + smartTv.ligada);

        smartTv.mudarDeCanal(54);
        smartTv.aumentarCanal();
        System.out.println("Canal Atual " + smartTv.canal);
    }
}
