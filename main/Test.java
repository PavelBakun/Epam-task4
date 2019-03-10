package main;

import logic.TariffComparator;
import logic.TariffFeeComparator;
import tariff.Species;
import tariff.Tariff;
import tariff.TariffBuilder;

import java.util.Comparator;
import java.util.Arrays;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

       Tariff comfort_S = new TariffBuilder()
               .buildSpecies(Species.COMFORT_S)
               .buildSubscriptionFee(12)
               .buildNumberOfClients(1000)
               .buildCostMinuteInNet(20)
               .buildCostMinuteOutNet(30)
               .buildCostSMS(40)
               .build();
        //System.out.println(comfort_S.toString());
        Tariff comfort_L = new TariffBuilder()
                .buildSpecies(Species.COMFORT_L)
                .buildSubscriptionFee(26)
                .build();
        Tariff comfort_M = new TariffBuilder()
                .buildSpecies(Species.COMFORT_M)
                .buildSubscriptionFee(20)
                .build();

       Comparator tcomp = new TariffComparator().thenComparing(new TariffFeeComparator());
        TreeSet<Tariff> tar = new TreeSet<Tariff>(tcomp);
        tar.add(comfort_M);
        tar.add(comfort_S);
        tar.add(comfort_L);


        for (Tariff t: tar) {
            System.out.println(t.getSpecies());
        }
    }
}

