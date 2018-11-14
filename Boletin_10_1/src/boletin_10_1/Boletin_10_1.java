package boletin_10_1;
import javax.swing.JOptionPane;

public class Boletin_10_1{

    public static void main(String[] args){
        boolean esc;
        byte numAdivinar,maxIntentos,numPrueba;
        numAdivinar = maxIntentos = numPrueba = 0;  
        JOptionPane.showMessageDialog(null,"Bienvenido: Jugador 1");
        
        do{
            
                numAdivinar = Byte.parseByte(JOptionPane.showInputDialog(null,"\nPorfavor, introduce un número del 1 al 50:"));
                
                if(numAdivinar < 1 || numAdivinar > 50){
                    JOptionPane.showMessageDialog(null,"Error: Introduce un número entre 1 y 50.");
                    esc = false;
                }else{      
                    do{
                        maxIntentos = Byte.parseByte(JOptionPane.showInputDialog(null,"Introduce ahora el número máximo de intentos:"));
                        if(maxIntentos < 1 ){
                        JOptionPane.showMessageDialog(null,"Error: Dale al menos una oportunidad ;)");
                        esc = false;
                    }else if(maxIntentos > 100){
                        JOptionPane.showMessageDialog(null,"¿De verdad quieres un juego tan largo? :P");
                        esc = false;
                    }else{
                        esc = true;
                    }
                    }while(esc != true);
                }
            
        }while(esc != true);
        JOptionPane.showMessageDialog(null,"Bienvenido: Jugador 2");
        for(int i = 0; i < maxIntentos; i++){
            do{
                numPrueba = Byte.parseByte(JOptionPane.showInputDialog(null,"Adivina un número del 1 al 50:"));
                if(numPrueba < 1 || numPrueba > 50){
                    JOptionPane.showMessageDialog(null,"Error: Introduce un número entre 1 y 50.");
                    esc = false;
                }else{
                    esc = true;
                }
            }while(esc != true);      
            if(numAdivinar == numPrueba){
                JOptionPane.showMessageDialog(null,"¡Has acertado!.");
                System.exit(0);
            }else if(numAdivinar > numPrueba){
                JOptionPane.showMessageDialog(null,"Pista: El número a adivinar es mayor.");
            }else if(numAdivinar < numPrueba){
                JOptionPane.showMessageDialog(null,"Pista: El número a adivinar es menor.");
            }
        }
        JOptionPane.showMessageDialog(null,"Game Over");
        
    }
}
