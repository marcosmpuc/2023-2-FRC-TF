import java.io.File;
import java.util.Scanner;
import java.time.Duration;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main {

    public static String IPDaProximaMaquina;
	public static int portaDaProximaMaquina;
    public static String apelidoDestaMaquina;
    public static Duration tempoParaSoltarToken;
    public static boolean gerarToken;

	public static void main(String args[]) throws Exception {
	        configurar();
	
	        if (gerarToken) {
	
	            gerarToken = false;
	        }

		conectar();
		
		esperarPorToken();
		String dado = esperarPorDado();
		lidarComDado(dado);
	}

    public static void configurar() throws Exception {
        Scanner scanner = new Scanner(new File("./config"));
        String IPEPorta = scanner.nextLine();
		IPDaProximaMaquina = IPEPorta.split(":")[0];
		portaDaProximaMaquina = Integer.parseInt(IPEPorta.split(":")[1]);
        apelidoDestaMaquina = scanner.nextLine();
        tempoParaSoltarToken = Duration.ofSeconds(Integer.parseInt(scanner.nextLine()));
        gerarToken = Boolean.parseBoolean(scanner.nextLine());
    }

	public static void conectar() throws Exception {
		String mensagemTeste = "suco de laranja";
		
		DatagramSocket socketEnvio = new DatagramSocket();
		InetAddress inetProximaMaquina = InetAddress.getByName(IPDaProximaMaquina);
		DatagramPacket pacote = new DatagramPacket(mensagemTeste.getBytes(), mensagemTeste.length(), inetProximaMaquina, portaDaProximaMaquina);
		socketEnvio.send(pacote);
	}

    public static void esperarPorToken() {
        ;
    }

    public static String esperarPorDado() throws Exception {
		byte[] dadosTeste = new byte[1024];
		
		DatagramSocket socketRecebimento = new DatagramSocket(portaDaProximaMaquina);
		DatagramPacket pacote = new DatagramPacket(dadosTeste, dadosTeste.length);
		socketRecebimento.receive(pacote);
		return pacote.getData().toString();
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
