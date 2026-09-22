package encapsulation.class_problems;
class NameTag {
    private final String firstName;
    private final String lastName;

    NameTag(String fullName) {

        String[] name = fullName.split(" ");

        firstName = name[0];
        lastName = name[1];
    }

    String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }
}

public class Main {
    public static void main(String[] args) {

        NameTag tag = new NameTag("Maria Gomez");

        System.out.println("Nickname: " + tag.getNickname());
    }
}
