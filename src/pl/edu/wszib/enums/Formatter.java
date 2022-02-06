package pl.edu.wszib.enums;

public enum Formatter {
    CALM {
        public String format(String message) {
            return "Here is your message:  " + message;
        }
    },
    NERVOUSE {
        public String format(String message) {
            return "ARGH! STOP BOTHERING ME WITH YOUR MESSAGE: " + message;
        }

    };

    public abstract String format(String message);
}