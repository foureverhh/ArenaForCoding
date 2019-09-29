package javaIntro.Task3.job2;

public class Elevator {
    private int level;

    public void goTo(int level){
        if(level > 10){
            System.out.println("Sorry, the highest floor is 10.");
            return;
        }
        if(level < -2){
            System.out.println("Sorry, the lowest floor is -2.");
            return;
        }

        if(level> this.level){
            System.out.println("Elevator going up to floor --> "+level);
        }
        else if(level< this.level){
            System.out.println("Elevator going down to floor --> "+level);
        }else {
            System.out.println("Elevator is already here on floor --> "+level);
        }
        this.level = level;
    }

    public int where(){
        return this.level;
    }

}
