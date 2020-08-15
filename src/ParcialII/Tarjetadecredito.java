
package ParcialII;

import javax.swing.JOptionPane;
import java.util.Random;
import static javax.swing.JOptionPane.showInputDialog;

public class Tarjetadecredito extends Tarjetabancaria {
  Random ra= new Random();
    private int numtarj3, numtarj4,numtarj5,numtarj6,numtarj7,numtarj8,numtarj9,numtarj10;
  private int comprar,pagar;
  private Double limiteC;
  private String nombrep; 
  private double saldoactu;
  private Double limitedec,tasai;
  private Double metodoC,metodoP;
   private int numtarj11, numtarj12,numtarj13,numtarj14,numtarj15,numtarj16,numtarj17,numtarj18;
  
    public Tarjetadecredito(Double tasai,int numtarj0, int numtarj1, int numtarj2, Double limitedec) {
        super(numtarj0, numtarj1, numtarj2);
       this.tasai=tasai;
        this.limitedec=limitedec;
       
        
    }

    
  @Override
    public void getdatos(){
        this.limiteC=Double.parseDouble(JOptionPane.showInputDialog(null,"Credito para la tarjeta","Credit Card",JOptionPane.INFORMATION_MESSAGE));
        this.nombrep=JOptionPane.showInputDialog(null,"Nombre del Titular:","Credit Card",JOptionPane.INFORMATION_MESSAGE);
        this.saldoactu=Double.parseDouble(JOptionPane.showInputDialog(null,"Saldo Actual:","Credit Card",JOptionPane.INFORMATION_MESSAGE));
        this.numtarj3=ra.nextInt(9);
        this.numtarj4=ra.nextInt(9);
        this.numtarj5=ra.nextInt(9);
        this.numtarj6=ra.nextInt(9);
        this.numtarj7=ra.nextInt(9);
        this.numtarj8=ra.nextInt(9);
        
        this.numtarj10=ra.nextInt(9);
        this.numtarj11=numtarj3;
        this.numtarj12=numtarj4;
        this.numtarj13=numtarj5;
        this.numtarj14=numtarj6;
        this.numtarj15=numtarj7;
        this.numtarj16=numtarj8;
        this.numtarj17=numtarj9;
        this.numtarj18=numtarj10;
         if(limiteC>limitedec){
    JOptionPane.showMessageDialog(null,"Limite del Cliente: Q"+limiteC+"\nTitual: "+nombrep+"\nInteres: "+tasai+"%"+"\nId de la Tarjeta: "+numtarj0+numtarj1+"-"+numtarj2+"-"+numtarj3+numtarj4+numtarj5+numtarj6+"-"+numtarj7+numtarj8+numtarj9+numtarj10+"\n Credito del Banco Permitido: Q"+limitedec+"\n Saldo: Q"+saldoactu+"\n\nUsted paso el limite permitido"+"\n\n Volviendo al menú","Credit Card",JOptionPane.INFORMATION_MESSAGE);
        
    getdatos();
         }else{
        JOptionPane.showMessageDialog(null,"Credito del Cliente: Q"+limiteC+"\nTitula: "+nombrep+"\nIntereses: "+tasai+"%"+"\nId de la Tarjeta: "+numtarj0+numtarj1+"-"+numtarj2+"-"+numtarj3+numtarj4+numtarj5+numtarj6+"-"+numtarj7+numtarj8+numtarj9+numtarj10+"\n Credito del Banco Permitido: Q"+limitedec+"\n Saldo: Q"+saldoactu,"Credit Card",JOptionPane.INFORMATION_MESSAGE);
         }
       
    
       
    }
    public void Metodocompra(){
        
            
       
        this.metodoC=Double.parseDouble(JOptionPane.showInputDialog(null,"Precio","Online Shop",JOptionPane.INFORMATION_MESSAGE));
        if(metodoC > limiteC){
      JOptionPane.showMessageDialog(null,"No puede por que se pasó de su limite"+"\n\nVolviendo al menú","Online Shop",JOptionPane.INFORMATION_MESSAGE);      
       
      Metodocompra();
        
        }else
         
        this.saldoactu=this.saldoactu-this.metodoC;
       JOptionPane.showMessageDialog(null,"Online Shop Menú"+"\n\nCredito del Cliente: Q"+limiteC+"\nTitular "+nombrep+"\nIntereses: "+tasai+"%"+"\n Id de la Tarjeta: "+numtarj0+numtarj1+"-"+numtarj2+"-"+numtarj11+numtarj12+numtarj13+numtarj14+"-"+numtarj15+numtarj16+numtarj17+numtarj18+"\nLimite Bancario: Q"+limitedec+"\nCompra Total: Q"+metodoC+"\nSaldo: Q"+saldoactu,"Online Shops",JOptionPane.INFORMATION_MESSAGE);
        
    }
   public void metodopagar(){
        this.metodoP=Double.parseDouble(JOptionPane.showInputDialog(null,"Precio:","Online Shop ",JOptionPane.INFORMATION_MESSAGE));
       this.saldoactu=this.saldoactu+this.metodoP;
       JOptionPane.showMessageDialog(null,"Online Menú"+"\n\nLimite: Q"+limiteC+"\nTitular "+nombrep+"\nIntereses: "+tasai+"%"+"\nId de la Tarjeta: "+numtarj0+numtarj1+"-"+numtarj2+"-"+numtarj11+numtarj12+numtarj13+numtarj14+"-"+numtarj15+numtarj16+numtarj17+numtarj18+"\nLimite: Q"+limitedec+"\nPrecio: Q"+metodoP+"\nSaldo: Q"+saldoactu,"Online Shop",JOptionPane.INFORMATION_MESSAGE);
    
    }
}
