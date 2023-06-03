package robo;

public class Peao extends Robo {

	public Peao() {
		super("Peao", "P ", 1, 1);
		
	}
	 public void avancar() {
	        int posNovaHorizontal = this.getPosHorizontal() + this.getAvancar();
	        int posNovaVertical = this.getPosVertical() + 0;
	        this.setPosHorizontal(posNovaHorizontal);
	        this.setPosVertical(posNovaVertical);
	    }

	    public void retroceder() {
	        int posNovaHorizontal = this.getPosHorizontal() - this.getRetroceder();
	        int posNovaVertical = this.getPosVertical() - 0;
	        this.setPosHorizontal(posNovaHorizontal);
	        this.setPosVertical(posNovaVertical);
	    }
}
