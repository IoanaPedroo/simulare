package models;

import utils.Position;

import java.util.ArrayList;
import java.util.List;

public class OffshorePlatform extends Extractor implements ReportFault{

    private List<Worker> workerList;

    public OffshorePlatform(int capacity, int quantity) {
        super(capacity, quantity, true);
        this.workerList = new ArrayList<>();
    }


    @Override
    public boolean reportFault() {
        boolean hasNotDoctor = workerList.stream().noneMatch(v -> v.getPosition() == Position.MEDIC);
        boolean hasBeenMoreThen14Days = workerList.stream().anyMatch(v -> v.getNumberOfDaysOnPlatform() > 14);
        return quantity/capacity > 70 || hasNotDoctor || hasBeenMoreThen14Days;
    }


    public void addWorker(Worker worker){
        workerList.add(worker);
    }
}
