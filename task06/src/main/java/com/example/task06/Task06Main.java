package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        new Task06Main().printMethodName();

    }

    void printMethodName() {
        // Получаем текущий стек вызовов
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        // stackTrace[0] -> getStackTrace
        // stackTrace[1] -> printMethodName
        // stackTrace[2] -> метод, который вызвал printMethodName
        String callerMethodName = stackTrace[2].getMethodName();

        // Используем print вместо println, чтобы избежать проблем с \r\n на Windows
        System.out.print(callerMethodName);
    }

}