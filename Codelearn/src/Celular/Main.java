package Celular;

public class Main {
    public static void main(String[] args) {
        Celular c = new Celular("Black", "AiPepinoX", "CodePHONE" );
        c.toString();
        Smartphone sm = new Smartphone("White","Universe 9", "CodePHONE", 18.0, 8.0, 512.0);
        sm.toString();
        c.call("Barbar");
        c.endCall();
        sm.call("Fairy");
        sm.endCall();
    }
}
