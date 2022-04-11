package com.lab2.problem2;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       Money currency = new Money();
        System.out.print("Enter the size of currency denominations: ");
        int size = scanner.nextInt();
        int[] currencyDenominations = currency.SetCurrencyDenominations(size);

        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();
        currency.PayAmount(currencyDenominations, amount);
    }
}