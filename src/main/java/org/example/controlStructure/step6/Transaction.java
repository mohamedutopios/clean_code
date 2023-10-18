package org.example.controlStructure.step6;

class Transaction {
    private final String id;
    private final String type;
    private final String status;
    private final String method;
    private final String amount;

    public Transaction(String id, String type, String status, String method, String amount) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.method = method;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getMethod() {
        return method;
    }

    public String getAmount() {
        return amount;
    }
}







