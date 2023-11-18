package com.elif.Proje5;

import java.util.Arrays;

public class StringClass {
    public char [] karakterDizisi;

    public StringClass(char[] karakterDizisi) {
        this.karakterDizisi = karakterDizisi;
    }

    public StringClass() {
    }

    @Override
    public String toString() {
        return "StringClass{" +
                "karakterDizisi=" + Arrays.toString(karakterDizisi) +
                '}';
    }
}
