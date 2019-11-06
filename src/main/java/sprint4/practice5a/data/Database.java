package sprint4.practice5a.data;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Person> telephoneBook;

    public Database() {
        telephoneBook = new ArrayList<>();
        Person jack = new Person("Jack","1234","1998-01-01","jack@gmail.com");
        Person mike = new Person("Mike","5678","1998-02-02","mike@gmail.com");
        Person tom = new Person("Tom","91011","1998-03-03","tom@gmail.com");
        telephoneBook.add(jack);
        telephoneBook.add(mike);
        telephoneBook.add(tom);
    }

    public Person getPerson(String name){
        Person person = null;
        for(Person p : telephoneBook){
            if(p.getName().equals(name)){
                person = p;
                break;
            }
        }
        return person;
    }
}
