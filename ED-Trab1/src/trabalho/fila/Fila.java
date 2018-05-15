package trabalho.fila;

/**
 *
 * @author hugo
 */
public interface Fila<T> {

    public void inserir(T valor);

    public boolean estaVazia();

    public T peek();

    public T retirar();

    public void liberar();
}
