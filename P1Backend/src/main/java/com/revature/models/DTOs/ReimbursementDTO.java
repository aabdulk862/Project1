package com.revature.models.DTOs;

public class ReimbursementDTO {
    private int reimId;
    private String description;
    private double amount;
    private String status;
    private int userId; // Flatten the User relationship to just the ID

    public ReimbursementDTO() {
    }

    public ReimbursementDTO(int reimId, String description, double amount, String status, int userId) {
        this.reimId = reimId;
        this.description = description;
        this.amount = amount;
        this.status = status;
        this.userId = userId;
    }

    public int getReimId() {
        return reimId;
    }

    public void setReimId(int reimId) {
        this.reimId = reimId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ReimbursementDTO{" +
                "reimId=" + reimId +
                ", description='" + description + '\'' +
                ", amount='" + amount + '\'' +
                ", status='" + status + '\'' +
                ", userId=" + userId +
                '}';
    }
}
