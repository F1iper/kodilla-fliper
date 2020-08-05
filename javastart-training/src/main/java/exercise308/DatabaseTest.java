package exercise308;

public class DatabaseTest {
    
    public static void main (String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.add(new Person("Jan", "Kowalski", "12345"));
        database.add(new Person("Ania", "Zalewska", "234567"));
        database.add(new Person("Karol", "Piotrowski", "345678"));
        database.add(new Person("Patryk", "Bielecki", "45678"));
        Person person = database.get(1);
        Person p1 = database.get(0);
        System.out.println(person);
        System.out.println(p1);
        System.out.println(database.size());
        database.remove(new Person("Patryk", "Bielecki", "45678"));
        System.out.println(database.size());
        System.out.println(database);
        database.add(null);
    }
}
