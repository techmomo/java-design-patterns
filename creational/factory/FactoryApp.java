package factory;

public class FactoryApp {
    public static void main(String[] args) {

        try {
            Dao dao = DaoFactory.getDao(DaoType.USER);

            User user = new User();
            dao.save(user);

            Dao dao1 = DaoFactory.getDao(DaoType.PRODUCT);

            Product product= new Product();
            dao1.save(product);

            // with using enums we dont need this anymore now
//            Dao dao2 = DaoFactory.getDao("something-else");
//            dao2.save(user);

        }catch (Exception ex){
            System.err.println(ex);
        }
    }
}
