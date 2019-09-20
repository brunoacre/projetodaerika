/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class Onibus {
    private String Marca;
    private String Modelo;
    private String Placa;
    private int Poltronas;

    public String getMarca() {
        System.out.println("Aasa");
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getPoltronas() {
        return Poltronas;
    }

    public void setPoltronas(int Poltronas) {
        this.Poltronas = Poltronas;
    }
    
}
