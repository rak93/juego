
public class Personaje {
private int vida;
private Tipo tipo;
private int ataque;
private int defensa;

public Personaje( Tipo tipo) {
	
	this.vida = 100;
	this.tipo = tipo;
	this.ataque = 1;
	this.defensa = 1;
}

public Personaje( Tipo tipo, int ataque, int defensa) {
	
	this.vida = 100;
	this.tipo = tipo;
	this.ataque = ataque;
	this.defensa = defensa;
}

public int getVida() {
	return vida;
}

public void setVida(int vida) {
	this.vida = vida;
}

public Tipo getTipo() {
	return tipo;
}

public void setTipo(Tipo tipo) {
	this.tipo = tipo;
}

public int getAtaque() {
	return ataque;
}

public void setAtaque(int ataque) {
	this.ataque = ataque;
}

public int getDefensa() {
	return defensa;
}

public void setDefensa(int defensa) {
	this.defensa = defensa;
}
public void comprarEscudo() {
	//Ten en cuenta que te da una defensa al azar
	this.defensa = (int)(Math.random()*100)+1;
}
public void comprarAtaque() {
	//Ten en cuenta que te da una ataque al azar, es como si cambiaras de arma
	this.ataque = (int)(Math.random()*100)+1;
}

public int PAtaque(int distancia) {
	int PotencialAtaque = 0;
	
	if((tipo==tipo.MAGO)&&(distancia>3)){
	 	PotencialAtaque=0;
	}
	if(tipo==tipo.MAGO){
		PotencialAtaque=ataque/distancia;
	}
	if(tipo==tipo.ASESINO) {
		if(distancia>4) {
			//porque el asesino se desplaza a 4 cuadros por partida
			distancia=distancia-4;
			if(distancia>2) {
				PotencialAtaque=0;
			}
			else {
				PotencialAtaque=ataque/distancia;
			}
		}
		else {
			PotencialAtaque=ataque*2;
		}
		
	}
	return PotencialAtaque;
}

public String Pelea(Personaje personaje2,int distancia) {
 int Ataque1=PAtaque(distancia);
	int Ataque2= personaje2.PAtaque(distancia);
	int defensa2=personaje2.defensa;
	String texto = "Puede haber otra pelea más";
	//ataca Personaje 1
	personaje2.vida= (personaje2.vida-(Ataque1-defensa2));
	this.vida=(this.vida-(Ataque2-defensa));

	if(vida<=0) {
		texto="Personaje 1 muerto";
	}
	if(personaje2.vida<=0) {
		texto="Personaje 2 muerto";
	}
	
	return texto;
	
}

}