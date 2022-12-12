
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
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
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
    
    public void impimirDetalles (String autor, String titulo, int numeroPaginas){
        System.out.println("Titulo: "+titulo+" Autor: "+autor+" Paginas: "+numeroPaginas);
    }
    
    public String getDetalles (String impimirDetalles){
        return impimirDetalles;
    }
}
