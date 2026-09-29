public class OriginadorConsignado extends Originador {
    protected Emprestimo abrirOperacao() { return new EmprestimoConsignado(); }
}
