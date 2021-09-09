import java.util.*;

//Classe declarada por mim
 class PrimeiraClasse {
    
    private String saida = "PrimeiraClasse";
    
}

public class Programa {
    public static void main(String args[]) {
        String classe = "PrimeiraClasse";
        try  {
            Class.forName(classe);
            System.out.println(classe);
        }  catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada!");
        }
    }
}
