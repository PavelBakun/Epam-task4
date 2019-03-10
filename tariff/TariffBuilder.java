package tariff;

public class TariffBuilder {

    private Species s;
    private int subFee;
    private int numClient;

    private int costMinInNet;
    private int costMinOutNet;
    private int costSMS;

    public TariffBuilder buildSpecies(Species s){
        this.s = s;
        return this;
    }
    public TariffBuilder buildSubscriptionFee(int subFee){
        this.subFee = subFee;
        return this;
    }
    public TariffBuilder buildNumberOfClients(int numClient){
        this.numClient = numClient;
        return this;
    }
    public TariffBuilder buildCostMinuteInNet(int costMinInNet){
        this.costMinInNet = costMinInNet;
        return this;
    }
    public TariffBuilder buildCostMinuteOutNet(int costMinOutNet){
        this.costMinOutNet = costMinOutNet;
        return this;
    }
    public TariffBuilder buildCostSMS(int costSMS){
        this.costSMS = costSMS;
        return this;
    }

    public Tariff build(){
        Tariff tariff = new Tariff();
        tariff.setSpecies(s);
        tariff.setSubscriptionFee(subFee);
        tariff.setNumberOfClients(numClient);
        tariff.setCostMinuteInNet(costMinInNet);
        tariff.setCostMinuteOutNet(costMinOutNet);
        tariff.setCostSMS(costSMS);
        return tariff;
    }
}
