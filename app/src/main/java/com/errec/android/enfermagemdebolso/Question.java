package com.errec.android.enfermagemdebolso;

/**
 * Created by ${Raniro} on ${29/04/2016}.
 */
public class Question {

    private String questionHeader;
    private String questionBody;
    private String item1;
    private String item2;
    private String item3;
    private String item4;
    private String item5;
    private String answer;

    public Question(String questionHeader, String questionBody, String item1, String item2, String item3, String item4, String item5, String answer) {
        this.questionHeader = questionHeader;
        this.questionBody = questionBody;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.answer = answer;
    }

    public String getQuestionHeader() {
        return questionHeader;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public String getItem1() {
        return item1;
    }

    public String getItem2() {
        return item2;
    }

    public String getItem3() {
        return item3;
    }

    public String getItem4() {
        return item4;
    }

    public String getItem5() {
        return item5;
    }

    public String getAnswer() {
        return answer;
    }
}