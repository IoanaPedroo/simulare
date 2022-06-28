package models;

public class MobileTerrestrial extends ExtractorWithLocation implements ReportFault{


    public MobileTerrestrial(int capacity, int quantity, String location) {
        super(capacity, quantity, true, location);
    }

    @Override
    public boolean reportFault() {
        return  quantity/capacity < 25;
    }
}
