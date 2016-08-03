package com.example.android.miwok;

/**
 * Created by namlu on 03-Aug-16.
 */
public class Word {

    // String for default (English) translation
    private String defaultTranslation;

    // String for Miwok translation
    private String miwokTranslation;

    /*
    * Word constructor
    * */
    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    /*
    * Getter methods
    * */
    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }
}
