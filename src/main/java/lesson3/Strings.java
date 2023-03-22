package lesson3;


public class Strings {
    private int arrayLength;
    private String[] strings = new String[arrayLength];

    public Strings(int length, String[] strings) {
        if (length < 0) {
//            throw new IllegalArgumentException("length can't be negative");
            this.arrayLength = -1;
            String[] tempArray = {"empty array, can't be topped up"};
            this.strings = tempArray;
            System.out.println(("exception: length can't be negative"));
        }
        else {
            this.arrayLength = length;
            quickSort(strings, 0, this.arrayLength - 1);
            this.strings = strings;
        }
    }

    public int getLenght() {
        return arrayLength;
    }
    public String[] getStrings() {
        return strings;
    }

    public void addElement (String addedElement) {
        if (arrayLength != -1) {
            arrayLength++;
            String[] newStrings = new String[arrayLength];
            for (int i = 0; i < arrayLength - 1; i++) {
                newStrings[i] = strings[i];
            }
            newStrings[newStrings.length - 1] = addedElement;
            quickSort(newStrings, 0, arrayLength - 1);
            // можно было обойтись циклом, но раз уж функция написана
            strings = newStrings;
        }
    }

    public String maxElementFind () {
        if (arrayLength != -1) {
            return strings[arrayLength - 1];
        }
        else return "-1.0";
    }

    public float averageElementLength () {
        if (arrayLength != -1) {
            float averageLength = 0;
            for (String element : strings) {
                averageLength += element.length();
            }
//        float answer = Math.round((averageLength / arrayLength) * 100.0) / 100.0;
            return averageLength / arrayLength;
        }
        else return (arrayLength);
    }

    public void quickSort(String[] strings, int low, int high) {
        if (strings.length <= 1 || low >= high) {
            return;
        }

        int referencePointLenght = strings[low].length();
        int i = low, j = high;

        while (i <= j) {
            while (strings[i].length() < referencePointLenght) {
                i++;
            }
            while (strings[j].length() > referencePointLenght) {
                j--;
            }
            if (i <= j) {
                String temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(strings, low, j);
        }
        if (high > i) {
            quickSort(strings, i, high);
        }
    }
}
