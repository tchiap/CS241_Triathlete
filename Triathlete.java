/**
 *  Name:  Tom Chiapete
 *  Course: CSCI 241 - Computer Science I
 *  October 11, 2005
 *  Section: 001
 *  Assignment Number: 4
 *
 *  Project/Class Description
 *      Prints a training summary based on information provided.
 *      The information that should be provided is a name, their weight, 
 *      yards swum, miles biked, miles run.
 *      The number of calories burned for each event will be calculated. 
 *      Then calculate the grand total calories burned.  Output to 
 *      system terminal.
 *      
 *  Imports java.util package.
 *
 *  Known Bugs:  None.
 */

import java.util.*;

public class Triathlete
{
    // instance variables
    private String name = ""; // Athlete's Name
    private int weight; // Athlete's weight in pounds
    private int totalYardsSwum; // The total number of yards the 
                                // athlete has swum.
                                
    private int totalMilesBiked; // The total number of yards the 
                                 // athlete has biked.
                                 
    private int totalMilesRun; // The total number of yards the 
                               // athlete has run.
    
    
    /**
     * Constructor for objects of class Triathlete
     */
    public Triathlete(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
        totalYardsSwum = 0;
        totalMilesBiked = 0;
        totalMilesRun = 0;
    }

    
    /**
     * getName() method
     * Returns the name (String) of the athlete
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * getWeight() method
     * Returns (int) the weight of the athlete.
     */
    public int getWeight()
    {
        return weight;   
    }
    
    /**
     * getTotalYardsSwum() method
     * Returns (int) the number of total yards swum.
     */
    public int getTotalYardsSwum()
    {
        return totalYardsSwum;
    }
    
    /**
     * getTotalMilesBiked() method
     * Returns (int) the total number of miles biked.
     */
    public int getTotalMilesBiked()
    {
        return totalMilesBiked;   
    }
    
    /**
     * getTotalMilesRun() method
     * Returns (int) the total number of miles run.
     */
    public int getTotalMilesRun()
    {
        return totalMilesRun;   
    }
    
    /**
     * setWeight() method
     * Takes in one parameter, (int) weight.  The parameter is assigned 
     * as the instance variable 
     */
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    
    /**
     * addToYardsSwum() method
     * Takes in one parameter, (int) yards.  The int parameter is added 
     * on to the totalYardsSwum instance variable.
     */
    public void addToYardsSwum(int yards)
    {
        totalYardsSwum += yards;
    }
    
    /** 
     * addToMilesBiked() method
     * Takes in one parameter, (int) miles.  The int parameter is added 
     * on to the totalMilesBiked instance variable.
     */
    public void addToMilesBiked(int miles)
    {
        totalMilesBiked += miles;
    }
    
    /**
     * addToMilesRun() method
     * Takes in one paramter, (int) miles.  The int parameter is added 
     * on to the totalMilesRun instance variable.
     */
    public void addToMilesRun(int miles)
    {
        totalMilesRun += miles;
    }
    
    
    // CALCULATIONS
    /**
     * calculateSwimmingCalories() method
     * Swimming calories can be calculated by taking the total yards 
     * swum multiplied by 3000, divided by 1760.  Round this number.  
     * Typecast this as an int, since we must return an int.
     */
    public int calculateSwimmingCalories()
    {
        return (int)Math.round(3000 * totalYardsSwum/1760.0);   
    }
    
    /**
     * calculateBikingCalories() method
     * Biking calories can be calculated by taking 31 multiplied by 
     * the total of miles biked.
     * Like before, round this result, and cast it as an int to make 
     * sure an int is returned.
     */
    public int calculateBikingCalories()
    {
        return (int)Math.round(31 * totalMilesBiked);   
    }
    
    /**
     * calculateRunningCalories() method
     * Running calories can be calculated by taking 1.4 multiplied by 
     * the weight instance variable, multiplied by the totalMilesRun 
     * instance variable.
     * Round this number, and cast this as an int.
     */
    public int calculateRunningCalories()
    {
        return (int)Math.round(1.4 * weight * totalMilesRun);   
    }
    
    // OUTPUT
    /**
     * Neatly output the person's swimming, biking, and running 
     * calories.
     * Also output the grand total calories burned.
     */
    public void printTrainingSummary()
    {
        // Call other instance methods in the class to do some work.
        // Add the total of the returned int values from these methods.
        // Place it into totalCalories (int)
        int totalCalories = calculateSwimmingCalories() +
                            calculateBikingCalories() +
                            calculateRunningCalories();
                            
        // Output to system terminal.
        System.out.println("T R A I N I N G   S U M M A R Y");
        System.out.println("===============================");
        System.out.println("Name: "+name);
        System.out.println("Weight: "+weight);
        System.out.print("Total Yards Swum:  "+totalYardsSwum);
        System.out.println("  Calories burned: "
            +calculateSwimmingCalories());
        System.out.print("Total Miles Biked:  "+totalMilesBiked);
        System.out.println("  Calories burned: "
            +calculateBikingCalories());
        System.out.print("Total Miles Run:  "+totalMilesRun);
        System.out.println("  Calories burned: "
            +calculateRunningCalories());
        System.out.println("------------------------------------");
        System.out.print("Grand Total:         "+totalCalories);
        
    }
}
