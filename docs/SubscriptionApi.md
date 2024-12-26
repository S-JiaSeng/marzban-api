# SubscriptionApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userGetUsage**](SubscriptionApi.md#userGetUsage) | **GET** /sub/{token}/usage | User Get Usage
[**userSubscription**](SubscriptionApi.md#userSubscription) | **GET** /sub/{token}/ | User Subscription
[**userSubscriptionInfo**](SubscriptionApi.md#userSubscriptionInfo) | **GET** /sub/{token}/info | User Subscription Info
[**userSubscriptionWithClientType**](SubscriptionApi.md#userSubscriptionWithClientType) | **GET** /sub/{token}/{client_type} | User Subscription With Client Type

<a name="userGetUsage"></a>
# **userGetUsage**
> Object userGetUsage(token, start, end)

User Get Usage

Fetches the usage statistics for the user within a specified date range.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionApi;


SubscriptionApi apiInstance = new SubscriptionApi();
String token = "token_example"; // String | 
String start = ""; // String | 
String end = ""; // String | 
try {
    Object result = apiInstance.userGetUsage(token, start, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#userGetUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |
 **start** | **String**|  | [optional]
 **end** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSubscription"></a>
# **userSubscription**
> Object userSubscription(token, userAgent)

User Subscription

Provides a subscription link based on the user agent (Clash, V2Ray, etc.).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionApi;


SubscriptionApi apiInstance = new SubscriptionApi();
String token = "token_example"; // String | 
String userAgent = ""; // String | 
try {
    Object result = apiInstance.userSubscription(token, userAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#userSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |
 **userAgent** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSubscriptionInfo"></a>
# **userSubscriptionInfo**
> SubscriptionUserResponse userSubscriptionInfo(token)

User Subscription Info

Retrieves detailed information about the user&#x27;s subscription.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionApi;


SubscriptionApi apiInstance = new SubscriptionApi();
String token = "token_example"; // String | 
try {
    SubscriptionUserResponse result = apiInstance.userSubscriptionInfo(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#userSubscriptionInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**SubscriptionUserResponse**](SubscriptionUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSubscriptionWithClientType"></a>
# **userSubscriptionWithClientType**
> Object userSubscriptionWithClientType(clientType, token, userAgent)

User Subscription With Client Type

Provides a subscription link based on the specified client type (e.g., Clash, V2Ray).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionApi;


SubscriptionApi apiInstance = new SubscriptionApi();
String clientType = "clientType_example"; // String | 
String token = "token_example"; // String | 
String userAgent = ""; // String | 
try {
    Object result = apiInstance.userSubscriptionWithClientType(clientType, token, userAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#userSubscriptionWithClientType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientType** | **String**|  |
 **token** | **String**|  |
 **userAgent** | **String**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

