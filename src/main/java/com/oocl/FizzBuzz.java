package com.oocl;

public class FizzBuzz {
    private String result;

    public void say(int i) {
        if (i % 3 == 0) {
            this.result = "fizz";
        } else {
            this.result = String.valueOf(i);
        }
    }

    public String getResult() {
        return this.result;
    }
}
