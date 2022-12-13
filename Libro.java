
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, String numeroDeReferencia)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = numeroDeReferencia;
    }
    
    public String getAutor (){
        return autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getNumeroPaginas (){
        return numeroPaginas;
    }
    
    public void imprimirAutor (String autor){
      System.out.println("Autor: "+autor);
    }

    public void imprimirTitulo (String titulo){
      System.out.println("Titulo: "+titulo);
    }
    
    public void impimirDetalles (boolean detalles){
        if (detalles == true){
            System.out.println("Titulo: "+titulo+" Autor: "+autor+" Paginas: "+numeroPaginas);
        }
        else{
            System.out.println("-Titulo: "+titulo+" Autor: "+autor+" Paginas: "+numeroPaginas+"-");
        }
        
    }
    
    public String getDetalles (boolean detalles){
        if (detalles == true){
            System.out.println("Titulo: "+titulo+" Autor: "+autor+" Paginas: "+numeroPaginas);
        }
        else{
            System.out.println("-Titulo: "+titulo+" Autor: "+autor+" Paginas: "+numeroPaginas+"-");
        }
        return boolean detalles;
    }
    
    public String getNumeroReferencia (){
        if (numeroReferencia.length()>=3) {
            System.out.println("Modificacion");
        }
        return numeroReferencia;
    }
    
    public void setNumeroReferencia (String numeroDeReferencia){
        this.numeroReferencia = numeroDeReferencia;
    }
}
