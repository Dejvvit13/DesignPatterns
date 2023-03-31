package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Airforce implements IAlliancePart {

    List<IAlliancePart> planes = new ArrayList<>();
    public void add(IAlliancePart alliancePart){
        planes.add(alliancePart);
    }

    @Override
    public int getPersonnel() {
       return planes.stream().mapToInt(IAlliancePart::getPersonnel).sum();
    }
}
