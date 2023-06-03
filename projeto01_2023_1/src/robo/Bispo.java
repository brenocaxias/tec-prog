package robo;

public class Bispo extends Robo{
	public Bispo() {
		super("Bispo", "B", 2,2);
	}
	public void avancar() {
        int posNovaHorizontal = this.getPosHorizontal() + this.getAvancar();
        int posNovaVertical = this.getPosVertical() - this.getAvancar();
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }

    public void retroceder() {
        int posNovaHorizontal = this.getPosHorizontal() - this.getRetroceder();
        int posNovaVertical = this.getPosVertical() +  this.getRetroceder();
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }
}
