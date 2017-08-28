public class Libro
{
    //variables de instancia
    private String titulo;
    private String autor;
    private int paginas;
    private String numDeRef;
    
    //constructor
    public Libro(String tit,String aut,int pag)
    {
        titulo=tit;
        autor=aut;
        paginas=pag;
        numDeRef="";
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
   
   public String dimeNumref()
   {
       return numDeRef;
    }
    
   public int cuantasPaginas()
   {
       return paginas;
    }
  
   public void cambianumdRef(String ndRef)
   {
       if (ndRef.length()>=3)
     {
          numDeRef=ndRef;
       }
       else
       {
           numDeRef=numDeRef;
        }
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
       detalles+=",";
       detalles+="Biblioteca: ";
       detalles+=numDeRef;
       detalles+=".";
       
       return detalles;
    }
}