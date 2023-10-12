package Homework_2;

public class AppleGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("Создал новый сундук");
        return new AppleReward();
    }
}