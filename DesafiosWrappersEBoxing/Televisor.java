package DesafiosWrappersEBoxing;

import java.util.Objects;

public class Televisor {
    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(final Integer novoCanal) {
        Objects.requireNonNull(novoCanal, "Você deve digitar um canal");
        if (canal.equals(novoCanal)) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        Objects.requireNonNull(novoVolume, "Você deve digitar um canal");
        if (novoVolume.equals(volume)) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = Integer.valueOf(novoVolume.byteValue());
            System.out.println("Volume alterado para " + volume);
        }
    }

}
