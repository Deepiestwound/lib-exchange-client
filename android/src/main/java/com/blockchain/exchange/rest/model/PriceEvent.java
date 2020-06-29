/**
 * Blockchain.com Exchange REST API
 * ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account Select API from the drop down menu Fill out form and click “Create New API Key Now” Once generated you can view your keys under API Settings 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.blockchain.exchange.rest.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PriceEvent {
  
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("price_24h")
  private Double price24h = null;
  @SerializedName("volume_24h")
  private Double volume24h = null;
  @SerializedName("last_trade_price")
  private Double lastTradePrice = null;

  /**
   * Blockchain symbol identifier
   **/
  @ApiModelProperty(value = "Blockchain symbol identifier")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPrice24h() {
    return price24h;
  }
  public void setPrice24h(Double price24h) {
    this.price24h = price24h;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getVolume24h() {
    return volume24h;
  }
  public void setVolume24h(Double volume24h) {
    this.volume24h = volume24h;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLastTradePrice() {
    return lastTradePrice;
  }
  public void setLastTradePrice(Double lastTradePrice) {
    this.lastTradePrice = lastTradePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceEvent priceEvent = (PriceEvent) o;
    return (this.symbol == null ? priceEvent.symbol == null : this.symbol.equals(priceEvent.symbol)) &&
        (this.price24h == null ? priceEvent.price24h == null : this.price24h.equals(priceEvent.price24h)) &&
        (this.volume24h == null ? priceEvent.volume24h == null : this.volume24h.equals(priceEvent.volume24h)) &&
        (this.lastTradePrice == null ? priceEvent.lastTradePrice == null : this.lastTradePrice.equals(priceEvent.lastTradePrice));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.price24h == null ? 0: this.price24h.hashCode());
    result = 31 * result + (this.volume24h == null ? 0: this.volume24h.hashCode());
    result = 31 * result + (this.lastTradePrice == null ? 0: this.lastTradePrice.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceEvent {\n");
    
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  price24h: ").append(price24h).append("\n");
    sb.append("  volume24h: ").append(volume24h).append("\n");
    sb.append("  lastTradePrice: ").append(lastTradePrice).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}