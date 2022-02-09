/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Yuneider
 */
public class cell {
    
    private boolean alive;
    private int aliveNear, deadNear;
    
    public cell(boolean alive){
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getAliveNear() {
        return aliveNear;
    }

    public void setAliveNear(int aliveNear) {
        this.aliveNear = aliveNear;
    }

    public int getDeadNear() {
        return deadNear;
    }

    public void setDeadNear(int deadNear) {
        this.deadNear = deadNear;
    }
    
}
