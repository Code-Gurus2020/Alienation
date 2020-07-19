package com.alienation.game;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Capsule Room - This is the room where the character wakes up
 * User will see this room first when start the game
 */
public class CapsuleRoom {

    /*************** PRIVATE VARIABLE DECLARATIONS  ******************/
    private static String answer;
    private static String initialStory = "As you open your eyes your vision is blurry and your body hurts. You gasp to take your first breath as you wake from cryo-sleep.\n" +
            "You can tell the oxygen levels are low as it seems harder to breathe.  As you look around you notice that there is one crew member missing and\n" +
            "their sleeping capsule is shattered. The ship seems to be drifting in space and the lights are dim, most likely on some sort of backup system.\n" +
            "You notice a Tazer on the floor.\n\n";
    private static String updatedStory = "Updated\n\n";
    private static Map<String,Boolean> availableItems = new HashMap<String, Boolean>();
    private static Map<String,String> availableDirections = new HashMap<String, String>();
    private static int count = 0;

    /*************** PUBLIC METHODS  ******************/
    public static void loadEnvironment(){
        count++;
        System.out.println(getInitialStory());
        Menu.ShowMenu();
    }


    /*************** GETTER - SETTER METHODS  ******************/
    public static String getInitialStory() {
        if(count > 2){
            return updatedStory;
        }
        else{
            return initialStory;
        }
    }

//    public static String getStory() {
//        if (!getAvailableItems().containsKey("tazer")) {
//            return initialStory;
//        } else {
//            return updatedStory;
//        }
//    }

    public static Map<String,Boolean> getAvailableItems(){
        availableItems.put("tazer",true);

//        Set<String> keys = availableItems.keySet();
//        System.out.println("You see:");
//        for (String key : keys) {
//            System.out.println(key);
//        }
//        System.out.println("\n");
//        Menu.ShowMenu();
        return availableItems;
    }

    public static Map<String,String> getAvailableDirections(){
        availableDirections.put("N","ComputerRoom");
        availableDirections.put("S","ControlRoom");
        availableDirections.put("E","AlienRoom");
        availableDirections.put("W","");
        return availableDirections;
    }

    public static void grab(){
        System.out.println("Grab what?");
        Set<String> keys = availableItems.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println("\n");

    }
}
