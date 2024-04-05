package miu.edu.cs489.quitz.model;

public class PhoneNumber {

    private String phoneNumber;

    private String label;

    public PhoneNumber(String phoneNumber, String label) {
        this.phoneNumber = phoneNumber;
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

    public String toJSONString() {
        return String.format("{ \"phoneNumber\":\"%s\", \"label\": \"%s\" }", phoneNumber, label);
    }
}
