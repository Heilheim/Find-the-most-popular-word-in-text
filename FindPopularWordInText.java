public class FindPopularWordInText {
    public static void main(String[] args) {
        String text = "hello,java-world\tjava hello: I? Hello! Java World. java hello hello";

        String newText = getWordsFromText(text);
        System.out.println(findPopularWord(newText));
    }


    private static String getWordsFromText(String text) {
        StringBuilder newText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                newText.append(text.charAt(i));
            } else {
                newText.append(" ");
            }
        }

        return newText.toString();
    }

    private static String findPopularWord(String newText) {
        String[] strArray = newText.split("\\s+");

        int[] wordRepeats = new int[strArray.length];
        int wordRepeatsCount = 0;
        for (int i = 0; i < strArray.length; i++) {
            String currentWord = strArray[i];
            for (int j = 0; j < strArray.length; j++) {
                if (currentWord.equalsIgnoreCase(strArray[j])) {
                    wordRepeatsCount++;
                }
            }
            wordRepeats[i] = wordRepeatsCount;
            wordRepeatsCount = 0;
        }

        int indexOfTheMostPopularWord = 0;
        for (int i = 0; i < wordRepeats.length; i++) {
            if (indexOfTheMostPopularWord < wordRepeats[i]) {
                indexOfTheMostPopularWord = i;
            }
        }

        return strArray[indexOfTheMostPopularWord];
    }
}

