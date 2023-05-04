package individual.task3;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SaveService saveService = new SaveService();

        Map<Person, Address> personAddressMap = saveService.read("personAddressMap");
        print(personAddressMap);
//        Key: Person{firstName='Dany', lastName='Williams'} Address: Address{postCode=789, city='Texas', street='19th Street'}
//        Key: Person{firstName='John', lastName='Smith'} Address: Address{postCode=123, city='New-York', street='Wall Street'}
//        Key: Person{firstName='Mike', lastName='Johnson'} Address: Address{postCode=456, city='Denver', street='South Broadway'}

        Person personToFindAddress = inputPerson();
        if (personAddressMap.containsKey(personToFindAddress)) {
            System.out.println("Address: " + personAddressMap.get(personToFindAddress));
        } else {
            System.out.println("No address found");
        }

        System.out.println("Keys:");
        Set<Person> personSet = personAddressMap.keySet();
        for (Person person : personSet) {
            System.out.println(person);
        }
//        Keys:
//        Person{firstName='Dany', lastName='Williams'}
//        Person{firstName='John', lastName='Smith'}
//        Person{firstName='Mike', lastName='Johnson'}

        Person personToDelete = inputPerson();
//        Enter firstName
//        John
//        Enter lastName
//        Smith
        personSet.remove(personToDelete);

        print(personAddressMap);
//        Key: Person{firstName='Dany', lastName='Williams'} Address: Address{postCode=789, city='Texas', street='19th Street'}
//        Key: Person{firstName='Mike', lastName='Johnson'} Address: Address{postCode=456, city='Denver', street='South Broadway'}
    }

    private static Person inputPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName = scanner.nextLine();
        System.out.println("Enter lastName");
        String lastName = scanner.nextLine();
        return new Person(firstName, lastName);
    }

    private static void print(Map<Person, Address> personAddressMap) {
        for (Map.Entry<Person, Address> personAddressEntry : personAddressMap.entrySet()) {
            System.out.println("Key: " + personAddressEntry.getKey() + " Address: " + personAddressEntry.getValue());
        }
    }
}
