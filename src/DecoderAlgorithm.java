import javax.swing.JOptionPane;
public class DecoderAlgorithm {
    // Method to decode the RLE string
    public static String decode(String encodedInput) {
        if (encodedInput == null || encodedInput.isEmpty()) {
            return ""; // Handle empty or null input
        }
        StringBuilder decodedString = new StringBuilder();
        int length = encodedInput.length();
        for (int i = 0; i < length; i++) {
            char currentChar = encodedInput.charAt(i);
            // Check if the current character is a letter
            if (Character.isLetter(currentChar)) {
                int repeatCount = 0;
                // Extract the number following the letter
                while (i + 1 < length && Character.isDigit(encodedInput.charAt(i + 1))) {
                    repeatCount = repeatCount * 10 + (encodedInput.charAt(i + 1) - '0');
                    i++;
                }
                // Error handling: If no digits follow a letter, show an error dialog
                if (repeatCount == 0) {
                    JOptionPane.showMessageDialog(null, "Error: Letter '" + currentChar
                            + "' is not followed by a valid number. Skipping.", "Decoding Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                // Append the character repeatCount times
                decodedString.append(String.valueOf(currentChar).repeat(repeatCount));
            } else {
                // Error handling: If a non-letter character is encountered, show an error dialog
                JOptionPane.showMessageDialog(null, "Error: Invalid character '" + currentChar
                        + "' found at index " + i + ". Skipping.", "Decoding Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return decodedString.toString();
    }
}
