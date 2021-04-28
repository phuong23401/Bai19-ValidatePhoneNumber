public class Test {
    public static PhoneNumExample phoneNumber;
    public static final String[] validNum = new String[]{"84-0123456789"};
    public static final String[] invalidNum = new String[]{"a8-9876543210"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumExample();
        for (String phone : validNum) {
            boolean isvalid = phoneNumber.validate(phone);
            System.out.println("Phone number " + phone + " is valid " + isvalid);
        }
        for (String phone : invalidNum) {
            boolean isvalid = phoneNumber.validate(phone);
            System.out.println("Phone number " + phone + " is invalid " + isvalid);
        }
    }
}
