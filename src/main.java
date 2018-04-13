import bd.*;
import bd.dbos.*;

public class main {
	public static void main(String[] args)
    {
        try
        {
            Usuario usuario = new Usuario ("marcos99@gmail.com","Marquim","4002");
            BD.USUARIOS.incluir (usuario);
        }
        catch (Exception erro)
        {
            System.err.println (erro);
        }
    }

}
