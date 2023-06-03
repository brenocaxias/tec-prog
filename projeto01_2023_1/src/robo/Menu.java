package robo;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public Scanner scan = new Scanner(System.in);
	public Plano plano1;
	
	public Menu() {
		boasVindas();
		jogando(); 
		}
	
	public Plano criarPlano() {
		System.out.println("Digite as dimensoes do plano: ");
		System.out.println("Altura: ");
		int altura=scan.nextInt();
		System.out.println("Largura: ");
		int largura= scan.nextInt();
		Plano plano= new Plano(altura,largura);
		
		return plano;
		
	}
	public void jogando() {
		this.plano1= this.criarPlano();
		this.plano1.mostrarPlano();
		boolean jogar=true;
		System.out.println("NO PLANO TEMOS VARIOS OPÇOES DE ROBO, "
				+ "PORTANTO PODEM ESCOLHER QUAL USAR PARA AVANCAR E TENTAR CAPTURAR O ALUNO");
		System.out.println("DIGITE 1 SE QUISER MOVIMENTAR A RAINHA(Q)"+"\n"+ "DIGITE 2 SE QUISER MOVIMENTAR O REI(R)"
				+ "\n"+ "DIGITE 3 SE QUISER MOVIMENTAR A TORRE(T)"+ "\n"+
				"DIGITE 4 SE QUISER MOVIMENTAR O PEAO(P)"+ "\n"+ "DIGITE 5 SE QUISER MOVIMENTAR O CAVALO(C)"+ "\n"+
				"DIGITE 6 SE QUISER MOVIMENTAR BISPO(B)"+ "\n"+ "DIGITE 7 SE QUISER MOVIMENTAR O ANDADOR"+"\n"+
				"E DIGITE 0 SE QUISER SAIR DO JOGO");
			Rainha rainha= new Rainha();
			this.plano1.colocarRobo(rainha);
			Rei rei= new Rei();
			Bispo b= new Bispo();
			this.plano1.colocarRobo(b);
			this.plano1.colocarRobo(rei);
			Torre t= new Torre();
			this.plano1.colocarRobo(t);
			Cavalo c= new Cavalo();
			this.plano1.colocarRobo(c);
			Peao p= new Peao();
			this.plano1.colocarRobo(p);
			Andador a= new Andador();
			this.plano1.colocarRobo(a);
			
			
			while(jogar==true){
				System.out.println("DIGITE UM NUMERO:");
				int opcoes= scan.nextInt();
				if(opcoes==0) {
					System.out.println("Fim de jogo!");
					jogar=false;
				}
			if (opcoes==1) {
			System.out.println("Voce quer avancar ou retroceder? Digite A para avancar e R para retroceder");
			char movimento= scan.next().charAt(0);	
			if(movimento=='A' || movimento=='a') {
				System.out.println("******************");
				this.plano1.avancarRobo(rainha);
				this.plano1.mostrarPlano();
				System.out.println("******************");	
			}
			
			else if(movimento=='R' || movimento=='r'){
				this.plano1.retrocederRobo(rainha);
				System.out.println("*******************");		
				this.plano1.mostrarPlano();
			}
		
		}
			
		 if (opcoes==2) {
			
			System.out.println("Voce quer avancar ou retroceder? Digite A para avancar e R para retroceder");
			char movimento= scan.next().charAt(0);
	
			if(movimento=='A' || movimento== 'a') {
				this.plano1.avancarRobo(rei);
				this.plano1.mostrarPlano();
			}
			else if(movimento=='R' || movimento=='r') {
				this.plano1.retrocederRobo(rei);
				this.plano1.mostrarPlano();
			}}
		 if(opcoes==3) {
			 
			 System.out.println("Voce quer avancar ou retroceder? Digite A para avancar e R para retroceder");
				char movimento= scan.next().charAt(0);
				
				System.out.println("*******************");
				if(movimento=='A' || movimento=='a') {
					this.plano1.avancarRobo(t);
					System.out.println("*******************");
					this.plano1.mostrarPlano();
				}
				else if(movimento=='R' || movimento=='r') {
					this.plano1.retrocederRobo(t);
					System.out.println("*******************");
					this.plano1.mostrarPlano();
				}}
		 if(opcoes==4) {
			 System.out.println("Voce quer avancar ou retroceder? Digite A para avancar e R para retroceder");
				char movimento= scan.next().charAt(0);
				System.out.println("*******************");
				if(movimento=='A' || movimento== 'a') {
					this.plano1.avancarRobo(p);
					System.out.println("*******************");
					this.plano1.mostrarPlano();
				}
				else if(movimento=='R' || movimento=='r') {
					this.plano1.retrocederRobo(p);
					System.out.println("*******************");
					this.plano1.mostrarPlano();
				}}
		 if(opcoes==5) {
			 System.out.println("Voce quer avancar ou retroceder? Digite A para avancar e R para retroceder");
				char movimento= scan.next().charAt(0);
				System.out.println("*******************");
				if(movimento=='A' || movimento== 'a') {
					this.plano1.avancarRobo(c);
					System.out.println("*******************");
					this.plano1.mostrarPlano();
				}
				else if(movimento=='R' || movimento=='r') {
					this.plano1.retrocederRobo(c);
					System.out.println("*******************");
					this.plano1.mostrarPlano();
				}}
		 if(opcoes==6) {
			 System.out.println("Voce quer avancar ou retroceder? Digite A para avancar e R para retroceder");
				char movimento= scan.next().charAt(0);
				System.out.println("*******************");
				if(movimento=='A' || movimento== 'a') {
					this.plano1.avancarRobo(b);
					System.out.println("*******************");
					this.plano1.mostrarPlano();
				}
				else if(movimento=='R' || movimento=='r') {
					this.plano1.retrocederRobo(b);
					System.out.println("*******************");
					this.plano1.mostrarPlano();
				}}
		 if(opcoes==7) {
			 System.out.println("Voce quer avancar ou retroceder? Digite A para avancar e R para retroceder");
				char movimento= scan.next().charAt(0);
				System.out.println("*******************");
				if(movimento=='A' || movimento== 'a') {
					this.plano1.avancarRobo(a);
					System.out.println("*******************");
					this.plano1.mostrarPlano();
				}
				else if(movimento=='R' || movimento=='r') {
					this.plano1.retrocederRobo(a);
					System.out.println("*******************");
					this.plano1.mostrarPlano();
				}}	
		 }}
			

	public void boasVindas() {
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨Digite seu nome para comecar: ¨¨¨¨¨¨¨¨¨¨¨¨"+"\n");
		String name= scan.nextLine();
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨SEJA BEM VINDO "+ name+" ¨¨¨¨¨¨¨¨¨¨¨¨");
	}
}
