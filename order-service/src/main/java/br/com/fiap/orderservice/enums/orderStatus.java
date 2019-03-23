package br.com.fiap.orderservice.enums;

public enum orderStatus {
    PENDING,
    PROCESSING,
    IN_WAITING,
    WAITING_PAYOUT_CONFIRMATION,
    PAYOUT_CONFIRMED,
    SHIPPING,
    COMPLETED,
    CANCELED
}
