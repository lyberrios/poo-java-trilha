import musica.ReprodutorMusical;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;

public class Main {
    public static void main(String[] args) {

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123456789");
        telefone.atender();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.selecionarMusica("Nome da Música");
        reprodutor.tocar();
        reprodutor.pausar();
        }
    }
