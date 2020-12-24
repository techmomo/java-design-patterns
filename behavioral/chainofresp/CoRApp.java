
public class CoRApp {
    public static void main(String[] args) {
        Logger logger = changeOfResp();
        logger.message("Text Logger");

    }
    private static Logger changeOfResp(){
        Logger windowLogger = new WindowLogger();
        Logger textLogger = new TextLogger();
        //windowLogger.message(" Hello Windows");
        windowLogger.setNext(textLogger);
        return windowLogger;
    }
}
