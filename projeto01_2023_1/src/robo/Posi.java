package robo;

public class Posi {
	private boolean ocupado;
    private String simbolo;

    public Posi(){
        this.ocupado = false;
        this.simbolo = "O ";
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;

        if (this.ocupado == true){
            this.setSimbolo("X ");
        }
        else{
            this.setSimbolo("O ");
        }
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }   
}
