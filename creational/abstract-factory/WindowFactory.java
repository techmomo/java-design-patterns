class WindowFactory implements Factory{
    public Button buttonClick(){
        return new Windowbutton();
    }
    public Mouse mouseClick(){
        return new Windowmouse();
    }
}