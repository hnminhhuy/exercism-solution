public class LogLevels {
   
    public static String message(String logLine) {
        int colon = logLine.indexOf(':');

        return logLine.substring(colon + 1).trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf('[');
        int end = logLine.indexOf(']');

        return logLine.substring(start + 1, end).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
