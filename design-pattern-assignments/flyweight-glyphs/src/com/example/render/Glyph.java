package com.example.render;

public class Glyph {
    // Smell: style stored per instanche → not memory efficient //class variables
    private final char ch;
    private final TextStyle textStyle;
    

    public Glyph(char ch, TextStyle textStyle) {
        this.ch = ch;
        this.textStyle = textStyle;
    }
    

    public int drawCost() { return textStyle.getSize() + (textStyle.isBold() ? 10 : 0); }
    public char getCh() { return ch; }
    public String getFont() { return textStyle.getFont(); }
    public int getSize() { return textStyle.getSize(); }
    public boolean isBold() { return textStyle.isBold(); }
}
