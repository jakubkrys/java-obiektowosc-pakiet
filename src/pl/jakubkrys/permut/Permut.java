package pl.jakubkrys.permut;

public class Permut {

    static void printPermut(String[] strTab, String beginningOfPermutation) {

        if (strTab.length == 0) {
            System.out.print(beginningOfPermutation + "\n");
            return;
        }

        for (int i = 0; i < strTab.length; i++) {

            String tmp = strTab[0];
            strTab[0] = strTab[i];
            strTab[i] = tmp;

            String word = strTab[0];
            String[] restOfString = new String[strTab.length-1];

            for (int j = 1; j < strTab.length; j++) {
                restOfString[j-1] = strTab[j];
            }

            printPermut(restOfString, beginningOfPermutation  +" " +word);
        }
    }

    public static void main(String[] args)
    {
        String[] strArr = {"Ala","Ma", "Czarnego", "Kota","Bonifacego"};
        printPermut(strArr, "");
    }
}