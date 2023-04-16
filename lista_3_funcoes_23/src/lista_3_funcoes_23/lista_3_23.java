package lista_3_funcoes_23;

import java.util.Scanner;

public class lista_3_23 {

	public static int somatorio(int vet[]) {//Questão 1
		
		int aux= 0;
		for(int i=0; i<vet.length;i++) {
			aux=aux+vet[i];
		}
		if(vet[0]!=0 && vet[vet.length-1]!=0)
			aux=aux-vet[0]-vet[vet.length-1];
		System.out.println(aux);
		return aux;
	}
	
	public static float media(int vet[], int v[]) {//Questão 2
		int aux=0;
		for(int i=0;i<vet.length;i++)
			aux= aux+vet[i];
		for(int i=0;i<v.length;i++)
			aux=aux+v[i];
		System.out.println(aux/2);
		return aux/2;
	}
	
	public static float mediaPonderada(int vet[], int v[]) {//Questão 3
		int aux=0;
		for(int i=0;i<vet.length;i++)
			
				aux=aux+(vet[i]*v[i]);
		System.out.println(aux/v.length);
		return (aux/v.length);
	}
	public static int contagemElementos(int vet[], int v[]) { //Questão 4
		int verif=0;
		System.out.println("Qual elemento você quer verificar?");
		Scanner e= new Scanner(System.in);
		verif=e.nextInt();
		int cont =0; 
		for(int i=0;i<vet.length;i++)
				if(vet[i]== verif || v[i]==verif)
					
					cont++;
		System.out.println(cont+ "->"+ verif);
		return 0;
	}
	public static int copia(int vet[]) {//Questão 5
		for(int i=0; i<vet.length;i++)
			System.out.print(vet[i]+ " ");
		
		return 0;
	}
	public static int crescente(int vet[]) {//Questão 6
		int aux[]= new int[vet.length];
		System.out.println();
		for(int i=0;i<vet.length;i++)
			for(int j=0;j<vet.length-1;j++)
				if(vet[j]> vet[j+1]) {
					aux[j]= vet[j];
					vet[j]= vet[j+1];
					vet[j+1]= aux[j];
				}
		
				
		for (int i=0;i<vet.length;i++)
			System.out.print(vet[i]+ " ");
		return 0;	
	}
	public static void verifica(int vet[]) {//Questão 7
		boolean v=true;
		crescente(vet); 
		System.out.println("\n" +v);
}
	public static void kesimoMa(int vet[], int k) {//Questão 8
		int maior=0;
		for(int i=0;i<vet.length;i++)
			if(vet[i]>maior)
				maior=vet[i];
		System.out.println(maior);
	}
	public static void kesimoMe(int vet[],int k) {//Questão 9
		int menor=vet[0];
		for(int i=0; i<vet.length;i++)
			if(vet[i]<menor) {
				menor=vet[i];
				
			}
		System.out.println(menor);
	}
	public static void verifIgualdade(int vet[], int v[]) {//Questão 10
		int j=0;
		for(int i=0;i<vet.length;i++)
			if(vet[i]== v[i])
				 j=vet[i];
		
		System.out.println("Não são iguais na mesma posição e elemento");
	}
	public static void potenciacao(double n, double m) {//Questão 11
		double potencia=1;
		for(int i=0;i<m;i++)
			potencia=potencia*n;
		System.out.println(potencia);
	}
	public static void primo(int n) {//Questão 12
		if(n%n==0 && n%1==0)
			System.out.println("É primo");
	}
	public static void ocorrencia(int vet[], int v[]) {//Questão 13
		int aux[]= new int[(vet.length)*2];
		for(int i=0; i<vet.length;i++)
			aux[i*2]=vet[i];
		for(int i=0;i<v.length;i++)
			aux[i*2+1]= v[i];
		for(int i=0; i<aux.length;i++)
			System.out.print(aux[i]+ " ");
	}
	public static void remocao(int vet[]) {//Questão 14
		int verif=0;
		System.out.println("\n"+ "Digite um número para ser removido: ");
		Scanner e= new Scanner(System.in);
		verif=e.nextInt();
		for(int i=0; i<vet.length;i++)
			if(vet[i]== verif)
				vet[i]= 0;
		for(int i=0;i<vet.length;i++)
			if(vet[i]!=0)
			System.out.println(vet[i]);
	}
	
	
	public static void verifPrimo(int n) {//Questão 16
		boolean v=false;
		if(n%n==0 && n%1==0)
			v=true;
		System.out.println(v);
	}
	public static void jurosComposto(double capital, double taxa, double periodo) {//Questão 18
		double montante=0;
		double taxA=1;
		for(int i=0;i<periodo;i++)
			taxA=((1+taxa)*taxA);
		montante= capital*taxA;
		System.out.println(montante);
	}
	public static void numPerfeito(int n) {//Questão 19
		boolean v=false;
		int aux=0;
		for(int i=1; i<n-1;i++)
			if(n%i==0)
				aux=aux+i;
				v=true;
		System.out.println(v);
			
	}
	
	
	public static void main(String[] args) {
	
		
		int vetor[]= {2,5,3,7,8,9};
		int vetorA[]= {6,18,19,20,2,2};
		String palind[]= {"a","n","a"};
		
		somatorio(vetor);
		media(vetor,vetorA);
		mediaPonderada(vetor, vetorA);
		contagemElementos(vetor,vetorA);
		copia(vetor);
		crescente(vetor);
		verifica(vetorA);
		kesimoMa(vetorA,0);
		kesimoMe(vetorA,0);
		verifIgualdade(vetor,vetorA);
		potenciacao(5,5);
		primo(7);
		ocorrencia(vetor, vetorA);
		remocao(vetor);
		verifPrimo(11);
		jurosComposto(1000, 0.05, 3);
		numPerfeito(6);
	}

}
