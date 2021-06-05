
public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("Está ligado? " + this.isLigado());
		System.out.println("Está tocando? " + this.isTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.println("+");
		}
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
		
	}

	@Override
	public void maisVolume() {
		if (isLigado()) {
			this.setVolume(this.getVolume() + 5);
		}
		
	}

	@Override
	public void menosVolume() {
		if (isLigado()) {
			this.setVolume(this.getVolume() - 5);
		}
		
	}

	@Override
	public void ligarMudo() {
		if (isLigado() && this.getVolume() > 0){
				this.setVolume(0);
			}
		}

	@Override
	public void desligarMudo() {
		if (isLigado() && this.getVolume() == 0) {
				this.setVolume(50);
			}
	}

	@Override
	public void play() {
		if (isLigado() && !(isTocando())) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if (isLigado() && isTocando()) {
			this.setTocando(false);
		}
		
	}
	
	
} 
