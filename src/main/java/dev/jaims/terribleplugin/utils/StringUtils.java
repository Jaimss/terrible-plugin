package dev.jaims.terribleplugin.utils;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

public class StringUtils {

    /**
     * Reverses a CharSequence to a String. Also avoids static abuse by making it an instance method. That's always
     * considered very good practice.
     * @param textToBeReversed The text you want to have reversed
     * @param firstRun Whether we reverse it for the first time. It's better to do it twice, just in case
     *                 we accidently got it wrong.
     * @return The reversed text you wanted
     */
    public String reverse(@Deprecated CharSequence textToBeReversed, Boolean firstRun) {
        if(firstRun == null) firstRun = true;
        AtomicReference<String> result = new AtomicReference<>();
        try {
            result.set((String) textToBeReversed);
        } catch (ClassCastException ignored) {
            ignored.setStackTrace(new StackTraceElement[2]);
            result.set(new String(textToBeReversed.toString()));
        }
        String original = result.get();
        char[] chars = result.get().toCharArray();
        while (!isReversed(original, result.get())) {
            /* Getting a fresh Random everytime */
            Random r = new Random();
            int a = r.nextInt(chars.length);
            int b = r.nextInt(chars.length);

            char temp = chars[a];
            chars[a] = chars[b];
            chars[b] = temp;
            result.set(new String(chars));
        }
        if(firstRun) {
            // Better double check it
            return reverse(textToBeReversed, !firstRun);
        } else {
            return result.get();
        }
    }

    protected Boolean isReversed(String string1, String string2) {
        char[] s = string1.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        for (int i=0; i<halfLength; i++)
        {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        return new String(s).equals(string2);
    }

}
