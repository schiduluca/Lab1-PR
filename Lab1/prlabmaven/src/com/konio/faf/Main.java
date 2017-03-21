package com.konio.faf;



/**
 * Created by lschidu on 3/16/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world from Maven project");
        int distance = StringManager.getINSTANCE().with("Hello", "Hello1").calculateLevenshteinDistance();
        System.out.println(distance);
        System.out.println(StringManager.getINSTANCE().with("utm").makeCapital());
        System.out.println(StringManager.getINSTANCE().with("FAF - 1  4  1").deleteWhiteSpaces());
    }
}
