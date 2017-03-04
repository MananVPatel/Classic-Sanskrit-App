package com.example.android.miwok;

/**
 * Created by mananpatel on 8/11/16.
 */
public class Word {
    private String sanskritWord;
    private String defaultWord;

    public Word(String defaultWord, String sanskritWord) {
        this.defaultWord = defaultWord;
        this.sanskritWord = sanskritWord;
    }

    public String getSanskritWord() {
        return sanskritWord;
    }

    public String getDefaultWord() {
        return defaultWord;
    }
}
