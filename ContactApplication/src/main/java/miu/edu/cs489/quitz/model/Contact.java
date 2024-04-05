package miu.edu.cs489.quitz.model;

import java.util.List;

public class Contact {

    private String firstName;

    private String lastName;

    private String company;

    private String jobTitle;

    private List<EmailAddress> emailAddressList;

    private List<PhoneNumber> phoneNumberList;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<EmailAddress> getEmailAddressList() {
        return emailAddressList;
    }

    public void setEmailAddressList(List<EmailAddress> emailAddressList) {
        this.emailAddressList = emailAddressList;
    }

    public List<PhoneNumber> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(List<PhoneNumber> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", emailAddressList=" + emailAddressList +
                ", phoneNumberList=" + phoneNumberList +
                '}';
    }

    public  String toJSONString(){
        StringBuilder phoneNumberListJson = new StringBuilder();
        StringBuilder emailListJson = new StringBuilder();
        if(emailAddressList != null){
            emailListJson.append("[");
            for(EmailAddress emailAddress : emailAddressList){
                emailListJson.append(emailAddress.toJSONString());
            }
            emailListJson.append("]");
        }
        if(phoneNumberList != null){
            phoneNumberListJson.append("[");
            for(PhoneNumber phoneNumber : phoneNumberList){
                phoneNumberListJson.append(phoneNumber.toJSONString());
            }
            phoneNumberListJson.append("]");
        }
      return  String.format("\t{ \"firstName\": \"%s\", \"lastName\": \"%s\", \"company\": \"%s\" , \"jobTitle\": \"%s\"," +
                "\"emailAddressList\": \"%s\", \"phoneNumberList\": %s }", firstName, lastName, company, jobTitle,
              emailListJson.toString(), phoneNumberListJson.toString());
    }
}
