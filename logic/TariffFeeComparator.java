package logic;

import tariff.Tariff;

import java.util.Comparator;

public class TariffFeeComparator implements Comparator<Tariff> {

    public int compare(Tariff a, Tariff b) {
        if (a.getSubscriptionFee() > b.getSubscriptionFee()) {
            return 1;
        } else if (a.getSubscriptionFee() < b.getSubscriptionFee()) {
            return -1;
        } else
            return 0;
    }


}
