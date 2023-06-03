package robo;

public class Rainha extends Robo {

	public Rainha() {
		super("Rainha", "Q ", 4 ,4);
	}
	 public void avancar() {
	        int posNovaHorizontal = this.getPosHorizontal() + 0;
	        int posNovaVertical = this.getPosVertical() - 4;
	        this.setPosHorizontal(posNovaHorizontal);
	        this.setPosVertical(posNovaVertical);
	    }

	    public void retroceder() {
	        int posNovaHorizontal = this.getPosHorizontal() - 0;
	        int posNovaVertical = this.getPosVertical() + 4;
	        this.setPosHorizontal(posNovaHorizontal);
	        this.setPosVertical(posNovaVertical);
	    }
}
