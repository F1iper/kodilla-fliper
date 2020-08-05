package exercise308;

import java.util.Arrays;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    private Person[] people = new Person[INITIAL_CAPACITY];
    private int emptySpace = 0;
    
    public void add(Person person) {
    if(person == null)
        throw new NullPointerException("Person cannot be null");
    if(emptySpace == people.length) {
        people = Arrays.copyOf(people, people.length * 2);
    }
    people[emptySpace] = person;
    emptySpace++;
    }
    
    public void remove(Person person) {
        if (person == null)
            throw new NullPointerException("Person cannot be null");
        final int notFound = -1;
        int foundIndex = notFound;
        for (int i = 0; i < emptySpace && foundIndex == notFound; i++) {
            if (person.equals(people[i])) {
                foundIndex = i;
            }
        }
        if (foundIndex != notFound) {
            System.arraycopy(people, foundIndex + 1, people, foundIndex, people.length - foundIndex - 1);
            emptySpace--;
            people[emptySpace] = null;
        }
    }
    
    public Person get(int index) throws ArrayIndexOutOfBoundsException{
        if (index >= emptySpace || index < 0)
            throw new ArrayIndexOutOfBoundsException("Index has to be positive and lower than " + emptySpace);
        return people[index];
    }
    
    public int size() {
    return emptySpace;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonDatabase size: ");
        sb.append(emptySpace);
        sb.append("\n");
        for (int i = 0; i < emptySpace; i++) {
            sb.append(" > ");
            sb.append(people[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
    
}
