package org.iphone.main;
// IPhone.java
public class IPhone implements ReprodutorMusical, Telefone, Navegador {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na Internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página na Internet...");
    }

    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        meuIPhone.tocar();
        meuIPhone.ligar();
        meuIPhone.exibirPagina();
    }
}

