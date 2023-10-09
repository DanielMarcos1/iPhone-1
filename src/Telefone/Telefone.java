package Telefone;
public class Telefone {
    // Objects
    public int numero;

    private int correioVoz;

    private String contato;

    private String sms;

    // Constructor
    public Telefone(int numero, int correioVoz, String contato, String sms) {
        this.numero = numero;
        this.correioVoz = correioVoz;
        this.contato = contato;
        this.sms = sms;
    }

    // Getters and setters
    public int getCorreioVoz() {
        return correioVoz;
    }

    public void setCorreioVoz(int correioVoz) {
        this.correioVoz = correioVoz;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    // Methods
    public String ligar(String contato) {
        return "Ligando para o número: " + contato;
    }

    public void atender(String contato) {
        System.out.println("Atendendo número");
    }

    public void iniciarCorreioVoz(String getCorreioVoz) {
        System.out.println("Você possui " + getCorreioVoz() + " disponíveis");
        System.out.println("Ouvindo correio");
    }

    public void receberSMS(String sms) {
        setSms(sms);
    }

    public String enviarSMS (String sms, String contato) {
        return "SMS enviado para" + contato;
    }
}
