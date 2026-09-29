import java.util.List;

// Produto: abstração da operação de crédito
public interface Emprestimo {
    String modalidade();
    double taxaPrimeiroMes();
    List<String> documentos();
}
