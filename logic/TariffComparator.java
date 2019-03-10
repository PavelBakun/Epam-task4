package logic;

import tariff.Tariff;

import java.util.Comparator;

public class TariffComparator implements Comparator<Tariff> {

    public int compare(Tariff a, Tariff b) {
        return a.getSpecies().compareTo(b.getSpecies());
    }

}
