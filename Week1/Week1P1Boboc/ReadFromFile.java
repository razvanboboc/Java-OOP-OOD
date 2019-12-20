import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromFile {
	/*
	 * Inputs a file in said method.
	 */
    public static String[] readLinesFromTextFile(String file) throws IOException {
        /*
         * An array of strings is created, initial size 0
         */
    	String[] result = new String[0];
    	/*
    	 * Obtains byte stream from file.
    	 */
        DataInputStream inputStream = new DataInputStream(new FileInputStream(file));
        /*
         * Converts them into characters.
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String strLine = null;
        try {
            while ((strLine = bufferedReader.readLine()) != null) {
                /*
                 * While current line is not null, add said line to
                 * line array;
                 */
            	result = addLineToArray(result, strLine);
            }
        } finally {
            inputStream.close();
        }
        return result;
    }

    private static String[] addLineToArray(String[] input, String line) {
        /*
         * Makes array larger by 1.
         */
    	String[] result = new String[input.length + 1];
        /*
         * Copies from input array(current array), position 0, to result array, position 0
         * input.length = the whole length of input
         * it gets bigger with every line
         */
        System.arraycopy(input, 0, result, 0, input.length);
        /*
         * We add the last read string into the array of strings.
         */
        result[input.length] = line;
        /*
         * Returns whole array of strings.
         */
        return result;
    }
}
