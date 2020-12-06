package lt.klaipeda.sda.ketvirtaklase.treciaPamoka.namuDarbai;

public class CardAccount {

    String name;
    String surname;
    String jobStatus;
    int balance;
    int costs;

    public CardAccount() {

    }

    public void information() {
        System.out.println("Name - " + name);
        System.out.println("Surname - " + surname);
        System.out.println("Job Status - " + jobStatus);
        boolean ifBalanceLessToCosts;
        boolean ifBalanceMoreToCosts;
        {

            ifBalanceLessToCosts = balance < costs;
            ifBalanceMoreToCosts = balance < costs;

        }
        if (ifBalanceLessToCosts) {
            System.out.println("operation not possible");
        } else if (ifBalanceMoreToCosts) {
            System.out.println("operation possible" + balance);
        } else {
            System.out.println("balance - " + (balance - costs));
        }
    }
}



