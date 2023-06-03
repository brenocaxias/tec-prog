package robo;

public class Rei extends Robo{
	public Rei() {
		super("Rei", "R ", 4, 4);
	}
	public void avancar() {
        int posNovaHorizontal = this.getPosHorizontal() + this.getAvancar();
        int posNovaVertical = this.getPosVertical() - this.getAvancar();
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }

    public void retroceder() {
        int posNovaHorizontal = this.getPosHorizontal() - this.getRetroceder();
        int posNovaVertical = this.getPosVertical() + this.getRetroceder();
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }
}
