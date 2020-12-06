package lt.klaipeda.sda.ketvirtaklase.antraPamoka;

public class SwichStatment {
    public static void main(String[] args){
        String  name = "Petra";
        int dayofWeekToday = 6;

        switch (dayofWeekToday){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("false");
        }


        switch (name){
            case "Petras":
                System.out.println(name);
            break;
            default:
                System.out.println(name);
            break;
            case "Jonas":
                System.out.println(name);
        }
    }
}