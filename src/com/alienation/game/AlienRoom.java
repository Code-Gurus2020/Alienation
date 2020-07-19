package com.alienation.game;

import java.util.HashMap;
import java.util.Map;

/**
 * Alien Room - This is the room where user can go and investigate
 * User will find out there is one Alien in this room
 * User has to kill Alien to get the code
 */

public class AlienRoom {

    /*************** PRIVATE VARIABLE DECLARATIONS  ******************/
    private static String answer;
<<<<<<< HEAD
    private static String initialStory = "As you open your eyes your vision is blurry and your body hurts. You gasp to take your first breath as you wake from cryo-sleep.\n" +
            "You can tell the oxygen levels are low as it seems harder to breathe.  As you look around you notice that there is one crew member missing and\n" +
            "their sleeping capsule is shattered. The ship seems to be drifting in space and the lights are dim, most likely on some sort of backup system.\n" +
            "You notice a Tazer on the floor.\n\n";
    private static String updatedStory = "As you open your eyes your vision is blurry and your body hurts. You gasp to take your first breath as you wake from cryo-sleep.\n" +
            "You can tell the oxygen levels are low as it seems harder to breathe.  As you look around you notice that there is one crew member missing and\n" +
            "their sleeping capsule is shattered. The ship seems to be drifting in space and the lights are dim, most likely on some sort of backup system.\n" +
            "You notice a Tazer on the floor.\n\n";
=======
    private static String initialStory = "This is Alien Room.\n";
    private static String updatedStory = "This is Alien Room - Updated.\n";
>>>>>>> 9a21e2f43bed4251c360886f6907a1c6edd2a434
    private static Map<String,Boolean> availableItems = new HashMap<String, Boolean>();
    private static Map<String,Rooms> availableDirections = new HashMap<String, Rooms>();


    /*************** PUBLIC METHODS  ******************/
    // This method used to load Environment to user
    public static void loadEnvironment(){
<<<<<<< HEAD
        System.out.println(getInitialStory());
        Menu.ShowMenu();
=======
        System.out.println(getStory());
        Menu.displayMenu();
>>>>>>> 9a21e2f43bed4251c360886f6907a1c6edd2a434
    }


    /*************** GETTER - SETTER METHODS  ******************/
    // Get Story line while page loads
    public static String getStory() {
        if (!getAvailableItems().containsKey("Alien - Type 1")) {
            return initialStory;
        } else {
            if(getAvailableItems().get("Alien - Type 1")){
                return initialStory;
            }
            else{
                return updatedStory;
            }
        }
    }

    // Get available items of a room
    public static Map<String,Boolean> getAvailableItems(){
        if (availableItems.size() == 0) {
            availableItems.put("Alien - Type 1", true);
            availableItems.put("Bed", true);
            availableItems.put("Mirror", true);
            availableItems.put("Old Box", true);
        }
        return availableItems;
    }

    // set available items to false by key if item moved to Inventory
    public static void setAvailableItems(Map<String,Boolean> newAvailableItems) {
        availableItems = newAvailableItems;
    }

    // Get available directions from a room
    public static Map<String,Rooms> getAvailableDirections(){
        availableDirections.put("N",Rooms.Kitchen);
        availableDirections.put("S",null);
        availableDirections.put("E",null);
        availableDirections.put("W",Rooms.CapsuleRoom);
        return availableDirections;
    }
}
