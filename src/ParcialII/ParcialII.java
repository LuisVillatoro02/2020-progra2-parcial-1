package ParcialII;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

public class ParcialII {
    public static void main(String[] args) {
     String [] botones={"Y","N"};
     String [] botones1={"Tarjeta de Credito","Tarjeta de Debito","Exit"};
   int opc;
    
        do{
            opc=JOptionPane.showOptionDialog(null, "Opciones: ","Credit Cards", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botones1, botones[0]);
            
            
            switch(opc){
            
            case 0:
                 Tarjetadecredito tarjeta = new Tarjetadecredito(12.00,0,909,2020,10000.00);
                   tarjeta.getdatos();
                   
                   int opcion1=JOptionPane.showOptionDialog(null,"Quieres Comprar","Credit Card",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);
                   if(opcion1 == 0){
                       JOptionPane.showMessageDialog(null,"A continuacion va a comprar","Credit Card",JOptionPane.INFORMATION_MESSAGE);
                       tarjeta.Metodocompra();
                   }
                   else {
                       JOptionPane.showMessageDialog(null,"No Quiere comprar algo?","Credit Card",JOptionPane.INFORMATION_MESSAGE);
                   
                   }
                   int opcion2=JOptionPane.showOptionDialog(null,"Usted va a depositar","Credit Card",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);
                if(opcion2 == 0){
                       JOptionPane.showMessageDialog(null,"Le meterá dinero a la cuenta","Credit Card",JOptionPane.INFORMATION_MESSAGE);
                      tarjeta.metodopagar();   
                }
                   else {
                       JOptionPane.showMessageDialog(null,"No le meterá dinero a la cuenta","Credit Card",JOptionPane.INFORMATION_MESSAGE);
                   
                   }
                   break;
            case 1:
                tarjetadedebito debito = new tarjetadedebito(0,909,2020,5000.00);
      debito.getdatos();
       int opcion3=JOptionPane.showOptionDialog(null,"Depositos ","Debit Cards",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);
       if(opcion3 == 0){
                       JOptionPane.showMessageDialog(null,"Depositar la cantidad","Debit Cards",JOptionPane.INFORMATION_MESSAGE);
                       debito.metododepositar();
       }
                   else {
                       JOptionPane.showMessageDialog(null,"No depositos","Debit Cards",JOptionPane.INFORMATION_MESSAGE);
                   
                   } 
       int opcion4=JOptionPane.showOptionDialog(null,"Quieres Comprar ","Debit Cards",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);
              if(opcion4 == 0){
                       JOptionPane.showMessageDialog(null,"Usted Comprará","Debit Cards",JOptionPane.INFORMATION_MESSAGE);
              debito.Metodocomprar();
              }
                   else {
                       JOptionPane.showMessageDialog(null,"No comprará?","Debit Card",JOptionPane.INFORMATION_MESSAGE);
                   
                   }
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Gracias por su visita, Saliendo Del Banco");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Usted no ingresó un numero correcto");
                break;
                 
        }
        }while(opc!=2);
    } 
    }

   

   
    

