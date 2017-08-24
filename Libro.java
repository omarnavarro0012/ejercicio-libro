public class Libro
{
    //variables de instancia
    private String titulo;
    private String autor;
    private int paginas;
    
    //constructor
    public Libro(String tit,String aut,int pag)
    {
        titulo=tit;
        autor=aut;
        paginas=pag;
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
   
   public int cuantasPaginas()
   {
       return paginas;
    }
  
   public String DetallesGen()
   {
       String detalles="";
       detalles+="Titulo: ";
       detalles+=titulo;
       detalles+=" ,";
       detalles+="Autor: ";
       detalles+=autor;
       detalles+=" ,";
       detalles+="Paginas: ";
       detalles+=paginas;
       detalles+=".";
       
       return detalles;
    }
}