/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise9;

import BBK.PiJ01.common.Exercise;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class AccountingExercise implements Exercise {

    @Override
    public String getTitle() {
        return "Accounting exercise";
    }

    @Override
    public String getDescription() {
        return "Give the account a number of bills, and it tells you\n"
                + "your total debt.";
    }

    @Override
    public void run() {
        Accounting.main();
    }

}
