package com.codewithrat;

public enum AnsiE {
    // Reset
    RESET("\033[0m"),

    // Standard Text Colors
    BLACK("\033[0;30m"),
    RED("\033[0;31m"),
    GREEN("\033[0;32m"),
    YELLOW("\033[0;33m"),
    BLUE("\033[0;34m"),
    PURPLE("\033[0;35m"),
    CYAN("\033[0;36m"),
    WHITE("\033[0;37m"),

    // Bold / High-Intensity Text Colors
    BOLD_BLACK("\033[1;30m"),
    BOLD_RED("\033[1;31m"),
    BOLD_GREEN("\033[1;32m"),
    BOLD_YELLOW("\033[1;33m"),
    BOLD_BLUE("\033[1;34m"),
    BOLD_PURPLE("\033[1;35m"),
    BOLD_CYAN("\033[1;36m"),
    BOLD_WHITE("\033[1;37m"),

    // Background Colors
    BG_BLACK("\033[40m"),
    BG_RED("\033[41m"),
    BG_GREEN("\033[42m"),
    BG_YELLOW("\033[43m"),
    BG_BLUE("\033[44m"),
    BG_PURPLE("\033[45m"),
    BG_CYAN("\033[46m"),
    BG_WHITE("\033[47m"),

    // Text Formatting Styles
    BOLD("\033[1m"),
    DIM("\033[2m"),
    ITALIC("\033[3m"),
    UNDERLINE("\033[4m"),
    BLINK("\033[5m"),
    REVERSE("\033[7m"),
    STRIKETHROUGH("\033[9m");

    private final String code;

    AnsiE(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code;
    }
}
