/**
 *
 * Copyright (c) 2021 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


package com.aspose.asposecloudpdf.model;

import java.util.Objects;
import com.aspose.asposecloudpdf.model.Color;
import com.aspose.asposecloudpdf.model.FontStyles;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a text state of a text
 */
@ApiModel(description = "Represents a text state of a text")

public class TextState {
  @SerializedName("FontSize")
  private Double fontSize = null;

  @SerializedName("Font")
  private String font = null;

  @SerializedName("ForegroundColor")
  private Color foregroundColor = null;

  @SerializedName("BackgroundColor")
  private Color backgroundColor = null;

  @SerializedName("FontStyle")
  private FontStyles fontStyle = null;

  @SerializedName("FontFile")
  private String fontFile = null;

  public TextState fontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Gets or sets font size of the text.
   * @return fontSize
  **/
  @ApiModelProperty(required = true, value = "Gets or sets font size of the text.")
  public Double getFontSize() {
    return fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public TextState font(String font) {
    this.font = font;
    return this;
  }

   /**
   * Gets or sets font name of the text.
   * @return font
  **/
  @ApiModelProperty(value = "Gets or sets font name of the text.")
  public String getFont() {
    return font;
  }

  public void setFont(String font) {
    this.font = font;
  }

  public TextState foregroundColor(Color foregroundColor) {
    this.foregroundColor = foregroundColor;
    return this;
  }

   /**
   * Gets or sets foreground color of the text.
   * @return foregroundColor
  **/
  @ApiModelProperty(value = "Gets or sets foreground color of the text.")
  public Color getForegroundColor() {
    return foregroundColor;
  }

  public void setForegroundColor(Color foregroundColor) {
    this.foregroundColor = foregroundColor;
  }

  public TextState backgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Sets background color of the text.
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "Sets background color of the text.")
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public TextState fontStyle(FontStyles fontStyle) {
    this.fontStyle = fontStyle;
    return this;
  }

   /**
   * Sets font style of the text.
   * @return fontStyle
  **/
  @ApiModelProperty(required = true, value = "Sets font style of the text.")
  public FontStyles getFontStyle() {
    return fontStyle;
  }

  public void setFontStyle(FontStyles fontStyle) {
    this.fontStyle = fontStyle;
  }

  public TextState fontFile(String fontFile) {
    this.fontFile = fontFile;
    return this;
  }

   /**
   * Sets path of font file in storage.
   * @return fontFile
  **/
  @ApiModelProperty(value = "Sets path of font file in storage.")
  public String getFontFile() {
    return fontFile;
  }

  public void setFontFile(String fontFile) {
    this.fontFile = fontFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextState textState = (TextState) o;
    return Objects.equals(this.fontSize, textState.fontSize) &&
        Objects.equals(this.font, textState.font) &&
        Objects.equals(this.foregroundColor, textState.foregroundColor) &&
        Objects.equals(this.backgroundColor, textState.backgroundColor) &&
        Objects.equals(this.fontStyle, textState.fontStyle) &&
        Objects.equals(this.fontFile, textState.fontFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontSize, font, foregroundColor, backgroundColor, fontStyle, fontFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextState {\n");
    
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
    sb.append("    fontFile: ").append(toIndentedString(fontFile)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

