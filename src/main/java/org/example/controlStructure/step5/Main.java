package org.example.controlStructure.step5;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction("t1", "PAYMENT", "OPEN", "CREDIT_CARD", "23.99"));
        transactions.add(new Transaction("t2", "PAYMENT", "OPEN", "PAYPAL", "100.43"));
        transactions.add(new Transaction("t3", "REFUND", "OPEN", "CREDIT_CARD", "10.99"));
        transactions.add(new Transaction("t4", "PAYMENT", "CLOSED", "PLAN", "15.99"));

        try {
            processTransactions(transactions);
        } catch (Exception e) {
            showErrorMessage(e.getMessage());
        }
    }

    public static void processTransactions(List<Transaction> transactions) throws Exception {
        if (isEmpty(transactions)) {
            Exception error = new Exception("No transactions provided!");
            error.printStackTrace();
            throw error;
        }

        for (Transaction transaction : transactions) {
            try {
                processTransaction(transaction);
            } catch (Exception e) {
                showErrorMessage(e.getMessage());
            }
        }
    }

    public static boolean isEmpty(List<Transaction> transactions) {
        return transactions == null || transactions.isEmpty();
    }

    public static void showErrorMessage(String message) {
        System.out.println(message);
    }

    public static void processTransaction(Transaction transaction) throws Exception {
        if (!isOpen(transaction)) {
            Exception error = new Exception("Invalid transaction type.");
            error.printStackTrace();
            throw error;
        }

        if (!isPayment(transaction) && !isRefund(transaction)) {
            Exception error = new Exception("Invalid transaction type!");
            error.printStackTrace();
            throw error;
        }

        if (usesTransactionMethod(transaction, "CREDIT_CARD")) {
            processCreditCardTransaction(transaction);
        } else if (usesTransactionMethod(transaction, "PAYPAL")) {
            processPayPalTransaction(transaction);
        } else if (usesTransactionMethod(transaction, "PLAN")) {
            processPlanTransaction(transaction);
        }
    }

    public static boolean isOpen(Transaction transaction) {
        return transaction.getStatus().equals("OPEN");
    }

    public static boolean usesTransactionMethod(Transaction transaction, String method) {
        return transaction.getMethod().equals(method);
    }

    public static boolean isPayment(Transaction transaction) {
        return transaction.getType().equals("PAYMENT");
    }

    public static boolean isRefund(Transaction transaction) {
        return transaction.getType().equals("REFUND");
    }

    public static void processCreditCardTransaction(Transaction transaction) {
        if (isPayment(transaction)) {
            processCreditCardPayment(transaction);
        } else if (isRefund(transaction)) {
            processCreditCardRefund(transaction);
        }
    }

    public static void processPayPalTransaction(Transaction transaction) {
        if (isPayment(transaction)) {
            processPayPalPayment(transaction);
        } else if (isRefund(transaction)) {
            processPayPalRefund(transaction);
        }
    }

    public static void processPlanTransaction(Transaction transaction) {
        if (isPayment(transaction)) {
            processPlanPayment(transaction);
        } else if (isRefund(transaction)) {
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
