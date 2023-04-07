/**
 *  Name: John Doe
 *  Course: CSCI 241 - Computer Science I
 *  Section: 001 or 002
 *  Assignment Number: 4
 *
 *  Project/Class Description
 *     This class tests the Triathlete class
 *
 *  Known Bugs:
 *     none
 */

public class TestTriathlete
{
    public static void main (String [ ] args)
    {
        // super-athlete thor wants all his past training included
        Triathlete thor = new Triathlete ("Throvald Hansen", 150);
        thor.addToYardsSwum(17600);
        thor.addToMilesBiked(250);
        thor.addToMilesRun(50);
        
        thor.printTrainingSummary();
        
        // make space between reports
        System.out.println();
        System.out.println();
        
        // fritzie is just starting out with her training
        Triathlete fritzie = new Triathlete("Fritzie Hansen", 100);
        fritzie.addToYardsSwum(100);
        fritzie.addToMilesBiked(10);
        fritzie.addToMilesRun(3);
        
        fritzie.printTrainingSummary();
        
        // make space between reports
        System.out.println();
        System.out.println();
        
         // report fritzie's current data to test "getter" methods
        System.out.println("Fritzie's data from first workout:");
        System.out.println("Name:  " + fritzie.getName());
        System.out.println("Weight:  " + fritzie.getWeight());
        System.out.println("Yards swum:  " + fritzie.getTotalYardsSwum());
        System.out.println("Miles biked:  " + fritzie.getTotalMilesBiked());
        System.out.println("Miles run:  " + fritzie.getTotalMilesRun());
        System.out.println();
        
        // fritzie has another workout
        fritzie.addToYardsSwum(150);
        fritzie.addToMilesBiked(12);
        fritzie.addToMilesRun(4);
        
        // adjust fritzie's weight to new level
        fritzie.setWeight(98);
        
        // print a new summary for fritzie
        fritzie.printTrainingSummary();
    }
}
