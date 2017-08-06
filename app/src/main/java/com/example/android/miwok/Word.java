package com.example.android.miwok;

/**
 * Created by jiwanpokharel89 on 7/27/2017.
 */

public class Word {
    private String mMiwokWord;
    private String mTranslatedWord;
    private int mResourceId = NO_IMAGE_PROVIDED; //To hold image resource ID.
    private static int NO_IMAGE_PROVIDED = -1;

    public Word(String mMiwokWord, String mTranslatedWord){
        this.mMiwokWord = mMiwokWord;
        this.mTranslatedWord = mTranslatedWord;
    }

    public Word(String mMiwokWord, String mTranslatedWord, int mResourceId) {
        this.mMiwokWord = mMiwokWord;
        this.mTranslatedWord = mTranslatedWord;
        this.mResourceId = mResourceId;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public String getTranslatedWord() {
        return mTranslatedWord;
    }

    public void setTranslatedWord(String mTranslatedWord) {
        this.mTranslatedWord = mTranslatedWord;
    }

    public void setMiwokWord(String miwokWord){
        this.mMiwokWord = miwokWord;
    }

    public int getmResourceId() {
        return mResourceId;
    }

    public void setmResourceId(int mResourceId) {
        this.mResourceId = mResourceId;
    }

    public boolean hasImage(){
        return mResourceId != NO_IMAGE_PROVIDED;
    }
}
