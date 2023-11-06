public class Main {

	public static void main(String args[]) {
        configurar();
		esperarPorToken();
		String dado = esperarPorDado();
		lidarComDado(dado);
	}

    public static void configurar() {

    }

    public static void esperarPorToken() {
        ;
    }

    public static String esperarPorDado() {
        return "";
    }

    public static void lidarComDado(String dado) {
        /*
         * if (destino do dado == ip desta máquina)
         *      if (erro)
         *          escrever "NACK"
         *      else
         *          escrever "ACK"
         * else
         *      enviarParaProximaMaquina(); // unicast ou broadcast
         */
    }

}