package robo;

public class Torre extends Robo {
	public Torre() {
		super("Torre","T ",2,2);
	}
	public void avancar() {
        int novaPosHorizontal = this.getPosHorizontal() - 0;
        int posNovaVertical = this.getPosVertical() - this.getAvancar();
        this.setPosHorizontal(novaPosHorizontal);
        this.setPosVertical(posNovaVertical);
    }

    public void retroceder() {
        int novaPosHorizontal = this.getPosHorizontal() + 0;
        int novaPosVertical = this.getPosVertical() +  this.getRetroceder();
        this.setPosHorizontal(novaPosHorizontal);
        this.setPosVertical(novaPosVertical);
    }
}
