import java.util.Random;

public class Person {
    int id;
    String name;
    String surname;
    int age;
    Boolean has_accepted;
    int role_id;

    public Person(int id, Boolean has_accepted, int role_id){
        this.id = id;
        this.name = getRandomString();
        this.surname = getRandomString();
        this.age = getRandomInt(20, 50);
        this.has_accepted = has_accepted;
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "(" +
                "" + id +
                ", '" + name + '\'' +
                ", '" + surname + '\'' +
                ", " + age +
                ", " + has_accepted +
                ", " + role_id +
                "),";
    }

    private String getRandomString(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = getRandomInt(5, 10);
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    private int getRandomInt(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
