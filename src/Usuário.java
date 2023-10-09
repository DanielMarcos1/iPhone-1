import Navegador.Navegador;
import ReprodutorMusical.ReprodutorMusical;
import Telefone.Telefone;

public class Usuário {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical("roberto@gmail.com", "Meus likes", "Lost Soul");
        Telefone telefone = new Telefone(938124311, 2, "98 contatos", "13 mensagens");
        Navegador navegador = new Navegador("Google", true);


        System.out.println(reprodutorMusical.getContaEmail());
        System.out.println("Música selecionada: " + reprodutorMusical.selecionarMusica(reprodutorMusical.album, reprodutorMusical.musica));
        reprodutorMusical.pausar();
        reprodutorMusical.tocar();

        telefone.ligar("12039");
        telefone.atender("Neymar Fenômeno Gaúcho");
        telefone.iniciarCorreioVoz("Correio-1");
        telefone.receberSMS("Neymar Fenômeno Gaúcho: Chegarei às 11h");
        telefone.enviarSMS("Certo, estarei no aguardo!", "Neymar Fenômeno Gaúcho");
        
        System.out.println(navegador.exibirPagina("nba.com"));
        navegador.adicionarNovaAba(1);
        navegador.exibirPagina("guthib.com");
        navegador.atualizarPagina("guthib.com");
    }
}
