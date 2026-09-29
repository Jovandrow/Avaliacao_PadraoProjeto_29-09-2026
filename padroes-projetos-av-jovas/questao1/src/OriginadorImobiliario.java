public class OriginadorImobiliario extends Originador {
    protected Emprestimo abrirOperacao() { return new EmprestimoImobiliario(); }
}
