# CoreApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCoreConfig**](CoreApi.md#getCoreConfig) | **GET** /api/core/config | Get Core Config
[**getCoreStats**](CoreApi.md#getCoreStats) | **GET** /api/core | Get Core Stats
[**modifyCoreConfig**](CoreApi.md#modifyCoreConfig) | **PUT** /api/core/config | Modify Core Config
[**restartCore**](CoreApi.md#restartCore) | **POST** /api/core/restart | Restart Core

<a name="getCoreConfig"></a>
# **getCoreConfig**
> Object getCoreConfig()

Get Core Config

Get the current core configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

CoreApi apiInstance = new CoreApi();
try {
    Object result = apiInstance.getCoreConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#getCoreConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCoreStats"></a>
# **getCoreStats**
> CoreStats getCoreStats()

Get Core Stats

Retrieve core statistics such as version and uptime.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

CoreApi apiInstance = new CoreApi();
try {
    CoreStats result = apiInstance.getCoreStats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#getCoreStats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CoreStats**](CoreStats.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modifyCoreConfig"></a>
# **modifyCoreConfig**
> Object modifyCoreConfig(body)

Modify Core Config

Modify the core configuration and restart the core.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

CoreApi apiInstance = new CoreApi();
Object body = null; // Object | 
try {
    Object result = apiInstance.modifyCoreConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#modifyCoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |

### Return type

**Object**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restartCore"></a>
# **restartCore**
> Object restartCore()

Restart Core

Restart the core and all connected nodes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

CoreApi apiInstance = new CoreApi();
try {
    Object result = apiInstance.restartCore();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#restartCore");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

