package com.kizhaku.learn.scribble;

@FunctionalInterface
public interface InterfaceScribble {

    default int hello() {
        return 1;
    }

    static void hello2() {
        //do something
    }

    void hello3();

}
