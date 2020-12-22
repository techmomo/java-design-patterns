class MacFactory implements Factory{
    public Button buttonClick(){
        return new Macbutton();
    }
    public Mouse mouseClick(){
        return new Macmouse();
    }
}