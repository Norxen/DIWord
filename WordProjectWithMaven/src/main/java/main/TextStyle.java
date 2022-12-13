/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;

/**
 * Clase de datos para representar lo que consideramos un estilo de texto.
 * @author norxe
 */
public class TextStyle {
    
    private int fontIndex;
    private int fontSizeIndex;
    private boolean bold;
    private boolean cursive;
    private boolean underlined;
    
    private List<String> fontNames;
    private List<String> fontSizes;

    /**
     * Constructor de la clase
     * @param fontIndex
     * @param fontSizeIndex
     * @param bold
     * @param cursive
     * @param underlined
     * @param fontNames
     * @param fontSizes 
     */
    public TextStyle(int fontIndex, int fontSizeIndex, boolean bold, boolean cursive, boolean underlined, List<String> fontNames, List<String> fontSizes) {
        this.fontIndex = fontIndex;
        this.fontSizeIndex = fontSizeIndex;
        this.bold = bold;
        this.cursive = cursive;
        this.underlined = underlined;
        this.fontNames = fontNames;
        this.fontSizes = fontSizes;
    }

    public int getFontIndex() {
        return fontIndex;
    }

    public void setFontIndex(int fontIndex) {
        this.fontIndex = fontIndex;
    }

    public int getFontSizeIndex() {
        return fontSizeIndex;
    }

    public void setFontSizeIndex(int fontSizeIndex) {
        this.fontSizeIndex = fontSizeIndex;
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public boolean isCursive() {
        return cursive;
    }

    public void setCursive(boolean cursive) {
        this.cursive = cursive;
    }

    public boolean isUnderlined() {
        return underlined;
    }

    public void setUnderlined(boolean underlined) {
        this.underlined = underlined;
    }
    
    public void setFontNames(List<String> fontNames) {
        this.fontNames = fontNames;
    }
    
    public void setFontSize(List<String> fontSizes) {
        this.fontSizes = fontSizes;
    }

    @Override
    public String toString() {
        String result = "<html>";
        
        if(bold){
            result += "<b>";
        }
        if(cursive){
            result += "<i>";
        }
        if(underlined){
            result += "<u>";
        }
        result += "<p style=\"font-family:\'" + fontNames.get(fontIndex) + "\'\"> Aaaaa </p>";
        result += "<p></p>";
        result += "<p style=\"font-family:\'" + fontNames.get(fontIndex) + "\'\"> Bbbbb </p>";
        if(underlined){
            result += "</u>";
        }
        if(cursive){
            result += "</i>";
        }
        if(bold){
            result += "</b>";
        }
        
        return result + "</html>";
    }
    
}
