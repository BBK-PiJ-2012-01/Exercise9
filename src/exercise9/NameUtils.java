/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9;

import BBK.PiJ01.common.BadInput;
import BBK.PiJ01.common.Exercise;
import BBK.PiJ01.common.IOGeneric;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class NameUtils implements Exercise {

    public String getInitials(String fullName) {
        String result = "";
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            String nextInitial = "" + words[i].charAt(0);
            result = result + nextInitial.toUpperCase();
        }
        return result;
    }

    @Override
    public String getTitle() {
        return "\'getInitials\' script.";
    }

    @Override
    public String getDescription() {
        return "Program that takes a name and prints its initials.";
    }

    @Override
    public void run() {
        String input;
        System.out.print("Enter your name: ");
        try {
            input = IOGeneric.getString();
        } catch (BadInput err) {
            System.out.println("Didn't understand your input.");
            return;
        }
        
        System.out.println("Your initials are: " + getInitials(input));
    }
}
