package luchadores;

public class Luchador_Guerrero extends Peleador implements Luchador,Guerrero{
    public Luchador_Guerrero(String nombre, int HP, int ATK, int DEF) {
        super(nombre, HP, ATK, DEF);
    }
    private static final int MAX_DEFENSA = 300;
    private static final int MAX_ATAQUE = 200;

    @Override
    public void ataque_espada(Peleador enemigo2) {
        int danio = (int)(Math.random() * 151) + 50;
        System.out.println();
        System.out.println(getNombre() + " usa ataque de espada! Daño: " + danio);
    }

    @Override
    public void aumentar_Fuerza() {
        int nuevoAtaque = getATK() + 21;
        setATK(Math.min(nuevoAtaque, MAX_ATAQUE)); // No supera el máximo
        System.out.println();
        System.out.println( getNombre() + " aumenta su fuerza!: " + getATK());
    }

    @Override
    public void Atacar(Peleador enemigo) {

        int danio = (int) (Math.random() * (this.ATK - 40) + 40);
        if (danio >= 40) {
            enemigo.setHP(enemigo.getHP() - danio);
            System.out.println("\nEl peleador " + this.getNombre() + " hizo un daño de: " + danio);
        } else {
            System.out.println("\nEl ataque de " + getNombre() + " no tuvo efecto.");
        }
    }

    @Override
    public void defender_escudo() {
        int nuevaDefensa = getDEF() + 40;
        setDEF(Math.min(nuevaDefensa, MAX_DEFENSA));
        System.out.println();
        System.out.println(getNombre() + "usa escudo! DEF ahora: " + getDEF());
    }
}
