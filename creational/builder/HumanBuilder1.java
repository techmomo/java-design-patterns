public class HumanBuilder1 {
    private int age;
    private String gender;
    private int height;

    public HumanBuilder1 setAge(int age) {
        this.age = age;
        return this;
    }

    public HumanBuilder1 setHeight(int height) {
        this.height = height;
        return this;
    }

    public HumanBuilder1 setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Human build() {
        Human human = new Human();
        human.setAge(age);
        human.setHeight(height);
        human.setGender(gender);
        return human;
    }
}
