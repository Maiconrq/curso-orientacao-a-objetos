import java.util.*;
import java.lang.reflect.*;

//Classe declarada por mim
class Pessoa {
    
    public String nome;
    public int idade;
    
}
public class Programa2 {
    
    public static void main(String args[]) {
        Field[] allFields = Pessoa.class.getDeclaredFields();
        
        for (Field field : allFields) {
            System.out.println(field.getName());
        }
    }
}