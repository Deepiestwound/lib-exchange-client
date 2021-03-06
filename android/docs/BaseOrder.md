

# BaseOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clOrdId** | **String** | Reference field provided by client. Cannot exceed 20 characters, only alphanumeric characters are allowed. | 
**ordType** | [**OrdType**](OrdType.md) |  | 
**symbol** | **String** | Blockchain symbol identifier | 
**side** | [**Side**](Side.md) |  | 
**orderQty** | **Double** | The order size in the terms of the base currency | 
**timeInForce** | [**TimeInForce**](TimeInForce.md) |  |  [optional]
**price** | **Double** | The limit price for the order |  [optional]
**expireDate** | **Integer** | expiry date in the format YYYYMMDD |  [optional]
**minQty** | **Double** | The minimum quantity required for an IOC fill |  [optional]
**stopPx** | **Double** | The limit price for the order |  [optional]




