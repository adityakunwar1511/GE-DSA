
public class CustomMsg {
    public static void main(String[] args) {
        String messageTemplate = "Hi <<name>>, your full name recorded as <<full name>> in our database. "
                + "We have your contact number as 91-xxxxxxxxxx. If you have any questions, feel free to reach out. "
                + "Best regards, BridgeLabz 01/01/2016.";

        // Personal details
        String firstName = "AAPKA-NAME";
        String fullName = "PORA-NAME";
        String contactNumber = "MOBILE NUM";
        String currentDate = "TARIK";

        // Replace placeholders with actual data
        messageTemplate = messageTemplate.replace("<<name>>", firstName)
                .replace("<<full name>>", fullName)
                .replace("91-xxxxxxxxxx", contactNumber)
                .replace("01/01/2016", currentDate);

        // Print the customized message
        System.out.println(messageTemplate);
    }
}
