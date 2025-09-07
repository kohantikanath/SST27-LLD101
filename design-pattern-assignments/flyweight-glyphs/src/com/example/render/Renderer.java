package com.example.render;

public class Renderer {
    private final TextStyleFactory textStyleFactory = new TextStyleFactory();
    public int render(String text) {
        int cost = 0;
        for (char c : text.toCharArray()) {
            TextStyle textStyle = textStyleFactory.getTextStyle("arial", 14, false);
            Glyph g = new Glyph(c, textStyle); // TODO: refactor with TextStyle flyweights
            cost += g.drawCost();
        }
        return cost;
    }
}
