public class BuilderApp {
    public static void main(String[] args) {
        Human human = null;
        Builder builder = new HumanBuilder();
        builder.start();
        builder.setAge(8);
        builder.setGender("F");
        builder.setHeight(166);
        human = builder.build();
        System.out.println(human);
    }
}
