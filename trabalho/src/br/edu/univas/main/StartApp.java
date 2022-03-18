package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StartApp {
	
	static Scanner leitura = new Scanner(System.in);
	static Random random = new Random();
	
	public static void main(String[] args) {
		Player player = new Player();
		Titulo titulo = new Titulo();
		ArrayList<Titulo> titlee = new ArrayList();
		ArrayList<Player> play = new ArrayList();
		
		int scan = 0;
		int contador = 0;
		
		do {	
		printMainMenu();
		scan = scanner();
		if(scan == 1) {
			Player plays = new Player();
			createPlayer(plays);
			play.add(plays);	
		}
		else if(scan == 2) {
			Titulo title = new Titulo();
			createTitle(title);
			titlee.add(title);
			contador++;	
		}
		else if(scan == 3) {
			randomTitle(titlee, contador);
		}
		else if(scan == 4) {
			searchForTitle(titlee, contador);
		}
		}
		while(scan != 9);
	}
	
	public static void printMainMenu() {
		System.out.println("Escolha uma das opções");
		System.out.println("1: Cadastro de player");
		System.out.println("2: Cadastro de título");
		System.out.println("3: Recomendar filme aleatório");
		System.out.println("4: Recomendar filme por escolha");
		System.out.println("9: Sair");
	}
	
	public static int scanner() {
		int a = leitura.nextInt();
		leitura.nextLine();
		return a;
	}
	
	public static void createPlayer(Player player) {
		System.out.println("Digite o nome do player: ");
		player.setNome(leitura.nextLine());
		
		System.out.println("Digite a url do player: ");
		player.setUrl(leitura.nextLine());
	}
	
	public static void createTitle(Titulo titulo) {
		System.out.println("Digite a tipo: ");
		titulo.setTipo(leitura.nextLine());
		
		System.out.println("Digite o Título: ");
		titulo.setTitulo(leitura.nextLine());
		
		System.out.println("Digite o Elenco: ");
		titulo.setElenco(leitura.nextLine());
		
		System.out.println("Digite a Descrição: ");
		titulo.setDescricao(leitura.nextLine());
		
		System.out.println("Digite o Gênero: ");
		titulo.setGenero(leitura.nextLine());
		
		System.out.println("Digite o nome do diretor: ");
		titulo.setDiretor(leitura.nextLine());
		
		System.out.println("Digite a classificação: ");
		titulo.setClassificacao(leitura.nextInt());
		
		Player plataforma = new Player();
		
		System.out.println("Digite o nome da plataforma de streaming: ");
		leitura.nextLine();
		plataforma.setNome(leitura.nextLine());
		
		System.out.println("Digite a url do site: ");
		plataforma.setUrl(leitura.nextLine());
		
		titulo.setPlataforma(plataforma);
	}
	
	public static void randomTitle(ArrayList<Titulo> titlee, int contador) {
		Player play = new Player();
		if(titlee.size() > 0) {
			int a = random.nextInt(0, contador);
			System.out.println("\nTipo: "+ titlee.get(a).getTipo());
			System.out.println("Titulo: "+ titlee.get(a).getTitulo());
			System.out.println("Elenco: "+ titlee.get(a).getElenco());
			System.out.println("Descrição: "+ titlee.get(a).getDescricao());
			System.out.println("Gênero: "+ titlee.get(a).getGenero());
			System.out.println("Diretor: "+ titlee.get(a).getDiretor());
			System.out.println("Classificação: "+ titlee.get(a).getClassificacao());	
			System.out.println("Nome da plataforma: "+ titlee.get(a).getPlataforma().getNome());
			System.out.println("Url da plataforma: "+ titlee.get(a).getPlataforma().getUrl() +"\n");
		}
		else {
			System.out.println("\nNenhum titulo foi adicionado!\n");
		}
	}
	
	public static void searchForTitle(ArrayList<Titulo> titlee, int contador) {
		boolean find = false;
		
		System.out.println("Digite por qual procurar: ");
		String a = leitura.nextLine();
		for(int i = 0; i < contador; i++) {
			if(titlee.get(i).getTitulo().equals(a) ||
				titlee.get(i).getGenero().equals(a) || 
				titlee.get(i).getTipo().equals(a) ||
				titlee.get(i).getPlataforma().getNome().equals(a) ||
				titlee.get(i).getPlataforma().getUrl().equals(a)
				) {
				find = true;
				System.out.println("\nTipo: "+ titlee.get(i).getTipo());
				System.out.println("Titulo: "+ titlee.get(i).getTitulo());
				System.out.println("Elenco: "+ titlee.get(i).getElenco());
				System.out.println("Descrição: "+ titlee.get(i).getDescricao());
				System.out.println("Gênero: "+ titlee.get(i).getGenero());
				System.out.println("Diretor: "+ titlee.get(i).getDiretor());
				System.out.println("Classificação: "+ titlee.get(i).getClassificacao());	
				System.out.println("Nome da plataforma: "+ titlee.get(i).getPlataforma().getNome());
				System.out.println("Url da plataforma: "+ titlee.get(i).getPlataforma().getUrl() +"\n");
			}
		}
		
		if(find == false) {
			System.out.println("\nGênero não encontrado\n");
		}
	}
}
