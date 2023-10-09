package Navegador;
public class Navegador {
    public String motorBusca;
    
    private boolean internetConnection;

    public Navegador(String motorBusca, boolean internetConnection) {
        this.motorBusca = motorBusca;
        this.internetConnection = internetConnection;
    }

    public boolean isInternetConnection() {
        return internetConnection;
    }

    public void setInternetConnection(boolean internetConnection) {
        this.internetConnection = internetConnection;
    }

    public String exibirPagina(String url) {
        return "Abrindo página: " + url;
    } 

    public String adicionarNovaAba(int aba) {
        String result = String.valueOf(aba); 
        return result + "aba(s) criada(s)";
    }

    public String atualizarPagina(String url) {
        return "A aba da url: " + url + " foi atualizada";
    }

}
