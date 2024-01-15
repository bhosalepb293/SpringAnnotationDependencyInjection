package ComponentAnnotation;

import org.springframework.stereotype.Component;

@Component//To create object of chess class.to provide reference is optinal.
public class Chess implements Game{

    @Override
    public void getGameInformation() {
        System.out.println("At a time only two players can play ");
        System.out.println("National Competition");
    }

    @Override
    public void getGameType() {
        System.out.println("It is a indoor game");
    }
}
