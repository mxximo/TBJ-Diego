/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchadores;

/**
 *
 * @author Usuario
 */
public class Peleador {

    protected String nombre;
    protected int HP;
    protected int ATK;
    protected int DEF;

    public Peleador(String nombre, int HP, int ATK, int DEF) {
        this.nombre = nombre;
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHP() {
        return HP;
    }

    public int getATK() {
        return ATK;
    }

    public int getDEF() {
        return DEF;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }


    }
