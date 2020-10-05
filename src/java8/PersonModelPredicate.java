package java8;

import java.util.function.Predicate;

public class PersonModelPredicate implements Predicate<PersonModel> {

    @Override
    public boolean test(PersonModel personModel) {
        return personModel.getName().equals("Ana");
    }
}
