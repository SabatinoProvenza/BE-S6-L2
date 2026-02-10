package sabatinoprovenza.BE_S6_L2.entities;

import java.time.LocalDate;
import java.util.Random;

public class Author {
    private long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private String avatar;

    public Author(String mome, String cognome, String email, LocalDate dataDiNascita, String avatar) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 1000);
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.avatar = "https://ui-avatars.com/api/?name=" + nome + "+" + cognome;
    }
}
