package ComponentAnnotation;

import org.springframework.stereotype.Component;

@Component
public class VideoGame implements Game{
    @Override
    public void getGameInformation() {
        System.out.println("Game name: PUBG");
        System.out.println("Single player can play video games");

    }

    @Override
    public void getGameType() {
        System.out.println("It is a indoor game");
    }
}
