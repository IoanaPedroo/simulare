package models;

public abstract class ExtractorWithLocation extends Extractor{

    public ExtractorWithLocation(int capacity, int quantity, boolean canReportFaults, String location) {
        super(capacity, quantity, canReportFaults);
        this.location = location;
    }

    protected String location;

    @Override
    public String toString() {
        return "ExtractorWithLocation{" +
                "location='" + location + '\'' +
                '}';
    }
}
