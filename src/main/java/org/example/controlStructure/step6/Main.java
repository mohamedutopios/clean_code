package org.example.controlStructure.step6;


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
            showErrorMessage("Aucune transaction fournie !");
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
            showErrorMessage("Type de transaction non valide !");
            return;
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

    public static void processCreditCardTransaction(Transaction transaction) {
        if (isPayment(transaction)) {
            processCreditCardPayment(transaction);
        } else if (isRefund(transaction)) {
            processCreditCardRefund(transaction);
        } else {
            showErrorMessage("Type de transaction non valide !", transaction);
        }
    }

    public static boolean isPayment(Transaction transaction) {
        return transaction.getType().equals("PAYMENT");
    }

    public static boolean isRefund(Transaction transaction) {
        return transaction.getType().equals("REFUND");
    }

    public static void processPayPalTransaction(Transaction transaction) {
        if (isPayment(transaction)) {
            processPayPalPayment(transaction);
        } else if (isRefund(transaction)) {
            processPayPalRefund(transaction);
        } else {
            showErrorMessage("Type de transaction non valide !", transaction);
        }
    }

    public static void processPlanTransaction(Transaction transaction) {
        if (isPayment(transaction)) {
            processPlanPayment(transaction);
        } else if (isRefund(transaction)) {
            processPlanRefund(transaction);
        } else {
            showErrorMessage("Type de transaction non valide !", transaction);
        }
    }

    public static void processCreditCardPayment(Transaction transaction) {
        System.out.println(
                "Traitement du paiement par carte de crédit pour un montant de : " + transaction.getAmount()
        );
    }

    public static void processCreditCardRefund(Transaction transaction) {
        System.out.println(
                "Traitement du remboursement par carte de crédit pour un montant de : " + transaction.getAmount()
        );
    }

    public static void processPayPalPayment(Transaction transaction) {
        System.out.println(
                "Traitement du paiement PayPal pour un montant de : " + transaction.getAmount()
        );
    }

    public static void processPayPalRefund(Transaction transaction) {
        System.out.println(
                "Traitement du remboursement PayPal pour un montant de : " + transaction.getAmount()
        );
    }

    public static void processPlanPayment(Transaction transaction) {
        System.out.println(
                "Traitement du paiement par plan pour un montant de : " + transaction.getAmount()
        );
    }

    public static void processPlanRefund(Transaction transaction) {
        System.out.println(
                "Traitement du remboursement par plan pour un montant de : " + transaction.getAmount()
        );
    }
}
