import controller.OilCompany;
import models.FixedTerrestrial;
import models.MobileTerrestrial;
import models.OffshorePlatform;
import models.Worker;
import utils.Position;

public class App {
    public static void main(String[] args) {
        OilCompany oilCompany = new OilCompany();
        FixedTerrestrial fixedTerrestrial = new FixedTerrestrial(95,25,"Bucuresti");
        MobileTerrestrial mobileTerrestrial = new MobileTerrestrial(25,5,"Ploiesti");
        OffshorePlatform offshorePlatform = new OffshorePlatform(100,100);
        Worker doctor = new Worker("ANdrei", Position.MEDIC, 5);
        Worker worker = new Worker("alin", Position.MANUAL_WORKER, 8);
        Worker worker1 = new Worker("alin", Position.MANUAL_WORKER, 8);
        Worker worker3 = new Worker("alinel", Position.MANUAL_WORKER, 5);
        Worker worker2 = new Worker("alinus", Position.MANAGER, 8);
        offshorePlatform.addWorker(doctor);
        offshorePlatform.addWorker(worker);
        offshorePlatform.addWorker(worker1);
        offshorePlatform.addWorker(worker2);
        offshorePlatform.addWorker(worker3);
        oilCompany.addExtractor(fixedTerrestrial);
        oilCompany.addExtractor(mobileTerrestrial);
        oilCompany.addExtractor(offshorePlatform);
        System.out.println(oilCompany.getNumberOfDevicesWithFaults());
        System.out.println(oilCompany.getExtractorsThatExtractedMoreThen95());
    }
}
