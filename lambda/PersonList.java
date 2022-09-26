package homework.homework5.lambda_stream.lambda;

import java.util.ArrayList;

public class PersonList {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person person1 = new Person("hathang", 12);
        Person person2 = new Person("nam", 12);
        Person person3 = new Person("hiep", 12);
        Person person4 = new Person("minh", 12);
        Person person5 = new Person("oanh", 12);
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person5);

        System.out.println("danh sach ban dau : ");
        System.out.println(personArrayList);

        EditPersonLambda editPersonLambda = (people, name, age, index) -> {
            people.get(index).setName(name);
            people.get(index).setAge(age);
        };

        DeletePersonLambda deletePersonLambda = (people, index) -> {
            people.remove(index);
        };

        System.out.println("danh sach sau khi sua la : ");
        editPersonLambda.apply(personArrayList, "thang", 15, 2);
        System.out.println(personArrayList);

        System.out.println("danh sach sau khi xoa la : ");
        deletePersonLambda.apply(personArrayList, 3);
        System.out.println(personArrayList);
    }
}
