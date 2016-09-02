package com.example.android.miwok;

/**
 * Created by namlu on 03-Aug-16.
 */
public class Word {

    // String for default (English) translation
    private String defaultTranslation;

    // String for Miwok translation
    private String miwokTranslation;

    // Used to indicate if an imageResId was assigned with a valid image ID or not
    private static final int NO_IMAGE = -1;
    private static final int NO_AUDIO = -2;

    // Retrieves a resource ID for image
    private int imageResId = NO_IMAGE;

    // Resource ID for audio
    private int audioResId = NO_AUDIO;

    /*
    * Creates a new Word object
    *
    * @param defaultTranslation is the word in a language that use is familiar with,
    *   in this case English
    * @param miwokTranslation is the word in the Miwok language
    * @param audioResId is the audio resource ID associated with this word
    */
    public Word(String defaultTranslation, String miwokTranslation, int audioResID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResId = audioResID;
    }

    /*
    * Creates a new Word object w/ image and audio
    *
    * @param defaultTranslation is the word in a language that use is familiar with,
    *   in this case English
    * @param miwokTranslation is the word in the Miwok language
    * @param imageResID is the resource ID for the image asset
    * @param audioResId is the audio resource ID associated with this word
    */
    public Word(String defaultTranslation, String miwokTranslation, int imageResId, int audioResId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResId = imageResId;
        this.audioResId = audioResId;
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

    public int getImageResId() {
        return imageResId;
    }

    public boolean hasImage(){
        return imageResId != NO_IMAGE;
    }

    public int getAudioResId() {
        return audioResId;
    }
}
