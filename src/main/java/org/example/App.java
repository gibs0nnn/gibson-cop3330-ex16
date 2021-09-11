package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int legalAge = 16;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        int currentAge = scanner.nextInt();

        System.out.println("You are " + (currentAge < 16 ? "not old enough to drive." : "old enough to drive."));

    }
}
