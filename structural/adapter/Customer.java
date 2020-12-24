class Customer extends Bank implements Card {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCardDetails() {
        System.out.println("Customer Card Details");
        return this.getName() + "::" + this.getAccNumber();
    }
}
