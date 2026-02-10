package sabatinoprovenza.BE_S6_L2.entities;

import java.util.Random;

public class Blog {
    private long id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

    public Blog(String categoria, String titolo, String cover, String contenuto, int tempoDiLettura) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 1000);
        this.categoria = categoria;
        this.titolo = titolo;
        this.cover = "https://www.google.com/url?q=https://picsum.photos/200/300&sa=D&source=editors&ust=1770732062312020&usg=AOvVaw009Cfm-2X-8EopptavJWWq";
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
    }
}
