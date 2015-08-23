/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author Samitha
 */
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TermsAndConditions {

    static void createAndShowGUI() {

        // Create and set up the window.
        
        
        
        final JFrame frame = new JFrame("Reservation Terms and Conditions");

        // Display the window.
        frame.setSize(1366, 768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // set grid layout for the frame
        frame.getContentPane().setLayout(new GridLayout(1, 1));

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        tabbedPane.addTab("Terms Of Reservation", makePanel("1. Scope of Terms\n"
                + "These terms govern all reservations made through the internet booking engine of Hotel Galadari powered by DirectWithHotels.\n"
                + "\n"
                + "2. Acceptance\n"
                + "You accept these terms on behalf of all members of your party.\n"
                + "\n"
                + "3. Payment for Reservation\n"
                + "A credit card is required to guarantee your reservation. Your card will be checked for validity. No charge will be made. The total cost of your reservation will be paid at the hotel. DirectWithHotels does not make, accept or process payment to or on behalf of the Hotel Galadari at the time of reservation.\n"
                + "\n"
                + "4. Confirmed Reservation\n"
                + "The reservation is considered confirmed when you receive a Confirmation Page containing your Transaction ID. Please save and/or print this for your records and present it to the hotel upon check-in.\n"
                + "\n"
                + "5. Terms of Modifying or Cancelling a Reservation (Pay Upon Arrival)\n"
                + "Modification and cancellation may be allowed depending on the rate plan policy as stated in the policy section. The hotel reserves the right to charge your credit/ debit card for modification, cancellation and no-show fees as per the stated policy for your reservation.\n"
                + "\n"
                + "6. No-Show Terms\n"
                + "In the event that you do not check-in before the time specified in the Cancellation and No-Show Policies section, you will be qualified as a: \"no-show\" and the corresponding fees will be collected via a charge to the card on record.\n"
                + "\n"
                + "7. Secure Reservation Processing\n"
                + "The card and guest information collected from the internet booking engine are protected and securely transmitted by DigiCert®.\n"
                + "\n"
                + "8. Card Fraud Control\n"
                + "To protect credit card owners from fraud, the guest is required to present the actual credit card used in making the online booking and a valid government issued PHOTO ID of the card owner upon check-in. The hotel reserves the right to refuse the guest to check-in for failure to comply with this requirement. If the card owner is not the one staying at the hotel, the guest is required to present clear photocopies of the front and back of the credit card used, a valid government issued photo ID of the card owner along with an authorization letter stating that the credit card holder has allowed the guest to use his/her card for the reservation. The hotel may cancel a confirmed reservation if a booking is suspected to be made using a fraudulent credit card.\n"
                + "\n"
                + "9. No Liability\n"
                + "Neither Hotel Galadari, nor our online reservation provider nor any of our directors, employees, affiliates or other representatives, will be liable for loss or damages arising out of or in connection with your use of any information, products, services and/or the materials offered through this website and internet booking engine, including but not limited to, loss of data, income, profit or opportunity, loss of or damage to property and claims of third parties, or any indirect or consequential loss or damages.\n"
                + "\n"
                + "10. Limitation of Financial Liability\n"
                + "In the highly unlikely event of an issue arising as pertains to a reservation, any liability to the Hotel and the online reservation provider for our website is limited to the prepayment paid at the time of reservation.\n"
                + "\n"
                + "11. Governing Law\n"
                + "Your online reservation is governed by the laws of the United Kingdom and is subject to the exclusive jurisdiction of the courts. These terms represent the entire agreement between you and Hotel Galadari.\n"
                + "\n"
                + "12. Privacy Policy\n"
                + "All information collected are used only to secure the reservation. No data is shared with any third parties."));

        tabbedPane.addTab("Reservation Policies", makePanel("Policies:\n"
                + "\n"
                + "*All times indicated in the policies are expressed in hotel's local time (GMT +05:30).\n"
                + "\n"
                + "    Arrival time: 01:00 PM\n"
                + "    Departure time: 12:00 PM\n"
                + "    Children Policy: Child Age: 12 years and below\n"
                + "    Child Charge: USD 15/- net Per Extra bed\n"
                + "    Prepayment: No prepayment will be charged. Payment for your stay will be made at the hotel. Please note that your credit card may be pre-authorized prior to your arrival.\n"
                + "    Modification: We don't charge you a modification fee if you choose to modify before 1:00PM, August 12, 2015 GMT +05:30.\n"
                + "    Cancellation: If you choose to cancel, you will be charged 50% of the total reservation cost.\n"
                + "    No-show: Guests who do not arrive within 24 hours of the check-in date and time of the hotel will be charged the total amount of the reservation.\n"
                + "    Card Fraud Control: To protect credit card owners from fraud, the guest is required to present the actual credit card used in making the online booking and a valid government issued PHOTO ID of the card owner upon check-in.\n    The hotel reserves the right to refuse the guest to check-in for failure to comply with this requirement.\n    If the card owner is not the one staying at the hotel, the guest is required to present clear photocopies of the front and back of the credit card used, a valid government issued photo ID of the card owner along with an authorization letter stating that the credit card holder has allowed the guest to use his/her card for the reservation.\n    The hotel may cancel a confirmed reservation if a booking is suspected to be made using a fraudulent credit card.\n"
                + ""));

        frame.getContentPane().add(tabbedPane);

        // get the currently selected index for this tabbedpane
        int selectedIndex = tabbedPane.getSelectedIndex();
        System.out.println("Default Index:" + selectedIndex);

		// select the last tab
        //tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-1);
        //set the first tab
        tabbedPane.setSelectedIndex(0);

        selectedIndex = tabbedPane.getSelectedIndex();
        System.out.println("New Index:" + selectedIndex);

    }

    private static JPanel makePanel(String text) {
        JPanel p = new JPanel();
        p.add(new TextArea(text));
        p.setLayout(new GridLayout(1, 1));
        return p;
    }

    public static void main(String[] args) {

  //Schedule a job for the event-dispatching thread:
  //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                createAndShowGUI();

            }

        });
    }

}
