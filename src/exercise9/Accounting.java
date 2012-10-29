/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9;

import BBK.PiJ01.common.BadInput;
import BBK.PiJ01.common.IOGeneric;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A program for simple personal accounting. * Asks the users about their bills,
 * and then says how many bills there are, and what is the * total debt.
 */
public class Accounting {

    /**
     * The first element of the list of bills
     */
    private Bill firstBill = null;

    public static void main(String ...args) {
        Accounting acc = new Accounting();
        acc.launch(args);
    }

    private void launch(String[] args) {
        String concept = "", strAmount;
        int amount = 0;
        do {
            System.out.println("What’s your next bill (type \"END\" to finish)?");
            System.out.print(" Concept: ");
            try {
                concept = IOGeneric.getString();
            } catch (BadInput ex) {
                System.out.println("I didn't understand that.");
                return;
            }
            
            if (!concept.equals("END")) {
                System.out.print(" Amount: ");
                try {
                strAmount = IOGeneric.getString();
            } catch (BadInput ex) {
                System.out.println("I didn't understand that.");
                return;
            }
                amount = Integer.parseInt(strAmount);
                Bill newBill = new Bill(concept, amount);
                addBillToList(newBill);
            }
        } while (!concept.equals("END"));
        int count = 0;
        int totalDebt = 0;
        for (Bill current = firstBill; current != null;) {
            count++;
            totalDebt += current.getAmount();
            current = current.getNextBill();
        }
        IOGeneric.println("You have " + count + " bills unpaid (total debt: " + totalDebt + ")");

    }

    private void addBillToList(Bill bill) {
        if (firstBill == null) {
            firstBill = bill;
            return;
        }
        Bill current = firstBill;
        while (current != null) {
            if (current.getNextBill() == null) {
                current.setNextBill(bill);
                return;
            }
            current = current.getNextBill();
        }
        return;
    }
}