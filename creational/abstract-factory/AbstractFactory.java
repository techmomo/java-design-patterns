class AbstractFactory {
    public static Factory getFactory(String osType) {
        Factory factory = null;
        if (osType.equalsIgnoreCase("MAC")) {
            factory = new MacFactory();

        } else if (osType.equalsIgnoreCase("WIN")) {
            factory = new WindowFactory();
        }

        return factory;
    }
}
