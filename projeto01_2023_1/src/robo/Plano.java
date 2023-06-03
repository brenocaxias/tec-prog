package robo;

import java.util.ArrayList;

public class Plano   {
	private Posi[][] plano;
	private int tamanhoX;
	private int tamanhoY;
	
	public Plano(int tamanhoX, int tamanhoY) { //TamanhoX= Altura e TamanhoY= Largura.
			this.tamanhoX= tamanhoX;
			this.tamanhoY= tamanhoY;
			this.plano= new Posi[tamanhoX][tamanhoY];
			for (int i = 0; i < tamanhoX; i++) {
				for (int j = 0; j < tamanhoY; j++) {
					plano[i][j]= new Posi();
					
				}
			}
	}
	public Posi getPlano(int i, int j) {
		
		 return this.plano[i][j];
	}
	public void setPlano(Posi[][] plano) {
		this.plano = plano;
	}
	public int getTamanhoX() {
		return tamanhoX;
	}
	public void setTamanhoX(int tamanhoX) {
		this.tamanhoX = tamanhoX;
	}
	public int getTamanhoY() {
		return tamanhoY;
	}
	public void setTamanhoY(int tamanhoY) {
		this.tamanhoY = tamanhoY;
	}

	public void mostrarPlano() {
		for(int i=0; i<this.tamanhoX; i++) {
			for(int j=0;j<tamanhoY;j++) {
				System.out.print(this.plano[i][j].getSimbolo());
			}
			System.out.print("\n");
		}
	}
	public void colocarRobo(Robo robo){
        this.plano[tamanhoX-1][0].setSimbolo(robo.getId());
        robo.setPosVertical(tamanhoX-1);
        robo.setPosHorizontal(0);
    }
	 public void avancarRobo(Robo robo){
		 	try {
	        this.plano[robo.getPosVertical()][robo.getPosHorizontal()].setOcupado(false);
	        robo.avancar();
	        this.plano[robo.getPosVertical()][robo.getPosHorizontal()].setSimbolo(robo.getId());      
	 }
		 	catch(ArrayIndexOutOfBoundsException e) {
		 		System.out.println("Tente novamente");
		 		
		 	}
	 }

	    public void retrocederRobo(Robo robo){
	    	try {
	        this.plano[robo.getPosVertical()][robo.getPosHorizontal()].setOcupado(false);
	        robo.retroceder();
	        this.plano[robo.getPosVertical()][robo.getPosHorizontal()].setSimbolo(robo.getId());
	    }
	    	catch(ArrayIndexOutOfBoundsException e) {
	    		System.out.println("Não há como retroceder, pois primeiro teria que avancar");
	    	
	    	}
}}
