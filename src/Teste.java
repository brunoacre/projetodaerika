/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author bruno
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Onibus bus1 = new Onibus();
        bus1.setMarca("ovo");
        bus1.setModelo("churros");
        bus1.setPlaca("xls-0000");
        bus1.setPoltronas(48);
        
        Onibus bus2 = new Onibus();
        bus2.setMarca("batata");
        bus2.setModelo("frita");
        bus2.setPlaca("stl-0357");
        bus2.setPoltronas(48);
  
        for(int i=0;i<5;i++){
        String Origem = JOptionPane.showInputDialog("Digite sua origem: ");
        JOptionPane.showMessageDialog(null, "Sua origem" + Origem);
        Viacao pas1 = new Viacao();
        pas1.setOrigem(Origem);
        String Destino = JOptionPane.showInputDialog("Digite seu destino: ");
        JOptionPane.showMessageDialog(null, "Seu destino: " + Destino);
        pas1.setDestino(Destino);
        String horario = JOptionPane.showInputDialog("Digite o horário: ");
        pas1.setHorario(horario);
        int Poltrona = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da poltrona: "));
        pas1.setPoltrona(Poltrona);
        pas1.setQual(bus2);
          
           
        }
        
        
        
    }   
}
