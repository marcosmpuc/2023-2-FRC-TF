import java.util.Queue;
import java.util.PriorityQueue;

public class FilaDeMensagens { 

    public int limiteDeMensagens = 10;
    public PriorityQueue<String> fila = new PriorityQueue<>();

    public int adicionar(String dado) {
        if (fila.size() < limiteDeMensagens) {
            fila.add(dado);
            return fila.size() - 1;
        }
        return -1;
    }

    public String retirarProximo() {
        return fila.remove();
    }


}
