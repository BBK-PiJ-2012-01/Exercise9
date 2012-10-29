/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9;

import BBK.PiJ01.common.BadInput;
import BBK.PiJ01.common.Exercise;
import BBK.PiJ01.common.ExerciseChooser;
import java.util.ArrayList;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class Exercise9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BadInput {
        ArrayList<Exercise> exercises = new ArrayList<Exercise>();
        
        exercises.add(new NameUtils());
        exercises.add(new AccountingExercise());
        
        ExerciseChooser ech = new ExerciseChooser(exercises);
        ech.run();
    }
}
