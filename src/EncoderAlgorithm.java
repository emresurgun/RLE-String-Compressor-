public class EncoderAlgorithm {
    public static String compress(String input) {

        //detecting if input is empty and returns empty String
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        // Traverse the string
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {

                compressed.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        // Append the last character and its count
        compressed.append(input.charAt(input.length() - 1)).append(count);
        // Return the compressed string
        return compressed.toString();
    }
}

