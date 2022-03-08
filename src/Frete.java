public class Frete {

    public Double calculaFrete(Estados estados) {
        switch (estados) {
            case SP:
                return 25D;
            case MG:
                return 40D;
            case ES:
                return 30D;
            case RJ:
                return 20D;
        }
        return 0D;
    }

}
