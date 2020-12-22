interface Builder{
    void start();
    void setAge(int age);
    void setGender(String gender);
    void setHeight(int height);
    Human build();
}
