package com.oocl;

public class FizzBuzz {
    private String result;

    public FizzBuzz() {
        this.result = "";
    }

    public void say(int i) {
        if (i % 3 == 0) {
            this.result += "Fizz";
        }

        if (i % 5 == 0) {
            this.result += "Buzz";
        }

        this.result = this.result.length() > 0 ? this.result : String.valueOf(i);
    }

    public String getResult() {
        return this.result;
    }
}
