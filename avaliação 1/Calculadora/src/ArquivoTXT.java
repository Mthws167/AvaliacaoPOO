import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ArquivoTXT {

	private Scanner entrada;
	private PrintStream saida;
	
	public ArquivoTXT() {
		this.entrada = new Scanner(System.in);
		this.saida = System.out;
	}
	private void exibirMensagem(String message) {
		this.saida.println(message);
	}
	
	
	private int lerEntradaInt() {
		return this.entrada.nextInt();
	}
	
	
	private String lerEntradaString() {
		return this.entrada.next();
	}
	
	public void inicializar() throws IOException {
		exibirMensagem("------------Bem-vindo ao Sistema ----------");
		int continuar = exibirMenu();
		while(continuar != 5) {
			continuar = exibirMenu();
		}
		exibirMensagem("---------Saindo do Sistema----------");
	}
	
	
	
	public boolean executarOperacaoSelecionada(int operacao) throws IOException {
		Programa arquivo = new Programa();
		if(operacao == 1) {
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				arquivo.somarNumerosArquivo(path);	
			
		} else if(operacao == 2) {
			
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				System.out.println("Digite o valor que deseja encontrar: ");
				int valor = lerEntradaInt();
				System.out.println(arquivo.encontrarValor(path, valor));	
			
		}else if(operacao == 3) {
			
		
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				arquivo.calcularMedia(path);	
		
		}else if(operacao == 4) {
			System.out.println("Digite o caminho do arquivo: ");
			String path = lerEntradaString();
			arquivo.lerArquivo(path);
		}else if(operacao == 5) {
			return false;
			}
		return true;
	}
	public int exibirMenu() throws IOException {
		exibirMensagem("---------Operações:-------- ");
		exibirMensagem("1-Somar Números do Arquivo");
		exibirMensagem("2-Buscar Número");
		exibirMensagem("3-Calcular Média");
		exibirMensagem("4-Imprimir todos os Números do arquivo");
		exibirMensagem("5-Sair");
		exibirMensagem("Digite o número da opção desejada: ");
		int escolha = lerEntradaInt();
		executarOperacaoSelecionada(escolha);
		return escolha;
	}

	
	
}