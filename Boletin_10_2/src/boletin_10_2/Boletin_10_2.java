package boletin_10_2;
import java.util.Random;
import javax.swing.JOptionPane;

public class Boletin_10_2{
    private static Random random = new Random();
    
    public static void main(String[] args){
        int numAleatorio = random.nextInt(50) + 1,numJugador = 0,c = 0;
        System.out.println(numAleatorio);
        do{
            try{
                numJugador = Integer.parseInt(JOptionPane.showInputDialog(null,"Adiviña un numero entre 1 e 50:","Xogo",3));
                if(numJugador < 1 || numJugador > 50){
                    JOptionPane.showMessageDialog(null,"Error: O numero debe estar entre 1 e 50 incluidos.","Xogo",0);
                }else{
                    c++; //Contamos 1 intento
                    if(Math.abs(numAleatorio - numJugador) > 20){
                        JOptionPane.showMessageDialog(null,"Moi lonxe.","Xogo",2);
                    }else if(Math.abs(numAleatorio - numJugador) >= 10 && Math.abs(numAleatorio - numJugador) <= 20){
                        JOptionPane.showMessageDialog(null,"Lonxe.","Xogo",2);
                    }else if(Math.abs(numAleatorio - numJugador) > 5 && Math.abs(numAleatorio - numJugador) < 10){
                        JOptionPane.showMessageDialog(null,"Preto.","Xogo",2);
                    }else if(Math.abs(numAleatorio - numJugador) > 0 && Math.abs(numAleatorio - numJugador) <= 5){
                        JOptionPane.showMessageDialog(null,"Moi preto.","Xogo",2);
                    }
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error: Formato incorrecto.","Xogo",0);
            }
        }while(numAleatorio != numJugador);
        JOptionPane.showMessageDialog(null,"¡GAÑASTE!\nIntentos: " + c,"Xogo",1);
    }
}
