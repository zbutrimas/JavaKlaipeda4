package lt.klaipeda.sda.ketvirtaklase.antraPamoka.namudarbai;

public class ProgramWithSwitch {
    public static void main(String[] args) {

        String area = "lietuva";

        switch (area) {
            case "Asia":
                System.out.println("44 580 000 km²");
                break;
            case "N/S America":
                System.out.println("42 550 000km²");
                break;
            case "Europe":
                System.out.println("10 180 000 km²");
                break;
            case "Antarctica":
                System.out.println("14 200 000 km²");
                break;
            case "Australia":
                System.out.println("8 600 000 km²");
                break;
            case "Africa":
                System.out.println("30 370 000 km²");
                break;
            default:
                System.out.println("Default");
        }
    }
}
