public class HumanBuilder implements Builder {

    private Human human = null;

    @Override
    public void start() {
        human = new Human();
    }

    @Override
    public void setAge(int age) {
        human.setAge(age);
    }

    @Override
    public void setGender(String gender) {
        human.setGender(gender);
    }

    @Override
    public void setHeight(int height) {
        human.setHeight(height);
    }
    @Override
    public Human build() {
        return human;
    }
}
