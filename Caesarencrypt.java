import javax.swing.JOptionPane;

public class Caesarencrypt {

    public static String encryptMessage(String message, int shift) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char shifted = (char) ((character - base + shift) % 26 + base);
                encryptedMessage.append(shifted);
            } else {
                encryptedMessage.append(character);
            }
        }
        return encryptedMessage.toString();
    }

    public static void main(String[] args) {
        // Display a welcome message using JOptionPane
        JOptionPane.showMessageDialog(null, "Welcome to the Caesar Message Encryption Program!", "Caesar message encryptor",
        JOptionPane.INFORMATION_MESSAGE);

        // Initial user prompt
        int initialUserChoice = JOptionPane.showConfirmDialog(null, "Do you want to run this encryption program?",
        "User Prompt", JOptionPane.YES_NO_CANCEL_OPTION);

        if (initialUserChoice == JOptionPane.NO_OPTION || initialUserChoice == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Thank you for using the Caesar message encryptor. Goodbye!",
            "Exit Message", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {
            // Confirmation of initial user choice
            int proceedConfirmation = JOptionPane.showConfirmDialog(null, 
            "Are you sure you want to proceed with the encryption?","User Confirmation", JOptionPane.YES_NO_OPTION);

            if (proceedConfirmation == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Thank you for using the Caesar message encryptor. Goodbye!",
                "Exit Message", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                boolean continueEncryption = true;
                while (continueEncryption) {
                    String userMessage = JOptionPane.showInputDialog("Please enter the message you want to encrypt: ");
                    //If user enters nothing or cancels
                    if (userMessage == null) {
                        continueEncryption = false; // Exit the loop
                        continue; // Skip to the loop condition check
                    }
                    int userShift;
                    try {
                        String shiftInput = JOptionPane.showInputDialog("Please enter the shift number (0-25): ");
                        
                         //If user enters nothing or cancels
                        if (shiftInput == null) {
                            continueEncryption = false; // Exit the loop
                            continue; // Skip to the loop condition check
                        }
                        userShift = Integer.parseInt(shiftInput);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid shift number entered. Please enter a number.", "Error Message",
                        JOptionPane.ERROR_MESSAGE);
                        continue; // Ask for message and shift again
                    }

                    if (userShift >= 0 && userShift <= 25) {
                        String encryptedMessage = encryptMessage(userMessage, userShift);
                        JOptionPane.showMessageDialog(null, "Your encrypted message is: " + encryptedMessage, "Encrypted Message",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid shift number between 0-25", "Error Message",
                                JOptionPane.WARNING_MESSAGE);
                        continue; // Ask for message and shift again
                    }

                    // Ask if the user wants to encrypt another message
                    int encryptAgain = JOptionPane.showConfirmDialog(null, "Do you want to encrypt another message?",
                            "Continue Encryption?", JOptionPane.YES_NO_OPTION);

                    if (encryptAgain == JOptionPane.NO_OPTION) {
                        continueEncryption = false; // Set flag to exit the loop
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Thank you for using the Caesar message encryptor. Goodbye!",
        "Exit Message", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}