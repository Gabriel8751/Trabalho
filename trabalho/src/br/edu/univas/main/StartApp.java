package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

public class StartApp {
	
	static Scanner leitura = new Scanner(System.in);
	
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
//		else if(scan == 6) {
//			printList(titlee, play);
//		}
		}while(scan != 9);
	}
	
	public static void printMainMenu() {
		System.out.println("1: Cadastro de Player");
		System.out.println("2: Cadastro de Titulo");
		System.out.println("3: Recomendar Filme Aleatório");
		System.out.println("4: Recomendar Filme por Gênero");
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
		
		System.out.println("Digite o titulo: ");
		titulo.setTitulo(leitura.nextLine());
		
		System.out.println("Digite o elenco: ");
		titulo.setElenco(leitura.nextLine());
		
		System.out.println("Digite a descrição: ");
		titulo.setDescricao(leitura.nextLine());
		
		System.out.println("Digite o genero: ");
		titulo.setGenero(leitura.nextLine());
		
		System.out.println("Digite o nome do diretor: ");
		titulo.setDiretor(leitura.nextLine());
		
		System.out.println("Digite a classificação: ");
		titulo.setClassificacao(leitura.nextInt());
		
		System.out.println("Digite a plataforma: ");
		leitura.nextLine();
		titulo.setPlataforma(leitura.nextLine());
	}
	
	public static void randomTitle(ArrayList<Titulo> titlee, int contador) {
		if(titlee.size() >= 1) {
			int a = (int)Math.floor(Math.random()*(contador-0));
			System.out.println("\nTipo: "+ titlee.get(a).getTipo());
			System.out.println("Titulo: "+ titlee.get(a).getTitulo());
			System.out.println("Elenco: "+ titlee.get(a).getElenco());
			System.out.println("Descrição: "+ titlee.get(a).getDescricao());
			System.out.println("Genero: "+ titlee.get(a).getGenero());
			System.out.println("Diretor: "+ titlee.get(a).getDiretor());
			System.out.println("Classificação: "+ titlee.get(a).getClassificacao());	
			System.out.println("Plataforma: "+ titlee.get(a).getPlataforma()+"\n");
		}
		else {
			System.out.println("Nenhum titulo foi adicionado!");
		}
	}
	
	
	
	
	
	
//	public static void printList(ArrayList<Titulo> titlee, ArrayList<Player> player) {
//	for(int i = 0; i < titlee.size(); i++) {
//		System.out.println("\nTipo: "+ titlee.get(i).getTipo());
//		System.out.println("Titulo: "+ titlee.get(i).getTitulo());
//		System.out.println("Elenco: "+ titlee.get(i).getElenco());
//		System.out.println("Descrição: "+ titlee.get(i).getDescricao());
//		System.out.println("Genero: "+ titlee.get(i).getGenero());
//		System.out.println("Diretor: "+ titlee.get(i).getDiretor());
//		System.out.println("Classificação: "+ titlee.get(i).getClassificacao());	
//		System.out.println("Plataforma: "+ titlee.get(i).getPlataforma());
//		System.out.println("Nome: "+ player.get(i).getNome());
//		System.out.println("Url: "+ player.get(i).getUrl()+"\n");
//	}
//}
}

