package lista02_22023;
import java.util.Random;
import java.util.Scanner;
public class lista_2 {

	public static void main(String[] args) {
		//Questão 01
		for (int a=1; a<101;a++)
			if (a%2==0)
			System.out.println(a);
		
		
		//Questão 02
		int vetor[]= new int[1];
		int soma=0;
		 do {
				 System.out.println("Digite um numero: ");
				 Scanner entrada= new Scanner(System.in);
				 int num= entrada.nextInt();
				
			 if (num>0) 
				soma+=num;
			 else
				 vetor[0]=num;
			 
		 }while (vetor[0]>=0);
		 System.out.println("A soma dos números positivos digitados é:"+" "+ soma);
		 
		//Questão 03
		boolean acertou= false;
		Random random= new Random();
		int numero= random.nextInt(100);
		
		do{
			System.out.println("Digite um número para participar do jogo de advinhacao"); 
			Scanner numUsuario= new Scanner (System.in);
			int advinhacao= numUsuario.nextInt();
			if(advinhacao==numero) { 
				System.out.println("Parabens, você acertou!");
				acertou= true;}
			else if (numero > advinhacao)
				System.out.println("O número é maior que o digitado");
			else 
				System.out.println("O número é menor que o digitado");
		}while(acertou==false);
		
		//Questão 04
		
		int contador=0;
		boolean parar=false;
		do {
			System.out.println("Digite o número que você quer ver a tabuada de multiplicação:");
			Scanner numEscolhido= new Scanner(System.in);
			int tabela= numEscolhido.nextInt();
			for(int i=1;i<11;i++) {
				System.out.println(tabela +" x "+ i +" = "+(tabela*i));
				}
			System.out.println("Deseja continuar? sim ou nao?");
			Scanner resp= new Scanner(System.in);
			String simOuN= resp.next();
			if(simOuN.equals("nao") || simOuN.equals("n"))
				parar=true;		
		}while(parar==false);
		
		
		
		//Questao 05
		int n=0;
		System.out.println("Digite o número limite superior para os pares:");
		Scanner limite= new Scanner(System.in);
		n= limite.nextInt();
		n+=1;
		int vet[]= new int[n];
		for(int i=0; i<n;i++)
			vet[i]=i;
		for( int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
			System.out.println(vet[i]+"-"+ j);
		} 
		
		//Questão 06
		System.out.println("Digite o tamanho das linhas  da matriz:");
		Scanner tamanho= new Scanner(System.in);
		int number= tamanho.nextInt();
		System.out.println("Digite o tamanho das colunas da matriz:");
		Scanner tamanhoL= new Scanner(System.in);
		int m=tamanhoL.nextInt();
		System.out.println("Digite os números para preencher a matriz: ");
		Scanner numeros= new Scanner(System.in);
		Scanner transposta= new Scanner(System.in);
		boolean verificar= false;
		int [][] matriz= new int[n][m];
		int [][] matrizTransposta= new int[m][n];
		for (int i=0;i<number;i++)
			for (int j=0;j<m;j++) {
				matriz[i][j]= numeros.nextInt();

	
	}
		System.out.println("Digite a sua transposta:");
		for(int i=0;i<m;i++)
			for(int j=0; j<number;j++) {
				matrizTransposta[i][j]= transposta.nextInt();}
		for (int i=0;i<number;i++) {
			for(int j=0;j<m;j++) {
				if(matriz[i][j]==matrizTransposta[j][i]) {
					verificar=true;
					}
				else {
				verificar=false;
				}}
		}
		if(verificar==true)
			System.out.println("É simétrica");
		else
			System.out.println("Não é simétrica");
		
		//Questão 07
		int vetore[]= new int[1];
		vetore[0]= 2;
	int aux=0;
	int definitivo=0;
		do {
			System.out.println("Digite um número para ver o seu maior primo:");
			Scanner numP= new Scanner(System.in);
			int primo= numP.nextInt();
			if(primo%1==0 && primo%primo==0 ) {
				aux=primo;
				vetor[0]=aux;
				aux=primo-2;
				if(aux<primo)
					if(aux%3==0)
						aux=aux-2;
				
				if(aux%13==0)
					aux=aux-6;
				if(aux%5==0)
					aux=aux-2;
						System.out.println(aux);
				}
			
			else
				System.out.println(aux);
		}while(vetore[0]%2==0);
			
		//Questão 08
		int numb=0;
		System.out.println("Sua expressao tem quantos caracteres?");
		Scanner quant= new Scanner(System.in);
		n=quant.nextInt();
		String veT[]= new String[n];
		System.out.println("Digite sua expressão para verificar:");
		Scanner expressao= new Scanner(System.in);
		for(int i=0; i<n;i++) {
			veT[i]= expressao.next();			
		}
			if(veT[0].equals("(")) {
				if(veT[numb-1].equals(")"))
					System.out.println("Bem formada");
				else
					System.out.println("Não é bem formada");}
			if(veT[0].equals("{")) {
				if(veT[numb-1].equals("}"))
					System.out.println("Bem formada");
				else
					System.out.println("Não é bem formada");}
			if(veT[0].equals("[")) {
				if(veT[numb-1].equals("}"))
					System.out.println("Bem formada");
				else
					System.out.println("Não é bem formada");}
					
		//Questão 09
		int K=0;
		System.out.println("Digite quantos caracteres tem sua expressão:");
		Scanner quantid= new Scanner(System.in);
		n=quantid.nextInt();
		System.out.println("Digite a expressão para fazer a permutação:");
		Scanner exp= new Scanner(System.in);
		String v[]=new String[n];
		for (int i=0; i<K;i++)
			v[i]= exp.next();
		for(int i=0;i<K;i++)
			System.out.print(v[i]);
		
		//Questão 10 (ITEM A)
		System.out.println("**** Só vale matrizes quadradas ****");
		System.out.println("Digite o numero de linhas: ");
		Scanner linhas= new Scanner(System.in);
		int P= linhas.nextInt();
		System.out.println("Digite o numero de colunas: ");
		Scanner colunas= new Scanner (System.in);
		int Q= colunas.nextInt();
		int matrize[][]= new int[P][Q];
		for(int i=0; i<matrize.length;i++) 
			for(int j=0; j<matrize.length;j++) 
				if(j==i || i>j)
					matrize[i][j]= j;
				else
					matrize[i][j]= 0;
		for(int i =0; i<matrize.length ; i++){
			for(int j =0;j<matrize.length ; j++){
				if(j==i || i>j) {
				System.out.print(matrize[i][j] + " ");
			}
			}
			System.out.println(" ");
			}
		
		//Questão (ITEM B)
		System.out.println("**** Só vale matrizes quadradas ****");
		System.out.println("Digite o numero de linhas: ");
		Scanner linhaS= new Scanner(System.in);
		int R= linhaS.nextInt();
		System.out.println("Digite o numero de colunas: ");
		Scanner colunaS= new Scanner (System.in);
		int H= colunaS.nextInt();
		String vetori[][]= new String[R][H];
		for(int i=0; i<vetori.length;i++) 
			for(int j=0; j<vetori.length;j++) {
				if(i%2==0 && j%2==0)
					vetori[i][j]="@" ;	
				else if (!(j%2==0) && !(i%2==0))
					vetori[i][j]= "@";
				else
					vetori[i][j]="*";
			}
		for(int i =0; i<vetor.length ; i++){
			for(int j =0;j<vetor.length ; j++){
				
				System.out.print(vetori[i][j] + " ");
			
			}
			System.out.println(" ");
			}
			
				
	}}
	
		
			

