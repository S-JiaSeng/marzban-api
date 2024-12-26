# SystemApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHosts**](SystemApi.md#getHosts) | **GET** /api/hosts | Get Hosts
[**getInbounds**](SystemApi.md#getInbounds) | **GET** /api/inbounds | Get Inbounds
[**getSystemStats**](SystemApi.md#getSystemStats) | **GET** /api/system | Get System Stats
[**modifyHosts**](SystemApi.md#modifyHosts) | **PUT** /api/hosts | Modify Hosts

<a name="getHosts"></a>
# **getHosts**
> Map&lt;String, List&lt;ProxyHost&gt;&gt; getHosts()

Get Hosts

Get a list of proxy hosts grouped by inbound tag.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

SystemApi apiInstance = new SystemApi();
try {
    Map<String, List<ProxyHost>> result = apiInstance.getHosts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#getHosts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, List&lt;ProxyHost&gt;&gt;**](List.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInbounds"></a>
# **getInbounds**
> Map&lt;String, List&lt;ProxyInbound&gt;&gt; getInbounds()

Get Inbounds

Retrieve inbound configurations grouped by protocol.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

SystemApi apiInstance = new SystemApi();
try {
    Map<String, List<ProxyInbound>> result = apiInstance.getInbounds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#getInbounds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, List&lt;ProxyInbound&gt;&gt;**](List.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSystemStats"></a>
# **getSystemStats**
> SystemStats getSystemStats()

Get System Stats

Fetch system stats including memory, CPU, and user metrics.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

SystemApi apiInstance = new SystemApi();
try {
    SystemStats result = apiInstance.getSystemStats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#getSystemStats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemStats**](SystemStats.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modifyHosts"></a>
# **modifyHosts**
> Map&lt;String, List&lt;ProxyHost&gt;&gt; modifyHosts(body)

Modify Hosts

Modify proxy hosts and update the configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

SystemApi apiInstance = new SystemApi();
Map<String, List<ProxyHost>> body = new Map(); // Map<String, List<ProxyHost>> | 
try {
    Map<String, List<ProxyHost>> result = apiInstance.modifyHosts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#modifyHosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, List&lt;ProxyHost&gt;&gt;**](Map.md)|  |

### Return type

[**Map&lt;String, List&lt;ProxyHost&gt;&gt;**](List.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

