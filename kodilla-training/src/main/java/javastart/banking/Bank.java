package javastart.banking;

public class Bank {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "123456";
        Address address1 = new Address();
        address1.city = "Warsaw";
        address1.postalNumber ="02-508";
        address1.street = "Puławska";
        address1.houseNumber = 53;
        address1.flatNumber = 30;
        person1.registeredAddress = address1;
        person1.livingAddress = address1;

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Person person2 = new Person();
        person2.firstName = "Marta";
        person2.lastName = "Kowalski";
        person2.pesel = "123456";
        Address address2 = new Address();
        address2.city = "Krakow";
        address2.postalNumber = " 97-000";
        address2.street = "Warszawska";
        address2.houseNumber = 10;
        address2.flatNumber = 5;
        person2.registeredAddress = address2;
        person2.livingAddress = person1.livingAddress;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5000;

        System.out.println("Osoba 1: ");
        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.println("Mieszka w miejscowosci: " + person1.livingAddress.city);
        System.out.println("Stan konta: " + account1.balance);

        System.out.println("Osoba 2: ");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("Mieszka w miejscowosci: " + person2.livingAddress.city);
        System.out.println("Stan konta: " + account2.balance);


    }
}