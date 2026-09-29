public class Main {
    public static void main(String[] args) {
        System.out.println("=== Reserva Brasil ===");
        new ConfirmacaoReserva(new FabricaBrasil())
                .confirmar("Ana Souza", "123.456.789-09", 1000);

        System.out.println("=== Reserva Portugal ===");
        new ConfirmacaoReserva(new FabricaPortugal())
                .confirmar("João Silva", "123456789", 1000);
    }
}
