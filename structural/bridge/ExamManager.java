class ExamManager {
    private Exam exam;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public void question() {
        exam.question();
    }

    public void nextQuestion() {
        exam.nextQuestion();
    }
}
