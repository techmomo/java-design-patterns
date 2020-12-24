public class BridgeApp {
    public static void main(String[] args) {
        ExamManager manager = new ExamManager();
        manager.setExam(new OcjpExam());
        manager.question();
        manager.nextQuestion();
    }
}
