public class Main {

    public static String IPDaProximaMaquina;
    public static String apelidoDestaMaquina;
    public static Duration tempoParaSoltarToken;
    public static boolean gerarToken;

	public static void main(String args[]) {
        configurar();

        if (gerarToken) {

            gerarToken = false;
        }

		esperarPorToken();
		String dado = esperarPorDado();
		lidarComDado(dado);
	}

    public static void configurar() {
        Scanner scanner = new Scanner(new File("./config"));
        IPDaProximaMaquina = scanner.nextLine();
        apelidoDestaMaquina = scanner.nextLine();
        tempoParaSoltarToken = Duration.ofSeconds(Integer.parseInt(scanner.nextLine()));
        gerarToken = Boolean.parseBoolean(scanner.nextLine());
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