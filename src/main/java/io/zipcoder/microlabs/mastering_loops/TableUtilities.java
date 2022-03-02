package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String MultiplicationTable = "";

        for (int i = 1; i <= tableSize; i++){
            for (int t = 1; t <= tableSize; t++){
                MultiplicationTable += String.format();
            }
            MultiplicationTable += "\n";
        }
        return MultiplicationTable;
    }
}

    }
}
