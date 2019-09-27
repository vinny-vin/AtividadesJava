package Atividades;
import Atividades.TipoPropiedade;
public class PropiedadesFirefox {

	public static void main(String[] args) {
		

	}

	private String chave;
	
	private TipoPropiedade tipo;
	
	private int valorInt;
	private String valortexto;
	private boolean valorLogico;
	
	public TipoPropiedade getTipo() {
		return tipo;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public int getValorInt() {
		return valorInt;
	}

	public void setValorInt(int valorInt) {
		this.valorInt = valorInt;
	}

	public String getValortexto() {
		return valortexto;
	}

	public void setValortexto(String valortexto) {
		this.valortexto = valortexto;
	}

	public boolean isValorLogico() {
		return valorLogico;
	}

	public void setValorLogico(boolean valorLogico) {
		this.valorLogico = valorLogico;
	}

	public void setTipo(TipoPropiedade tipo) {
		this.tipo = tipo;
	}
	
	
}
