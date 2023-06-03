package robo;

public abstract class Robo implements Andar {

	private String id;
	private String nome;
	private int posHorizontal;
	private int posVertical;
	//private int pontos;
	private int avancar;
    private int retroceder;

	public Robo(String nome, String id, int avancar, int retroceder) {
        this.nome = nome;
        this.id = id;
        this.posHorizontal = 0;
        this.posVertical = 0;
        this.avancar = avancar;
        this.retroceder = retroceder;
       //
    }
	
	public int getPosHorizontal() {
		return posHorizontal;
	}

	public void setPosHorizontal(int posHorizontal) {
		this.posHorizontal = posHorizontal;
	}

	public int getPosVertical() {
		return posVertical;
	}

	public void setPosVertical(int posVertical) {
		this.posVertical = posVertical;
	}


	public int getAvancar() {
		return avancar;
	}

	public void setAvancar(int avancar) {
		this.avancar = avancar;
	}

	public int getRetroceder() {
		return retroceder;
	}

	public void setRetroceder(int retroceder) {
		this.retroceder = retroceder;
	}

	public void mover() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void avancar() {
		int novaPosHorizontal= this.getPosHorizontal()+ this.avancar;
		int novaPosVertical= this.getPosVertical()+ this.avancar;		
		this.setPosVertical(novaPosVertical);
		this.setPosHorizontal(novaPosHorizontal);
	}
	public void retroceder(){
		int novaPosHorizontal= this.getPosHorizontal()- this.retroceder;
		int novaPosVertical= this.getPosVertical()-this.retroceder;
		this.setPosVertical(novaPosVertical);
		this.setPosHorizontal(novaPosHorizontal);
	}
}
