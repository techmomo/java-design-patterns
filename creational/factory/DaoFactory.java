package factory;

public class DaoFactory {
    public static Dao getDao(DaoType daoType) throws Exception {
        Dao dao = null;
        if (daoType.equals(DaoType.USER)) {
            dao = new UserDao();
        } else if (daoType.equals(DaoType.PRODUCT)) {
            dao = new ProductDao();
        } else {
            throw new Exception("Invalid Dao name specified");
        }
        return dao;
    }
}
