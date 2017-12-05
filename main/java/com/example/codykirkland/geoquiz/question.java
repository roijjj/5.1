package com.example.codykirkland.geoquiz;

/**
 * Created by cody on 9/19/2017.
 */

public class question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mcheat;


    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean ischeat() {
        return mcheat;
    }

    public void setchest(boolean mcheat) {
        mcheat = mcheat;
    }


    public question(int textResId, boolean answerTrue, boolean cheat) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mcheat = cheat;
    }
}
