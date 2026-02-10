package sabatinoprovenza.BE_S6_L2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class Blog {
    private long id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

    public Blog(String categoria, String titolo, String contenuto, int tempoDiLettura) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 1000);
        this.categoria = categoria;
        this.titolo = titolo;
        this.cover = "https://picsum.photos/200/300";
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
    }
}
