package lt.klaipeda.sda.ketvirtaklase.ketvirtaPamoka.NamuDarbai;


public class StringTaskExsekutor {

    public static void execute3Task() {

        String text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(text.toLowerCase());
    }
    public static void execute4Task () {

        String text1 = "avaJ";
        char[] x = text1.toCharArray();
        for (int i = x.length - 1; i >= 0; i--)
            System.out.print(x[i]);
        System.out.println("                 ");

//        StringBuffer text2 = new StringBuffer("avaJ");
//        text2.reverse();
//        System.out.println(text2);
    }
    public static void execute5Task () {

        String text3 = "Programmer";
        System.out.println(text3.substring(0, 5));
    }
    public static void execute6Task () {

        String text5 = "Java";
        String text6 = "Fundamentals";
        System.out.print(text5.substring(1, 4));
        System.out.println(text6.substring(1, 11));
    }
        public static void execute7Task () {
            String text7 = "This is Java!";
            System.out.println(text7.length() + " characters");
        }
            public static void execute8Task () {
                String text8 = "This is a comparison";
                String tex1 = text8.substring(0, 5);
                String tex2 = text8.substring(5, 7);
                String tex3 = text8.substring(7, 11);
                String tex4 = text8.substring(11, 20);
                System.out.println(tex1.toUpperCase() + tex2 + tex3.toUpperCase() + tex4);
            }
        public static void execute9Task () {
            String text9 = "Java exercises";
            System.out.println(text9.substring(11, 14));
        }
        public static void execute10Task () {
            String text10 = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
            int letter = 0;
            int space = 0;
            int number = 0;
            int other = 0;
            for (int i = 0; i < text10.length(); i++) {
                if (Character.isLetter(text10.charAt(i))) {
                    letter++;
                } else if (Character.isSpaceChar(text10.charAt(i))) {
                    space++;
                } else if (Character.isDigit(text10.charAt(i))) {
                    number++;
                } else {
                    other++;
                }
            System.out.println(letter + " letters,");
            System.out.println(space + " spaces,");
            System.out.println(number + " numbers,");
            System.out.println(other + " other symbols.");

                System.out.println("------------------------------------");
        }
    }
}



