public class OriginadorPessoal extends Originador {
    protected Emprestimo abrirOperacao() { return new EmprestimoPessoal(); }
}
