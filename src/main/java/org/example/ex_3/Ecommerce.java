package org.example.ex_3;

public class Ecommerce {
    public double calculatePrice(double basePrice, int customerType, boolean holiday) {
        double desconto = getCostumerTypeDesconto(customerType);
        desconto += getHolidayDesconto(holiday);
        return calcularDesconto(basePrice,desconto);
    }

    private double getCostumerTypeDesconto(int customerType) {
        final double NEW_CUSTOMER = 0.10;
        final double OLD_CUSTOMER = 0.15;

        return switch (customerType) {
            case 1 -> NEW_CUSTOMER;
            case 2 -> OLD_CUSTOMER;
            default -> 0;
        };
    }

    public double getHolidayDesconto(boolean holiday) {
        return holiday ? 0.05 : 0.0;
    }

    private double calcularDesconto(double basePrice, double desconto) {
        return basePrice * (1 - desconto);
    }
}
