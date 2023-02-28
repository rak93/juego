
public class Main {
	public static void main(String[] args) {
		
	
Personaje maga = new Personaje(Tipo.MAGO);
Personaje asesino= new Personaje(Tipo.ASESINO,50,60);
maga.comprarEscudo();
System.out.println("Mi maga obtiene una defensa de"+maga.getDefensa());
maga.comprarAtaque();
System.out.println("Mi maga obtiene un ataque de"+maga.getDefensa());
//podria hacerlo con el seter

System.out.println(maga.Pelea(asesino, 5));
System.out.println("Mi asesino tiene una vida de"+asesino.getVida()+"exp");
System.out.println("Mi maga tiene una vida de"+maga.getVida()+"exp");
System.out.println(maga.Pelea(asesino, 1));
System.out.println("Mi asesino tiene una vida de"+asesino.getVida()+"exp");
System.out.println("Mi maga tiene una vida de"+maga.getVida()+"exp");
	}

}
