# SubscriptionUserResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**proxies** | **Object** |  | 
**expire** | **Integer** |  |  [optional]
**dataLimit** | **Integer** | data_limit can be 0 or greater |  [optional]
**dataLimitResetStrategy** | **AllOfSubscriptionUserResponseDataLimitResetStrategy** |  |  [optional]
**inbounds** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) |  |  [optional]
**note** | **String** |  |  [optional]
**subUpdatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**subLastUserAgent** | **String** |  |  [optional]
**onlineAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**onHoldExpireDuration** | **Integer** |  |  [optional]
**onHoldTimeout** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**autoDeleteInDays** | **Integer** |  |  [optional]
**username** | **String** |  | 
**status** | [**UserStatus**](UserStatus.md) |  | 
**usedTraffic** | **Integer** |  | 
**lifetimeUsedTraffic** | **Integer** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**links** | **List&lt;String&gt;** |  |  [optional]
**subscriptionUrl** | **String** |  |  [optional]
**excludedInbounds** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) |  |  [optional]
**admin** | [**Admin**](Admin.md) |  |  [optional]
