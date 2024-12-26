# AdminApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminToken**](AdminApi.md#adminToken) | **POST** /api/admin/token | Admin Token
[**createAdmin**](AdminApi.md#createAdmin) | **POST** /api/admin | Create Admin
[**getAdmins**](AdminApi.md#getAdmins) | **GET** /api/admins | Get Admins
[**getCurrentAdmin**](AdminApi.md#getCurrentAdmin) | **GET** /api/admin | Get Current Admin
[**modifyAdmin**](AdminApi.md#modifyAdmin) | **PUT** /api/admin/{username} | Modify Admin
[**removeAdmin**](AdminApi.md#removeAdmin) | **DELETE** /api/admin/{username} | Remove Admin

<a name="adminToken"></a>
# **adminToken**
> Token adminToken(grantType, username, password, scope, clientId, clientSecret)

Admin Token

Authenticate an admin and issue a token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String grantType = "grantType_example"; // String | 
String username = "username_example"; // String | 
String password = "password_example"; // String | 
String scope = "scope_example"; // String | 
String clientId = "clientId_example"; // String | 
String clientSecret = "clientSecret_example"; // String | 
try {
    Token result = apiInstance.adminToken(grantType, username, password, scope, clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**|  |
 **username** | **String**|  |
 **password** | **String**|  |
 **scope** | **String**|  |
 **clientId** | **String**|  |
 **clientSecret** | **String**|  |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="createAdmin"></a>
# **createAdmin**
> Admin createAdmin(body)

Create Admin

Create a new admin if the current admin has sudo privileges.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

AdminApi apiInstance = new AdminApi();
AdminCreate body = new AdminCreate(); // AdminCreate | 
try {
    Admin result = apiInstance.createAdmin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#createAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminCreate**](AdminCreate.md)|  |

### Return type

[**Admin**](Admin.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAdmins"></a>
# **getAdmins**
> List&lt;Admin&gt; getAdmins(offset, limit, username)

Get Admins

Fetch a list of admins with optional filters for pagination and username.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

AdminApi apiInstance = new AdminApi();
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | 
String username = "username_example"; // String | 
try {
    List<Admin> result = apiInstance.getAdmins(offset, limit, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getAdmins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **username** | **String**|  | [optional]

### Return type

[**List&lt;Admin&gt;**](Admin.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrentAdmin"></a>
# **getCurrentAdmin**
> Admin getCurrentAdmin()

Get Current Admin

Retrieve the current authenticated admin.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

AdminApi apiInstance = new AdminApi();
try {
    Admin result = apiInstance.getCurrentAdmin();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getCurrentAdmin");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Admin**](Admin.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modifyAdmin"></a>
# **modifyAdmin**
> Admin modifyAdmin(body, username)

Modify Admin

Modify an existing admin&#x27;s details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

AdminApi apiInstance = new AdminApi();
AdminModify body = new AdminModify(); // AdminModify | 
String username = "username_example"; // String | 
try {
    Admin result = apiInstance.modifyAdmin(body, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#modifyAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminModify**](AdminModify.md)|  |
 **username** | **String**|  |

### Return type

[**Admin**](Admin.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeAdmin"></a>
# **removeAdmin**
> Object removeAdmin(username)

Remove Admin

Remove an admin from the database.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

AdminApi apiInstance = new AdminApi();
String username = "username_example"; // String | 
try {
    Object result = apiInstance.removeAdmin(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#removeAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |

### Return type

**Object**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

