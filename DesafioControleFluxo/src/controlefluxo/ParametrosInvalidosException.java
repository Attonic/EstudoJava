package controlefluxo;
/**
 * Esta classe representa uma exceção
 *
 * */
public class ParametrosInvalidosException extends Exception {
    /**
     * Constrói uma nova exceção
     * @param menssagem;
     * */
    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
        System.out.println("Mensagem: " + mensagem);
    }
}
