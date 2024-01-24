package com.epam.design.patterns.creational.abstractfactory;

class PaymentGatewayFactory {
    public static PaymentGateway createPaymentGateway(String gatewayType) {
        switch (gatewayType.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            default:
                throw new IllegalArgumentException("Invalid payment gateway type: " + gatewayType);
        }
    }
}
