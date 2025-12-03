package org.example.ex_2;

public class Invoice {
    private String clientName;
    private String clientEmail;
    private double amount;
    private int type;

    public Invoice(String clientName, String clientEmail, double amount, int type) {
        if (clientEmail == null || !clientEmail.contains("@")) {
            throw new IllegalArgumentException("Email inválido. Falha no envio.");
        }
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.amount = amount;
        this.type = type;
    }

    public void processarInvoice() {
        String tipoNota = getTipoNotaFiscal();
        System.out.println(tipoNota);

        ImprimirNota();

        enviarPorEmail();
    }

    private boolean isValidEmail() {
        return clientEmail != null && clientEmail.contains("@");
    }

    public String getTipoNotaFiscal() {
        return switch (type) {
            case 1 -> "Nota fiscal simples";
            case 2 -> "Nota fiscal com imposto";
            default -> "Tipo desconhecido";
        };
    }

    public String getTipoAbrebreviadoNotaFiscal() {
        return switch (type) {
            case 1 -> "Simples";
            case 2 -> "Com imposto";
            default -> "Desconhecido";
        };
    }

    public void ImprimirNota() {
        System.out.println("--- NOTA FISCAL ---");
        System.out.println("Cliente: " + clientName);
        System.out.println("Valor: R$ " + amount);
        System.out.println("Tipo: " + getTipoAbrebreviadoNotaFiscal());
        System.out.println("---------------------");
    }

    public void enviarPorEmail() {
        System.out.println("Enviando email para: " + clientEmail);
        System.out.println("Conteúdo:\n" +
                "--- NOTA FISCAL ---\n" +
                "Cliente: " + clientName + "\n" +
                "Valor: R$ " + amount + "\n" +
                "Tipo: " + (type == 1 ? "Simples" : type == 2 ? "Com imposto" : "Desconhecido") + "\n" +
                "---------------------");
    }
}

