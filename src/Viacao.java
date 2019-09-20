/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class Viacao {
    
    private String Origem;
    private String Destino;
    private String Horario;
    private int Poltrona;
    private Onibus Qual; 

    public Onibus getQual() {
        return Qual;
    }

    public void setQual(Onibus Qual) {
        this.Qual = Qual;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    /**
     * @return the Origem
     */
    public String getOrigem() {
        return Origem;
    }

    /**
     * @param Origem the Origem to set
     */
    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }

    /**
     * @return the Destino
     */
    public String getDestino() {
        return Destino;
    }

    /**
     * @param Destino the Destino to set
     */
    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    /**
     * @return the Horario
     */
    

    
    

    /**
     * @return the Poltrona
     */
    public  int getPoltrona() {
        return Poltrona;
    }

    /**
     * @param Poltrona the Poltrona to set
     */
    public void setPoltrona(int Poltrona) {
        this.Poltrona = Poltrona;
    }    
}
