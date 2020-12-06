package lt.sda.javafundamentals.task13;

import java.util.Scanner;

public class WriteSutters {

            public static void main(String args[]){
                Scanner keyboard = new Scanner(System.in);
                String aString = "";

                while(true){
                    aString = keyboard.next();
                    System.out.print(aString + " " + aString + " ");
                }
            }
        }


