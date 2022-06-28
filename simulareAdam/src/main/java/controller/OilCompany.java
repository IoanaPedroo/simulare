package controller;

import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OilCompany {
    private List<Extractor> extractorList;

    public OilCompany() {
        this.extractorList = new ArrayList<>();
    }

    public void addExtractor(Extractor extractor){
        extractorList.add(extractor);
    }

    public int getNumberOfDevicesWithFaults(){
        int count = 0;
        for (Extractor extractor : extractorList) {
            if(extractor instanceof ReportFault e1 && e1.reportFault()){
                    count++;
                }
            }
        return count;
    }

    public List<Extractor> getExtractorsThatExtractedMoreThen95(){
        return extractorList.stream().filter(v -> (v.getQuantity()/v.getCapacity())*100 > 95).collect(Collectors.toList());
    }
}
