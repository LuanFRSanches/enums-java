package java.enums.insider;

public enum DiaDaSemana {
    Segunda(true),
    Terca(true),
    Quarta(true),
    Quinta(true),
    Sexta(true),
    Sabado(false),
    Domingo(false);

    boolean diaUtil;

    DiaDaSemana(boolean diaUtil) {
        this.diaUtil = diaUtil;
    }

    boolean isDiaUtil() {
        return diaUtil;
    }

}
