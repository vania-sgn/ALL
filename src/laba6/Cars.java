package laba6;

import java.util.Objects;

public class Cars {
    public int reduceFuel;
    private int сapacityEngine;
    private int cost;

    public Cars(int reduceFuel, int сapacityEngine,int cost) {
        this.reduceFuel = reduceFuel;
        this.сapacityEngine = сapacityEngine;
        this.cost=cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return reduceFuel == cars.reduceFuel &&
                сapacityEngine == cars.сapacityEngine &&
                cost == cars.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reduceFuel, сapacityEngine, cost);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + "Reduce Fuel:"+reduceFuel+","+ "CaparacityEngine:"+сapacityEngine+","+ "Cost:"+cost;
    }
    public int getReduseFuel() {

        return reduceFuel;
    }
    public int getCost() {
        return cost;
    }
}



