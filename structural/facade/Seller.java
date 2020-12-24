class Seller {
    Phone iphone;
    Phone nexus;
    public Seller(){
        iphone = new Iphone();
        nexus = new Nexus();
    }
    public void sellIphone(){
        iphone.price();
    }
    public void sellNexus(){
         nexus.price();
    }
}
