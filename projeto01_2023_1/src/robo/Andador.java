package robo;

public class Andador extends Robo {

	public Andador() {
		super("Andador", "A ", 1, 1);
	}
	public void avancar() {
		int novaPosHorizontal = this.getPosHorizontal() + 0;
        int novaPosVertical = this.getPosVertical() - this.getAvancar();
        this.setPosHorizontal(novaPosHorizontal);
        this.setPosVertical(novaPosVertical);
	}
	public void retroceder() {
        int novaPosHorizontal = this.getPosHorizontal() - 0;
        int novaPosVertical = this.getPosVertical() + this.getRetroceder();
        this.setPosHorizontal(novaPosHorizontal);
        this.setPosVertical(novaPosVertical);
    }
}
