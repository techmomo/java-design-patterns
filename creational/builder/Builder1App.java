public class Builder1App {
    public static void main(String[] args) {
        Human human = new HumanBuilder1()
                .setAge(10)
                .setGender("F")
                .setGender("M")
                .setHeight(150)
                .build();

        System.out.println(human);
    }
}
