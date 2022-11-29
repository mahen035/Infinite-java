package com.training.exception;

public class MyException extends Exception{

    @Override
    public String toString() {
        return "MyException{} Occurred because age is too less";
    }

    public MyException(String msg){
        super(msg);
    }
}
