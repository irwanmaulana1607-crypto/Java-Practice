public class tws {

    String charge = "USB C";
    String[] controls = {"volume", "noise cancel", "sleep built"};
    String color = "Black";

    static boolean power = false;
    static int volume = 0;

    public static void powerOn() {
        power = true;
    }

    public static void powerOff() {
        power = false;
    }

    public static void volumeUp() {
        volume++;
    }

    public static void volumeDown() {
        volume--;
    }
}