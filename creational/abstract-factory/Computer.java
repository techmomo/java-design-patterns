public class Computer {
    private Button button;
    private Mouse mouse;

    public Computer(Factory factory){
        button = factory.buttonClick();
        mouse = factory.mouseClick();
    }
    public void execute(){
        button.click();
        mouse.click();
    }
}
