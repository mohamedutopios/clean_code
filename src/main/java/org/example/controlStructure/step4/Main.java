package org.example.controlStructure.step4;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction("t1", "PAYMENT", "OPEN", "CREDIT_CARD", "23.99"));
        transactions.add(new Transaction("t2", "PAYMENT", "OPEN", "PAYPAL", "100.43"));
        transactions.add(new Transaction("t3", "REFUND", "OPEN", "CREDIT_CARD", "10.99"));
        transactions.add(new Transaction("t4", "PAYMENT", "CLOSED", "PLAN", "15.99"));

        processTransactions(transactions);
    }

    public static void processTransactions(List<Transaction> transactions) {
        if (isEmpty(transactions)) {
            showErrorMessage("No transactions provided!");
            return;
        }

        for (Transaction transaction : transactions) {
            processTransaction(transaction);
        }
    }

    public static boolean isEmpty(List<Transaction> transactions) {
        return transactions == null || transactions.isEmpty();
    }

    public static void showErrorMessage(String message) {
        System.out.println(message);
    }

    public static void showErrorMessage(String message, Transaction item) {
        System.out.println(message);
        if (item != null) {
            System.out.println(item);
        }
    }


    public static void processTransaction(Transaction transaction) {
        if (!isOpen(transaction)) {
            showErrorMessage("Invalid transaction type!");
            return;
        }

        if (isPayment(transaction)) {
            processPayment(transaction);
        } else if (isRefund(transaction)) {
            processRefund(transaction);
        } else {
            showErrorMessage("Invalid transaction type!", transaction);
        }
    }


    public static boolean isOpen(Transaction transaction) {
        return transaction.getStatus().equals("OPEN");
    }

    public static boolean isPayment(Transaction transaction) {
        return transaction.getType().equals("PAYMENT");
    }

    public static boolean isRefund(Transaction transaction) {
        return transaction.getType().equals("REFUND");
    }

    public static void processPayment(Transaction transaction) {
        if (transaction.getMethod().equals("CREDIT_CARD")) {
            processCreditCardPayment(transaction);
        } else if (transaction.getMethod().equals("PAYPAL")) {
            processPayPalPayment(transaction);
        } else if (transaction.getMethod().equals("PLAN")) {
            processPlanPayment(transaction);
        }
    }

    public static void processRefund(Transaction transaction) {
        if (transaction.getMethod().equals("CREDIT_CARD")) {
            processCreditCardRefund(transaction);
        } else if (transaction.getMethod().equals("PAYPAL")) {
            processPayPalRefund(transaction);
        } else if (transaction.getMethod().equals("PLAN")) {
            processPlanRefund(transaction);
        }
    }

    public static void processCreditCardPayment(Transaction transaction) {
        System.out.println("Processing credit card payment for amount: " + transaction.getAmount());
    }

    public static void processCreditCardRefund(Transaction transaction) {
        System.out.println("Processing credit card refund for amount: " + transaction.getAmount());
    }

    public static void processPayPalPayment(Transaction transaction) {
        System.out.println("Processing PayPal payment for amount: " + transaction.getAmount());
    }

    public static void processPayPalRefund(Transaction transaction) {
        System.out.println("Processing PayPal refund for amount: " + transaction.getAmount());
    }

    public static void processPlanPayment(Transaction transaction) {
        System.out.println("Processing plan payment for amount: " + transaction.getAmount());
    }

    public static void processPlanRefund(Transaction transaction) {
        System.out.println("Processing plan refund for amount: " + transaction.getAmount());
    }
}
