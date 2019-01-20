package com.example.spring5webapp.examplebeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

public class FakeExampleConfig {

    String name;
    String[] names;
    private String poundSign;
    private String bookAuthor;
    private String bookPublisher;
    private boolean truth;
    private boolean anotherTruth;
    private boolean moreTruth;
    private boolean falseVal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setPoundSign(String poundSign) {
        this.poundSign = poundSign;
    }

    public String getPoundSign() {
        return poundSign;
    }

    public void setTruth(boolean truth) {
        this.truth = truth;
    }

    public boolean getTruth() {
        return truth;
    }

    public void setAnotherTruth(boolean anotherTruth) {
        this.anotherTruth = anotherTruth;
    }

    public boolean getAnotherTruth() {
        return anotherTruth;
    }

    public void setMoreTruth(boolean moreTruth) {
        this.moreTruth = moreTruth;
    }

    public boolean getMoreTruth() {
        return moreTruth;
    }

    public boolean isFalseVal() {
        return falseVal;
    }

    public void setFalseVal(boolean falseVal) {
        this.falseVal = falseVal;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    @Override
    public String toString() {
        return "FakeExampleConfig{" +
                "name='" + name + '\'' +
                ", names=" + Arrays.toString(names) +
                ", poundSign='" + poundSign + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                ", truth=" + truth +
                ", anotherTruth=" + anotherTruth +
                ", moreTruth=" + moreTruth +
                ", falseVal=" + falseVal +
                '}';
    }
}
