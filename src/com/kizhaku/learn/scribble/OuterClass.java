package com.kizhaku.learn.scribble;

public class OuterClass {
    int x = 10;

    private OuterClass() {}

    public void print(String str) {
        System.out.println(str);
    }

    static class InnerClass {
        public OuterClass outerFactory() {
            return new OuterClass();
        }
    }
}
