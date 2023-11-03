package Controller;

import Model.BasicObjects.*;

public abstract class CardFiltering {
    final static int VISA = 4;
    final static int MASTERCARD = 5;
    final static int AMERICANEXPRESS = 3;

    public void Filtering(Card Tarjeta) {
        String numeroDeTarjeta = Integer.toString(Tarjeta.getNumerodeTarjeta());
        int value = Integer.parseInt(numeroDeTarjeta.substring(0, 1));
        switch (value) {
            case VISA:
                throw new UnsupportedOperationException("Falta Poner Visa Process");
            // break;
            case MASTERCARD:
                throw new UnsupportedOperationException("Falta Poner MasterCard Process");
            // break;
            case AMERICANEXPRESS:
                throw new UnsupportedOperationException("Falta Poner AmericanExpress Process");
            // break;
            default:
                break;
        }
    }
}
