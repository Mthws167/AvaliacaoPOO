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
	
	private double lerEntradaDouble() {
		return this.entrada.nextDouble();
	}
	
	private String lerEntradaString() {
		return this.entrada.next();
	}
	
	public void inicializar() throws IOException {
		exibirMensagem("------------Bem-vindo ao Sistema ----------");
		int continuar = exibirMenu();
		while(continuar != 7) {
			continuar = exibirMenu();
		}
		exibirMensagem("---------Saindo do Sistema----------");
	}
	
	
	
	public boolean executarOperacaoSelecionada(int operacao) throws IOException {
		Programa arquivo = new Programa();
		if(operacao == 1) {
			int configuracao = exibirMenuConfiguracao();
			if(configuracao == 1) {
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				arquivo.somarNumerosArquivo(path);	
			}else {
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				arquivo.somarNumerosArquivoFlutuante(path);
			}
		} else if(operacao == 2) {
			int configuracao = exibirMenuConfiguracao();
			if(configuracao == 1) {
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				System.out.println("Digite o valor que deseja encontrar: ");
				int valor = lerEntradaInt();
				System.out.println(arquivo.encontrarValor(path, valor));	
			}else {
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				System.out.println("Digite o valor que deseja encontrar: ");
				double valor = lerEntradaDouble();
				System.out.println(arquivo.encontrarValorFlutuante(path, valor));
			}
		}else if(operacao == 3) {
			int configuracao = exibirMenuConfiguracao();
			if(configuracao == 1) {
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				arquivo.calcularMedia(path);	
			}else {
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				arquivo.calcularMediaFlutuante(path);
			}
		}else if(operacao == 4) {
			int configuracao = exibirMenuConfiguracao();
			System.out.println("Digite o caminho do arquivo: ");
			String path = lerEntradaString();
			arquivo.lerArquivo(path);
		}else if(operacao == 5) {
			int configuracao = exibirMenuConfiguracao();
			if(configuracao == 1) {
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				arquivo.encontrarMaiorNumero(path);	
			}else {
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				arquivo.encontrarMaiorNumeroFlutuante(path);
			}
			
		}else if(operacao == 6) {
			int configuracao = exibirMenuConfiguracao();
			if(configuracao == 1) {
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				arquivo.encontrarMenorNumero(path);	
			}else {
				System.out.println("Digite o caminho do arquivo: ");
				String path = lerEntradaString();
				arquivo.encontrarMenorNumeroFlutuante(path);	
			}
		}else if(operacao == 7) {
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
		exibirMensagem("5-Exibir Maior Número");
		exibirMensagem("6-Exibir Menor Número");
		exibirMensagem("7-Sair");
		exibirMensagem("Digite o número da opção desejada: ");
		int escolha = lerEntradaInt();
		executarOperacaoSelecionada(escolha);
		return escolha;
	}
	
	public int exibirMenuConfiguracao(){
		exibirMensagem("--------Você deseja:--------- ");
		exibirMensagem("1-Utilizar números inteiros");
		exibirMensagem("2-Utilizar números quebrados");
		int escolha = lerEntradaInt();
		return escolha;
	}

	
	
	
}