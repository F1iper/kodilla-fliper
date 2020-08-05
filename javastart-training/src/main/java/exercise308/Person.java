package exercise308;

import java.util.Objects;

public class Person {
    
    private String name;
    private String lastname;
    private String pesel;
    
    public Person (String name, String lastname, String pesel) {
        this.name = name;
        this.lastname = lastname;
        this.pesel = pesel;
    }
    
    @Override
    public String toString () {
        return "Person{" +
          "name='" + name + '\'' +
          ", lastname='" + lastname + '\'' +
          ", pesel='" + pesel + '\'' +
          '}';
    }
    
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
          Objects.equals(lastname, person.lastname) &&
          Objects.equals(pesel, person.pesel);
    }
    
    @Override
    public int hashCode () {
        return Objects.hash(name, lastname, pesel);
    }
    
    public String getName () {
        return name;
    }
    
    public String getLastname () {
        return lastname;
    }
    
    public String getPesel () {
        return pesel;
    }
}
