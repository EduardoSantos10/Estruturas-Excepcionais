
import java.text.NumberFormat;
import java.text.ParseException;

public class HierarquiaClasses {
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor); //vou imprimir esse valor // O primeiro resultado vai ser uma excecao
        
        } catch (ParseException e) {
            e.printStackTrace();
        }// Vamos tentar converter um valor string para numerico // valueOf -> tem a finalidade de pegar um string e conv. para Double
        
    }
    
}
