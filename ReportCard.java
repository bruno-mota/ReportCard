package com.example.bruno.reportcard;
public class ReportCard {
    private char historyGrade;
    private char mathGrade;
    private char englishGrade;
    private char spanishGrade;
    private char physicsGrade;
    public char getHistoryGrade() {
        return historyGrade;
    }
    public void setHistoryGrade(char Grade) {
        historyGrade = Grade;
    }
    public char getMathGrade() {
        return mathGrade;
    }
    public void setMathGrade(char Grade) {
        mathGrade = Grade;
    }
    public char getEnglishGrade() {
        return englishGrade;
    }
    public void setEnglishGrade(char Grade) {
        englishGrade = Grade;
    }
    public char getSpanishGrade() {
        return spanishGrade;
    }
    public void setSpanishGrade(char Grade) {
        spanishGrade = Grade;
    }
    public char getPhysicsGrade() {
        return physicsGrade;
    }
    public void setPhysicsGrade(char Grade) {
        physicsGrade = Grade;
    }
    public ReportCard() {
        ReportCard history = new ReportCard();
        history.setMathGrade('D');
        ReportCard math = new ReportCard();
        math.setMathGrade('A');
        ReportCard english = new ReportCard();
        english.setEnglishGrade('B');
        ReportCard spanish = new ReportCard();
        spanish.setMathGrade('C');
        ReportCard physics = new ReportCard();
        physics.setMathGrade('F');
    }
    @Override
    public String toString() {
        String hGrade = Character.toString(historyGrade);
        String mGrade = Character.toString(mathGrade);
        String eGrade = Character.toString(englishGrade);
        String sGrade = Character.toString(spanishGrade);
        String pGrade = Character.toString(physicsGrade);
        return "ReportCard{" +
                "History Grade=" + hGrade +
                "; Math Grade=" + mGrade +
                "; English Grade=" + eGrade +
                "; Spanish Grade=" + sGrade +
                "; Physics Grade=" + pGrade +
                '}';
    }
}

