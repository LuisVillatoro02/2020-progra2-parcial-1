
package ParcialII;

import javax.swing.JOptionPane;
import java.util.Random;
import static javax.swing.JOptionPane.showInputDialog;

public class tarjetadedebito extends Tarjetabancaria {
    Random ra= new Random(); 
    private int numtarj3, numtarj4,numtarj5,numtarj6,numtarj7,numtarj8,numtarj9,numtarj10;
  private double comprar,depositar;
  
  private String nombrep; 
    private Double saldoactu;
    private Double limiteS;
       private int numtarj11, numtarj12,numtarj13,numtarj14,numtarj15,numtarj16,numtarj17,numtarj18;

  public tarjetadedebito(int numtarj0, int numtarj1, int numtarj2,Double limiteS) {
        super(numtarj0, numtarj1, numtarj2);
        this.limiteS=limiteS;
    }

    
  @Override
    public void getdatos(){
       
        this.nombrep=JOptionPane.showInputDialog(null,"Titular","Debit Card",JOptionPane.INFORMATION_MESSAGE);
        this.saldoactu=Double.parseDouble(JOptionPane.showInputDialog(null,"Saldo: ","Debit Card",JOptionPane.INFORMATION_MESSAGE));
        this.numtarj3=ra.nextInt(9);
        this.numtarj4=ra.nextInt(9);
        this.numtarj5=ra.nextInt(9);
        this.numtarj6=ra.nextInt(9);
        this.numtarj7=ra.nextInt(9);
        this.numtarj8=ra.nextInt(9);
        this.numtarj9=ra.nextInt(9);
        this.numtarj10=ra.nextInt(9);
        this.numtarj11=numtarj3;
        this.numtarj12=numtarj4;
        this.numtarj13=numtarj5;
        this.numtarj14=numtarj6;
        this.numtarj15=numtarj7;
        this.numtarj16=numtarj8;
        this.numtarj17=numtarj9;
        this.numtarj18=numtarj10;
        
        JOptionPane.showMessageDialog(null,"Saldo: Q"+limiteS+"\nTitular: "+nombrep+"\nId de la Tarjeta: "+numtarj0+numtarj1+"-"+numtarj2+"-"+numtarj3+numtarj4+numtarj5+numtarj6+"-"+numtarj7+numtarj8+numtarj9+numtarj10+"\nSaldo: Q"+saldoactu,"Debit Card",JOptionPane.INFORMATION_MESSAGE);
    
    } public void metododepositar(){
        this.depositar=Double.parseDouble(JOptionPane.showInputDialog(null,"Deposito","Debit Card",JOptionPane.INFORMATION_MESSAGE));
       this.saldoactu=this.saldoactu+this.depositar;
       JOptionPane.showMessageDialog(null,"Menú"+"\nSaldo Limite: Q"+limiteS+"\nTitular: "+nombrep+"\nId De la Tarjeta: "+numtarj0+numtarj1+"-"+numtarj2+"-"+numtarj11+numtarj12+numtarj13+numtarj14+"-"+numtarj15+numtarj16+numtarj17+numtarj18+"\nDeposito: Q"+depositar+"\nSaldo: Q"+saldoactu,"Debit Card",JOptionPane.INFORMATION_MESSAGE);
    
    }
    public void Metodocomprar(){
        
            
       
        this.comprar=Double.parseDouble(JOptionPane.showInputDialog(null,"Precio: ","Online Shop",JOptionPane.INFORMATION_MESSAGE));
        if(comprar >limiteS){
      JOptionPane.showMessageDialog(null,"La compra es Fallida"+"\n\nVolviendo al menú","Online Shop",JOptionPane.INFORMATION_MESSAGE);      
       
      Metodocomprar();
        
        }else
         
        this.saldoactu=this.saldoactu-this.comprar;
       JOptionPane.showMessageDialog(null,"\nSaldo: Q"+limiteS+"\nTitular "+nombrep+"\nId de la Tarjeta: "+numtarj0+numtarj1+"-"+numtarj2+"-"+numtarj11+numtarj12+numtarj13+numtarj14+"-"+numtarj15+numtarj16+numtarj17+numtarj18+"\nPrecio: Q"+comprar+"\nSalto: Q"+saldoactu,"Online Shop",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
