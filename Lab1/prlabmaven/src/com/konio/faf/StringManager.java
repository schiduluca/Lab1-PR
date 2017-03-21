package com.konio.faf;

import org.apache.commons.lang.StringUtils;

/**
 * Created by lschidu on 3/16/17.
 */
public class StringManager {
    private static StringManager INSTANCE;
    private String stringOne;
    private String stringTwo;

    private StringManager() {}

    public static StringManager getINSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new StringManager();
        }

        return INSTANCE;
    }

    public StringManager with(String stringOne, String stringTwo) {
        this.stringOne = stringOne;
        this.stringTwo = stringTwo;
        return this;
    }

    public StringManager with(String stringOne) {
        this.stringOne = stringOne;
        return this;
    }

    public int calculateLevenshteinDistance() {
        return StringUtils.getLevenshteinDistance(stringOne, stringTwo);
    }

    public String makeCapital() {
        return StringUtils.capitalize(stringOne);
    }

    public String deleteWhiteSpaces() {
        return StringUtils.deleteWhitespace(stringOne);
    }



}
