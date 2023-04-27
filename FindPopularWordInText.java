public class FindPopularWordInText {
    public static void main(String[] args) {
        String text = "hello java world java hello I Hello Java World java";
        System.out.println(findPopularWord(text));
    }

        private static String findPopularWord(String text) {
            String[] strArray = text.split(" ");

            int[] wordRepeats = new int[strArray.length];
            int wordRepeatsCount = 0;
            for (int i = 0; i < strArray.length; i++) {
                String currentWord = strArray[i];
                for (int j = 0; j < strArray.length; j++) {
                    if (currentWord.equalsIgnoreCase(strArray[j])){
                        wordRepeatsCount++;
                    }
                }
                wordRepeats[i] = wordRepeatsCount;
                wordRepeatsCount = 0;
            }

            int indexOfTheMostPopularWord = 0;
            for (int i = 0; i < wordRepeats.length; i++) {
                if (indexOfTheMostPopularWord < wordRepeats[i]){
                    indexOfTheMostPopularWord = i;
                }
            }

            return strArray[indexOfTheMostPopularWord];
        }
    }

