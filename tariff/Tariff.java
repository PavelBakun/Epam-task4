package tariff;

public class Tariff {
    private Species species;
    private int subscriptionFee;
    private int numberOfClients;

    private int costMinuteInNet;
    private int costMinuteOutNet;
    private int costSMS;

    public Species getSpecies() {
        return species;
    }
     public void setSpecies(Species species) {
        this.species = species;
    }
    public int getSubscriptionFee() {
        return subscriptionFee;
    }
    public void setSubscriptionFee(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }
    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }
    public int getCostMinuteInNet() {
        return costMinuteInNet;
    }
    public void setCostMinuteInNet(int costMinuteInNet) {
        this.costMinuteInNet = costMinuteInNet;
    }

    public int getCostMinuteOutNet() {
        return costMinuteOutNet;
    }
    public void setCostMinuteOutNet(int costMinuteOutNet) {
        this.costMinuteOutNet = costMinuteOutNet;
    }

    public int getCostSMS() {
        return costSMS;
    }
    public void setCostSMS(int costSMS) {
        this.costSMS = costSMS;
    }

    public String toString() {
        return "tarrif [species " + species
                + ", subscriptionFee = " + subscriptionFee
                + ", numberOfClients = " + numberOfClients
                + ", costMinuteInNet = " + costMinuteInNet
                + ", costMinuteOutNet = " + costMinuteOutNet
                + ", costSMS = " + costSMS + "]";
    }

}
