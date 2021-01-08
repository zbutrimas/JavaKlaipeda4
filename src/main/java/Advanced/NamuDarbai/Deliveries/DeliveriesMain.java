package Advanced.NamuDarbai.Deliveries;

import java.util.ArrayList;
import java.util.List;

import static Advanced.NamuDarbai.Deliveries.GadgetType.*;

public class DeliveriesMain {

    public static Company getMostExpensiveGadgetCompany(List<Company> companies){
        Company mostExpensiveGadgetCompany = companies.get(0);
        for (Company company : companies) {
            if (company.getGadget().getPrice() > mostExpensiveGadgetCompany.getGadget().getPrice()) {
                mostExpensiveGadgetCompany = company;
            }
        }
        return mostExpensiveGadgetCompany;
    }
    public static void main(String[] args) {

        Person person1 = new Person("Jonas", "Danes g.15", PHONE, 2020 - 12 - 12);
        Person person2 = new Person("Antanas", "Sausio g.178", LAPTOP, 2021 - 1 - 18);
        Person person3 = new Person("Petras", "Molo g.87", TV, 2021 - 2 - 8);
        Company company1 = new Company("Telia", "Klaipeda", new Gadget(PHONE, 1000, new Courier("DPD", "Klaipeda", 2020 - 12 - 28)));
        Company company2 = new Company("Bite", "Vilnius", new Gadget(LAPTOP, 1549, new Courier("LTPastas", "Vilnius", 2021 - 1 - 28)));
        Company company3 = new Company("Tele2", "Kaunas", new Gadget(TV, 2299, new Courier("Omniva", "Klaipeda", 2021 - 2 - 14)));

        List<Company> companies = new ArrayList<>();
        companies.add(company1);
        companies.add(company2);
        companies.add(company3);

        System.out.println("Company, that has most expensive gadget is:  "+
                getMostExpensiveGadgetCompany(companies));
    }
}
