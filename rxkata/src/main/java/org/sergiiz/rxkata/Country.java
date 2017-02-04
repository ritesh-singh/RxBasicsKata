package org.sergiiz.rxkata;


class Country {
    final String name;
    final String currency;
    final long population;

    Country(String name, String currency, long population) {
        this.name = name;
        this.currency = currency;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", currency='" + currency + '\'' +
                ", population=" + population +
                '}';
    }
}
