package miu.edu.cs489.quitz;

import miu.edu.cs489.quitz.model.Contact;
import miu.edu.cs489.quitz.model.EmailAddress;
import miu.edu.cs489.quitz.model.PhoneNumber;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] main){

        Contact contact1 = new Contact("David", "Sanger", "Argos LLC", "Sales Manager");
        Contact contact2 = new Contact("Carlos", "Jimenez", "Zappos", "Director");
        Contact contact3 = new Contact("Alli", "Gafar", "BMI Services", "HR Manager");

        List<PhoneNumber> phoneNumberListOfContact1 = List.of(new PhoneNumber("240-133-0011", "Home"),
                new PhoneNumber("240-112-0123", "Mobile"));

        List<PhoneNumber> phoneNumberListOfContact3 = List.of(new PhoneNumber("412-116-9988", "Work"));

        List<EmailAddress> emailListOfContact1 = List.of(new EmailAddress("dave.sang@gmail.com", "Home"),
                new EmailAddress("dsanger@argos.com", "Work"));

        List<EmailAddress> emailListOfContact3 = List.of(new EmailAddress("ali@bmi.com", "Work"));

        contact1.setPhoneNumberList(phoneNumberListOfContact1);
        contact1.setEmailAddressList(emailListOfContact1);

        contact3.setPhoneNumberList(phoneNumberListOfContact3);
        contact3.setEmailAddressList(emailListOfContact3);

        printContactsInSorted(List.of(contact1, contact2, contact3));
    }

    public  static  void  printContactsInSorted(List<Contact> contactList){
        List<Contact> sortedByLastName = contactList.stream().sorted(Comparator.comparing(Contact::getLastName)).toList();
        System.out.println("[");
        for (Contact contact : sortedByLastName){
            System.out.println(contact.toJSONString());
        }
        System.out.println("]");
    }
}
