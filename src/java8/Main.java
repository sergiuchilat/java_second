package java8;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<PersonModel> persons = Arrays.asList(
                new PersonModel("Ion"),
                new PersonModel("Mihai"),
                new PersonModel("Ana"),
                new PersonModel("Maria"),
                new PersonModel("Ana", 20, 1500F)
        );

        PersonModel searchedPerson = null;
        List<PersonModel> searchedPersons;

        for (PersonModel person : persons) {
            if (person.getName().equals("Ana")) {
                searchedPerson = person;
            }
        }
        System.out.println(searchedPerson.toString());

        PersonModelPredicate personModelPredicate = new PersonModelPredicate();

        searchedPerson = persons.stream().filter(personModelPredicate).findFirst().get();
        Optional<PersonModel> searchedPerson2 = persons
                .stream()
                .filter(personModel -> personModel.getName().equals("Ana"))
                .findFirst();
        System.out.println(searchedPerson2.toString());
        searchedPersons = persons
                .stream()
                .filter(personModel -> personModel.getName().equals("Ana"))
                .collect(Collectors.toList());
        System.out.println(searchedPersons.toString());
        System.out.println(persons.toString());
        persons = persons
                .stream()
                .map((PersonModel personModel) -> new PersonModel(personModel.getName(), personModel.getAge() + 1))
                .collect(Collectors.toList());
        System.out.println(persons.toString());

        System.out.println(
                persons
                        .stream()
                        .map(PersonModel::getSalary)
                        .reduce(0.0F, Float::sum)
        );

//        System.out.println(
//                persons
//                .stream()
//                .reduce()
//        );
        //persons.stream().iterator()
    }
}
