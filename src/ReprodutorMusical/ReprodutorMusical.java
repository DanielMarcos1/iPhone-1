package ReprodutorMusical;
public class ReprodutorMusical {
    // Objetos
    private String contaEmail;

    public String album;

    public String musica;
    
    // Constructor
    public ReprodutorMusical(String contaEmail, String album, String musica) {
        this.contaEmail = contaEmail;
        this.album = album;
        this.musica = musica;
    }

    // Getters and setters
    public String getContaEmail() {
        return contaEmail;
    }

    public void setContaEmail(String contaEmail) {
        this.contaEmail = contaEmail;
    }
    
    // Methods
    public void tocar() {
        System.out.println("Tocando música selecionada");
    }

    public void pausar() {
        System.out.println("Música pausada!");
    }

    public String selecionarMusica(String album, String musica) {
        return album + " - " + musica;
    }
}
