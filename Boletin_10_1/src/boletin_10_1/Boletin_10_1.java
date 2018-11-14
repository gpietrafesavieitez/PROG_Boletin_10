package boletin_10_1;
import javax.swing.JOptionPane;

public class Boletin_10_1{

    public static void main(String[] args){
        boolean esc = false;
        byte numAdivinar,maxIntentos,numPrueba;
        numAdivinar = maxIntentos = numPrueba = 0;  
        JOptionPane.showMessageDialog(null,"Bienvenido: Jugador 1","Juego",1);
        do{
            try{
                numAdivinar = Byte.parseByte(JOptionPane.showInputDialog(null,"Porfavor, introduce un número del 1 al 50:","Juego",3));
                if(numAdivinar < 1 || numAdivinar > 50){
                    JOptionPane.showMessageDialog(null,"Error: Introduce un número entre 1 y 50.","Juego",0);
                    
                }else{      
                    do{
                        maxIntentos = Byte.parseByte(JOptionPane.showInputDialog(null,"Introduce ahora el número máximo de intentos:","Juego",3));
                        if(maxIntentos < 1 ){
                            JOptionPane.showMessageDialog(null,"Error: Dale al menos una oportunidad ;)","Juego",0);
                        }else if(maxIntentos > 100){
                            JOptionPane.showMessageDialog(null,"¿De verdad quieres un juego tan largo? :P","Juego",0);
                        }else{
                            esc = true;
                        }
                    }while(esc != true);
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error: Formato incorrecto.","Juego",0);
            }
        }while(esc != true);
        JOptionPane.showMessageDialog(null,"Bienvenido: Jugador 2","Juego",1);
        for(int i = 0; i < maxIntentos; i++){
            esc = false;
            do{
                try{
                    JOptionPane.showMessageDialog(null,"Intentos restantes: " + (maxIntentos - i),"Juego",2);
                    numPrueba = Byte.parseByte(JOptionPane.showInputDialog(null,"Adivina un número del 1 al 50:","Juego",3));
                    if(numPrueba < 1 || numPrueba > 50){
                        JOptionPane.showMessageDialog(null,"Error: Introduce un número entre 1 y 50.","Juego",0);
                    }else{
                        esc = true;
                    }
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Error: Formato incorrecto.","Juego",0);
                }
            }while(esc != true);   
            if(numAdivinar == numPrueba){
                JOptionPane.showMessageDialog(null,"¡HAS ACERTADO!","Juego",1);
                System.exit(0);
            }else if(numAdivinar > numPrueba){
                JOptionPane.showMessageDialog(null,"Pista: El número a adivinar es mayor.","Juego",2);
            }else{
                JOptionPane.showMessageDialog(null,"Pista: El número a adivinar es menor.","Juego",2);
            }
        }
        JOptionPane.showMessageDialog(null,"GAME OVER","Juego",1);
    }
}