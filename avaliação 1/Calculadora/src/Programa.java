import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	private String path;
	
	public static void lerArquivo(String path) throws IOException {
		BufferedReader buffReader = new BufferedReader(new FileReader(path));
		String linha = "";
		while(linha != null) {
			System.out.println(linha);
			linha = buffReader.readLine();
		}
		buffReader.close();
	}
	
	public void somarNumerosArquivo(String path) throws IOException {
		Scanner scan = new Scanner(new File(path));
		List<Integer> tall = new ArrayList<Integer>();
		int soma = 0;
		for(int i = 0; scan.hasNextInt(); i++) {
			tall.add(i, Integer.parseInt(scan.next()));
		}
		for(int j = 0; j < tall.size(); j++) {
			soma = soma + tall.get(j);
		}
		System.out.println("O valo da Soma é: "+soma); 
	}
	
	public void calcularMedia(String path) throws IOException {
		Scanner scan = new Scanner(new File(path));
		List<Integer> tall = new ArrayList<Integer>();
		int media = 0;
		for(int i = 0; scan.hasNextInt(); i++) {
			tall.add(i, Integer.parseInt(scan.next()));
		}
		for(int j = 0; j < tall.size(); j++) {
			media = media + tall.get(j);
		}
		media = media/tall.size();
		System.out.println(" O valor da Média é: "+media); 
	}
	
	public String encontrarValor(String path, int valor) throws IOException {
		Scanner scan = new Scanner(new File(path));	
		List<Integer> tall = new ArrayList<Integer>();
		tall.clear();
		boolean encontrado = false;
		while(scan.hasNextInt()) {
			tall.add(Integer.parseInt(scan.next()));
		}
		for(int i = 0; i < tall.size(); i++) {
			if(tall.get(i) == valor) {
				encontrado = true;
				break;
			}
		}
		if(encontrado) {
			return "O número foi encontrado na lista.";
		}else {
			return "O número não foi encontrado na lista.";
		}
	}
	
	
	public void encontrarMaiorNumero(String path) throws IOException{
		Scanner scan = new Scanner(new File(path));
		List<Integer> tall = new ArrayList<Integer>();
		int maior = 0;
		for(int i = 0; scan.hasNextInt(); i++) {
			tall.add(scan.nextInt());
		}
		for(int i = 0;  i < tall.size(); i++) {
			if(tall.get(i) >= maior) {
				maior = tall.get(i);
			}
		}
		System.out.println("O maior número é: "+maior);
	}
	
	public void encontrarMenorNumero(String path) throws IOException{
		Scanner scan = new Scanner(new File(path));
		List<Integer> tall = new ArrayList<Integer>();
		for(int i = 0; scan.hasNextInt(); i++) {
			tall.add(scan.nextInt());
		}
		int menor = tall.get(0);
		for(int i = 0; i < tall.size(); i++) {
			if(tall.get(i) <= menor) {
				menor = tall.get(i);
			}
		}
		System.out.println("O menor número é: "+menor);
	}
	

	
}