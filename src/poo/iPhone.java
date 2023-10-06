package poo;
import java.util.Scanner;


public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
private Scanner scanner = new Scanner(System.in);
    
    @Override
    public void tocar() {
        System.out.println("Música tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione uma música:");
        String musicaSelecionada = scanner.nextLine();
        System.out.println("Música selecionada: " + musicaSelecionada);
    }

    @Override
    public void ligar() {
        System.out.println("Telefone ligado.");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página exibida.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
    
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        
        // Exemplo de uso:
        iphone.tocar();
        iphone.selecionarMusica();
        iphone.pausar();
        
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}