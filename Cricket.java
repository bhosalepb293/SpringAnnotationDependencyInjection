package ComponentAnnotation;

import org.springframework.stereotype.Component;

@Component("t20Cricket")//object will store here.
public class Cricket implements Game{
    @Override
    public void getGameInformation() {
        System.out.println("Cricket is a outdoor game");
    }

    @Override
    public void getGameType() {
        System.out.println("T20 Series");
        System.out.println("IPL Season");
    }
}

