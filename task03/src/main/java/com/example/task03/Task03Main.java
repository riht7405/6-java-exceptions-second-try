package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        try {
            throwCheckedException();
        } catch (Exception e) {
            System.out.println("Поймали исключение: " + e.getMessage());
        }

    }

    public static void throwCheckedException() throws Exception {
        throw new Exception("Это проверяемое (checked) исключение");
    }
}