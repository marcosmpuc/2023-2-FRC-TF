import java.util.Queue;

public class FileDeMensagens { 

    public int limiteDeMensagens = 10;
    public Queue<String> fila = new Queue<>();

    public int adicionar(String dado) {
        if (fila.size() < limiteDeMensagens) {
            fila.add(dado);
            return fila.size() - 1;
        }
        return -1;
    }

    public String retirarProximo() {
        fila.remove();
    }


}