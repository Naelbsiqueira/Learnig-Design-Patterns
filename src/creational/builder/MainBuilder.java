package creational.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstname("Nael")
                .lastname("Bernardo")
                .email("naelbsiqueira@hotmail.com")
                .build();
        System.out.println(build);
    }
}