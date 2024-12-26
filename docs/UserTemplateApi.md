# UserTemplateApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserTemplate**](UserTemplateApi.md#addUserTemplate) | **POST** /api/user_template | Add User Template
[**getUserTemplateEndpoint**](UserTemplateApi.md#getUserTemplateEndpoint) | **GET** /api/user_template/{id} | Get User Template Endpoint
[**getUserTemplates**](UserTemplateApi.md#getUserTemplates) | **GET** /api/user_template | Get User Templates
[**modifyUserTemplate**](UserTemplateApi.md#modifyUserTemplate) | **PUT** /api/user_template/{id} | Modify User Template
[**removeUserTemplate**](UserTemplateApi.md#removeUserTemplate) | **DELETE** /api/user_template/{id} | Remove User Template

<a name="addUserTemplate"></a>
# **addUserTemplate**
> UserTemplateResponse addUserTemplate(body)

Add User Template

Add a new user template  - **name** can be up to 64 characters - **data_limit** must be in bytes and larger or equal to 0 - **expire_duration** must be in seconds and larger or equat to 0 - **inbounds** dictionary of protocol:inbound_tags, empty means all inbounds

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserTemplateApi apiInstance = new UserTemplateApi();
UserTemplateCreate body = new UserTemplateCreate(); // UserTemplateCreate | 
try {
    UserTemplateResponse result = apiInstance.addUserTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserTemplateApi#addUserTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserTemplateCreate**](UserTemplateCreate.md)|  |

### Return type

[**UserTemplateResponse**](UserTemplateResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserTemplateEndpoint"></a>
# **getUserTemplateEndpoint**
> UserTemplateResponse getUserTemplateEndpoint(templateId)

Get User Template Endpoint

Get User Template information with id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserTemplateApi apiInstance = new UserTemplateApi();
Integer templateId = 56; // Integer | 
try {
    UserTemplateResponse result = apiInstance.getUserTemplateEndpoint(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserTemplateApi#getUserTemplateEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Integer**|  |

### Return type

[**UserTemplateResponse**](UserTemplateResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserTemplates"></a>
# **getUserTemplates**
> List&lt;UserTemplateResponse&gt; getUserTemplates(offset, limit)

Get User Templates

Get a list of User Templates with optional pagination

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserTemplateApi apiInstance = new UserTemplateApi();
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    List<UserTemplateResponse> result = apiInstance.getUserTemplates(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserTemplateApi#getUserTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**List&lt;UserTemplateResponse&gt;**](UserTemplateResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modifyUserTemplate"></a>
# **modifyUserTemplate**
> UserTemplateResponse modifyUserTemplate(body, templateId)

Modify User Template

Modify User Template  - **name** can be up to 64 characters - **data_limit** must be in bytes and larger or equal to 0 - **expire_duration** must be in seconds and larger or equat to 0 - **inbounds** dictionary of protocol:inbound_tags, empty means all inbounds

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserTemplateApi apiInstance = new UserTemplateApi();
UserTemplateModify body = new UserTemplateModify(); // UserTemplateModify | 
Integer templateId = 56; // Integer | 
try {
    UserTemplateResponse result = apiInstance.modifyUserTemplate(body, templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserTemplateApi#modifyUserTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserTemplateModify**](UserTemplateModify.md)|  |
 **templateId** | **Integer**|  |

### Return type

[**UserTemplateResponse**](UserTemplateResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeUserTemplate"></a>
# **removeUserTemplate**
> Object removeUserTemplate(templateId)

Remove User Template

Remove a User Template by its ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserTemplateApi apiInstance = new UserTemplateApi();
Integer templateId = 56; // Integer | 
try {
    Object result = apiInstance.removeUserTemplate(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserTemplateApi#removeUserTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Integer**|  |

### Return type

**Object**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

