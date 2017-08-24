public class Libro
{
    //variables de instancia
    private String titulo;
    private String autor;
    
    //constructor
    public Libro(String tit,String aut)
    {
        titulo=tit;
        autor=aut;
    }
    //metodos   
    
    public String dimeAutor()
    {
        return autor;
       
   }
   
   public String dimeTitulo()
   {
       return titulo;
   }
  
}