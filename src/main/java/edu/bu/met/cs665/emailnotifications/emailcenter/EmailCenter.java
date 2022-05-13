/**
 * Assignment-3
 * Description: Email center is the Creator class with the factory method : generateEmail.
 */

package edu.bu.met.cs665.emailnotifications.emailcenter;

import edu.bu.met.cs665.emailnotifications.customer.Customer;

public abstract class EmailCenter {

  private String subject;
  private String emailBody;

  /**
   * generateEmail is abstract method in abstract class EmailCenter.
   * @param type String
   * @return
   */

  abstract Customer generateEmail(String type);

  /**
   * send email notification to different types of the customers.
   * @param customerType String
   * @param customerName String
   * @param customerEmailId String
   * @return ct1
   */

  public Customer sendEmail(String customerType, String customerName, String customerEmailId) {
    Customer ct1 = generateEmail(customerType);
    subject = "Welcome " + customerName + "......";
    emailBody =
        "Hello " + customerName + " thanks for being a part of " + customerType + " customer.";

    System.out.println(
        ct1.typeofEmailTemplate()
            + "\n"
            + "to: "
            + customerEmailId
            + "\n"
            + "subject: "
            + subject
            + "\n"
            + "emailBody: "
            + emailBody);
    System.out.println("-------------------------------------------------------------------------");
    return ct1;
  }

  /**
   * check or assert the which type of the customer is returned in junit testcase.
   * @param customerType String
   * @return customerType
   */

  public String toString(String customerType) {
    return customerType;
  }
}
