package com.example.render;

import java.util.HashMap;

public class TextStyleFactory {
    private final HashMap<String, TextStyle> hm = new HashMap<>();

    public TextStyle getTextStyle (String font, int size, boolean isBold){
        String key = font+size+isBold;
        if (hm.containsKey(key)){
            return hm.get(key);
        }else{
            TextStyle textStyle = new TextStyle(font , size, isBold);
            hm.put(key, textStyle);
            return textStyle;
        }
    }
    
}
