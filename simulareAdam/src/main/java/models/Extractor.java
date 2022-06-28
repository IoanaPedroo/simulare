package models;

import java.util.UUID;

public abstract class Extractor {
    protected UUID id;
    protected int capacity;
    protected int quantity;
    protected boolean canReportFaults;

    public Extractor(int capacity, int quantity, boolean canReportFaults) {
        this.id = UUID.randomUUID();
        this.capacity = capacity;
        this.quantity = quantity;
        this.canReportFaults = canReportFaults;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isCanReportFaults() {
        return canReportFaults;
    }

    @Override
    public String toString() {
        return "Extractor{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", quantity=" + quantity +
                ", canReportFaults=" + canReportFaults +
                '}';
    }
}
