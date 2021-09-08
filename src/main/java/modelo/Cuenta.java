/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author chari
 */
public class Cuenta {
    private int nrocta;

    public Cuenta(int nrocta) {
        this.nrocta = nrocta;
    }

    public int getNrocta() {
        return nrocta;
    }

    public void setNrocta(int nrocta) {
        this.nrocta = nrocta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nrocta=" + nrocta + '}';
    }
    
    
}
