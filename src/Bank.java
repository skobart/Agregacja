/**
 * Created by Bartłomiej Skorowski on 09.01.2020.
 */
public class Bank {
    public static void main(String[] args) {

        //osoba pierwsza
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "90120508956";
        //adres
        Address address1 = new Address();
        address1.street = "ul. Jakaś";
        address1.houseNumber = 5;
        address1.flatNumber = 25;
        address1.postalCode = "98-659";
        address1.city = "Rogi";
        person1.livingAddress = address1;
        person1.registeredAddress = address1;
        //konto
        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;
        //kredyt
        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5000;
        credit1.cashReturn = 0;
        credit1.interestRate = 0.10;
        credit1.termMonths = 12;

        //osoba 2
        Person person2 = new Person();
        person2.firstName = "Matylda";
        person2.lastName = "Mahoń";
        person2.pesel = "69040812456";
        person2.livingAddress = person1.livingAddress;
        person2.registeredAddress = new Address();
        person2.registeredAddress.street = "Mała";
        person2.registeredAddress.houseNumber = 45;
        person2.registeredAddress.flatNumber = 0;
        person2.registeredAddress.postalCode = "75-654";
        person2.registeredAddress.city = "Konnica";

        //konto bankowe
        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5_000;

        System.out.println("Osoba");
        System.out.println(person1.firstName + " " + person1.lastName + ", Pesel: " + person1.pesel);
        System.out.println("Zamieszkała w miejscowości: " + person1.livingAddress.city);
        System.out.println("Posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("Posiada kredyt w wysokoci: " + credit1.cashBorrowed);

        System.out.println("Osoba");
        System.out.println(person2.firstName + " " + person2.lastName + ", Pesel: " + person2.pesel);
        System.out.println("Zamieszkała w miejscowości: " + person2.livingAddress.city);
        System.out.println("Posiada konto bankowe z kwotą: " + account2.balance);





    }
}
