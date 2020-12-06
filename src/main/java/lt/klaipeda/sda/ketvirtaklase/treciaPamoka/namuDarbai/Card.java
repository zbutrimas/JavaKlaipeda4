package lt.klaipeda.sda.ketvirtaklase.treciaPamoka.namuDarbai;

public class Card {
    public static void main(String[] args){

        CardAccount human;

        human = new CardAccount();
        human.name = "Tomas";
        human.surname = "Tomaitis";
        human.jobStatus = "Dirbantis";
        human.balance = 400;
        human.costs = 400;

        human.information();


        }

    }


