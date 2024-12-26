# DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**base**](DefaultApi.md#base) | **GET** / | Base

<a name="base"></a>
# **base**
> String base()

Base

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    String result = apiInstance.base();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#base");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

