public class str {
    public static String[] merge( String[] leftPart, String[] rightPart ) {
        int cursorLeft = 0, cursorRight = 0, counter = 0;
        String[] merged = new String[leftPart.length + rightPart.length];
        while ( cursorLeft < leftPart.length && cursorRight < rightPart.length ) {
            if (leftPart[cursorLeft].compareTo(rightPart[cursorRight] ) < 0 ) {
                merged[counter] = leftPart[cursorLeft];
                cursorLeft+=1;
            } else {
                merged[counter] = rightPart[cursorRight];
                cursorRight+=1;
            }
            counter++;
        }
        if ( cursorLeft < leftPart.length ) {
            System.arraycopy( leftPart, cursorLeft, merged, counter, merged.length - counter );
        }
        if ( cursorRight < rightPart.length ) {
            System.arraycopy( rightPart, cursorRight, merged, counter, merged.length - counter );
        }
        return merged;
    }
}