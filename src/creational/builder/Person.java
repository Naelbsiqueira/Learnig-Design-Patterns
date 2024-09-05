package creational.builder;
/*Padrão Builder : É um padrão criacional que permite separar a cronstrução
da sua implementação, de forma que o mesmo processo de construção possa criar
diferentes representações. (construção de objetos com caracteríscan diferentes)
Muito utilizado para criação de objetos complexos, com muitos atributos nos construtores*/
public class Person {
    private String firstname;
    private String lastname;
    private String nickname;
    private String email;

    //Normalmente, os construtores são privado. Forçando a pessoa a usar Builder.
    private Person(String firstname, String lastname, String nickname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public final static class PersonBuilder {
        private String firstname;
        private String lastname;
        private String nickname;
        private String email;
        /*Abaixo temos a criação de método para criação de objetos específicos com
        com retorno do próprio método*/

        public PersonBuilder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public PersonBuilder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public PersonBuilder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }
        public Person build(){
            return new Person(firstname,lastname,nickname, email);
        }
    }
}