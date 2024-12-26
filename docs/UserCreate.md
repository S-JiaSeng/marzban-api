# UserCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**proxies** | [**Map&lt;String, ProxySettings&gt;**](ProxySettings.md) |  |  [optional]
**expire** | **Integer** |  |  [optional]
**dataLimit** | **Integer** | data_limit can be 0 or greater |  [optional]
**dataLimitResetStrategy** | **AllOfUserCreateDataLimitResetStrategy** |  |  [optional]
**inbounds** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) |  |  [optional]
**note** | **String** |  |  [optional]
**subUpdatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**subLastUserAgent** | **String** |  |  [optional]
**onlineAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**onHoldExpireDuration** | **Integer** |  |  [optional]
**onHoldTimeout** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**autoDeleteInDays** | **Integer** |  |  [optional]
**username** | **String** |  | 
**status** | [**UserStatusCreate**](UserStatusCreate.md) |  |  [optional]
