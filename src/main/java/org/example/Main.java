package org.example;

import org.example.annotation.method.Math;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {

        Method method = Main.class.getDeclaredMethod("mathSum", int.class, int.class);
        Math mathAnno = method.getAnnotation(Math.class);

        Main main = new Main();
        main.mathSum(mathAnno.num1(), mathAnno.num2());
    }
/**
 * метод додавання 2-х чисел
 * @param num1 - перший доданок
 * @param num2 - другий доданок
 */
    @Math(num1 = 1, num2 = 2)
    public void mathSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}