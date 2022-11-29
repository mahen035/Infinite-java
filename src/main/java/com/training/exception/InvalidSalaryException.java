package com.training.exception;

public class InvalidSalaryException extends Exception{

    public InvalidSalaryException(String msg){
        super(msg);
    }

    @Override
    public String toString() {
        return "InvalidSalaryException{}";
    }
}
