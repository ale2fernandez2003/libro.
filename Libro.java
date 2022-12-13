
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
    private int vecesPrestado;
    private boolean esLibroDeTexto;
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, String numeroDeReferencia, int vecesDePrestado, boolean texto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = numeroDeReferencia;
        vecesPrestado = vecesDePrestado;
        esLibroDeTexto = texto;
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
    
    public void impimirDetalles (){
        String numeroReferencia = "";
        String libroDeTexto;
        if (esLibroDeTexto){
            libroDeTexto = "correcto";
        }
        else {
            libroDeTexto = "falso";
        }
        
        if (numeroReferencia == ""){
            System.out.println("--");
        }
        else {
            System.out.println("Titulo: "+titulo+" Autor: "+autor+" Paginas: "+numeroPaginas +" Numero de referencia: "+numeroReferencia+" Veces que a sido prestado: "+vecesPrestado+" ¿Es un libro de texto? " +libroDeTexto);        
        }
    }
    
    public String getDetalles (){
        String detalles = "";
        String numeroReferencia = "";
        String libroDeTexto;
        if (esLibroDeTexto){
            libroDeTexto = "correcto";
        }
        else {
            libroDeTexto = "falso";
        }
        
        if (numeroReferencia == ""){
            detalles = ("--");
        }
        else {
            detalles = ("Titulo: "+titulo+" Autor: "+autor+" Paginas: "+numeroPaginas+" Numero de referencia: "+numeroReferencia+" Veces que a sido prestado: "+vecesPrestado+" ¿Es un libro de texto? " +libroDeTexto);        
        }
        return detalles;
    }
    
    public String getNumeroReferencia (){
        return numeroReferencia;
    }
    
    public void setNumeroReferencia (String numeroDeReferencia){
        if (numeroReferencia.length()<3) {
            System.out.println("Mensaje de error");
            this.numeroReferencia = numeroDeReferencia;
        }
        else{
            numeroReferencia.substring(0,3);
        }
    }
    
    public void prestar (){
        vecesPrestado = vecesPrestado +1;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public boolean getEsLibroDeTexto (){
        return esLibroDeTexto;
    }
}