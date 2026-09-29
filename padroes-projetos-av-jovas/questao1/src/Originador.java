// Creator: o procedimento de concessão existe uma única vez, aqui.
public abstract class Originador {

    // Método fábrica: cada modalidade decide qual operação criar
    protected abstract Emprestimo abrirOperacao();

    // Procedimento fixo (final): criar, calcular juros e imprimir resumo
    public final void conceder(String cliente, double valor) {
        Emprestimo op = abrirOperacao();
        double juros = valor * op.taxaPrimeiroMes();

        System.out.println("Modalidade: " + op.modalidade());
        System.out.println("Cliente: " + cliente);
        System.out.printf("Juros do 1º mês: R$ %.2f%n", juros);
        System.out.println("Documentos: " + String.join(", ", op.documentos()));
        System.out.println();
    }
}
