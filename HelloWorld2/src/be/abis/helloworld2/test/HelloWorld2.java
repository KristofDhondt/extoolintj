package be.abis.helloworld2.test;

import java.util.Scanner;

class Helloworld2 {

    public static void main(String[] args) {

        String name;

        Scanner readName = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = readName.next();
        System.out.println("Hello " + name);

    }
}