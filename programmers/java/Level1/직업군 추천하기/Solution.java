class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
            String resultName = "";
        int resultScore = 0;

        for (int i = 0; i < table.length; i++) {
            String[] temp = table[i].split(" ");

            int cnp = 0;
            for (int j = 0; j < languages.length; j++) {
                int score = 5;
                for (int k = 1; k < temp.length; k++) {
                    if (temp[k].equals(languages[j])) {
                        cnp += (score) * preference[j];
                        break;
                    }
                    score--;
                }
            }

            if (resultScore < cnp) {
                resultScore = cnp;
                resultName = temp[0];
            }

            if (resultScore == cnp) {
                int rtn = resultName.compareTo(temp[0]);

                if (rtn > 0) {
                    resultScore = cnp;
                    resultName = temp[0];
                }
            }


        }
        return resultName;
    }
}
