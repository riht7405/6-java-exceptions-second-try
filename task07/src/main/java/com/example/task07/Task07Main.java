package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
            // Если исключение не было выброшено, выполнение дойдет сюда
            return NONE;
        } catch (Exception e) {
            // Проверяем, является ли исключение наследником RuntimeException
            if (e instanceof RuntimeException) {
                return UNCHECKED;
            } else {
                return CHECKED;
            }
        }
    }

}