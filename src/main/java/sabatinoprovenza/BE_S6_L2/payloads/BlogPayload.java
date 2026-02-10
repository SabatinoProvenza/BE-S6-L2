package sabatinoprovenza.BE_S6_L2.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@Getter
@AllArgsConstructor
@ToString
public class BlogPayload {
    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempoDiLettura;

}
