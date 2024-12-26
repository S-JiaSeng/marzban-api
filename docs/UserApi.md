# UserApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUser**](UserApi.md#addUser) | **POST** /api/user | Add User
[**deleteExpiredUsers**](UserApi.md#deleteExpiredUsers) | **DELETE** /api/users/expired | Delete Expired Users
[**getExpiredUsers**](UserApi.md#getExpiredUsers) | **GET** /api/users/expired | Get Expired Users
[**getUser**](UserApi.md#getUser) | **GET** /api/user/{username} | Get User
[**getUserUsage**](UserApi.md#getUserUsage) | **GET** /api/user/{username}/usage | Get User Usage
[**getUsers**](UserApi.md#getUsers) | **GET** /api/users | Get Users
[**getUsersUsage**](UserApi.md#getUsersUsage) | **GET** /api/users/usage | Get Users Usage
[**modifyUser**](UserApi.md#modifyUser) | **PUT** /api/user/{username} | Modify User
[**removeUser**](UserApi.md#removeUser) | **DELETE** /api/user/{username} | Remove User
[**resetUserDataUsage**](UserApi.md#resetUserDataUsage) | **POST** /api/user/{username}/reset | Reset User Data Usage
[**resetUsersDataUsage**](UserApi.md#resetUsersDataUsage) | **POST** /api/users/reset | Reset Users Data Usage
[**revokeUserSubscription**](UserApi.md#revokeUserSubscription) | **POST** /api/user/{username}/revoke_sub | Revoke User Subscription
[**setOwner**](UserApi.md#setOwner) | **PUT** /api/user/{username}/set-owner | Set Owner

<a name="addUser"></a>
# **addUser**
> UserResponse addUser(body)

Add User

Add a new user  - **username**: 3 to 32 characters, can include a-z, 0-9, and underscores. - **status**: User&#x27;s status, defaults to &#x60;active&#x60;. Special rules if &#x60;on_hold&#x60;. - **expire**: UTC timestamp for account expiration. Use &#x60;0&#x60; for unlimited. - **data_limit**: Max data usage in bytes (e.g., &#x60;1073741824&#x60; for 1GB). &#x60;0&#x60; means unlimited. - **data_limit_reset_strategy**: Defines how/if data limit resets. &#x60;no_reset&#x60; means it never resets. - **proxies**: Dictionary of protocol settings (e.g., &#x60;vmess&#x60;, &#x60;vless&#x60;). - **inbounds**: Dictionary of protocol tags to specify inbound connections. - **note**: Optional text field for additional user information or notes. - **on_hold_timeout**: UTC timestamp when &#x60;on_hold&#x60; status should start or end. - **on_hold_expire_duration**: Duration (in seconds) for how long the user should stay in &#x60;on_hold&#x60; status.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
UserCreate body = new UserCreate(); // UserCreate | 
try {
    UserResponse result = apiInstance.addUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserCreate**](UserCreate.md)|  |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteExpiredUsers"></a>
# **deleteExpiredUsers**
> List&lt;String&gt; deleteExpiredUsers(expiredAfter, expiredBefore)

Delete Expired Users

Delete users who have expired within the specified date range.  - **expired_after** UTC datetime (optional) - **expired_before** UTC datetime (optional) - At least one of expired_after or expired_before must be provided

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
OffsetDateTime expiredAfter = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime expiredBefore = new OffsetDateTime(); // OffsetDateTime | 
try {
    List<String> result = apiInstance.deleteExpiredUsers(expiredAfter, expiredBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteExpiredUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expiredAfter** | **OffsetDateTime**|  | [optional]
 **expiredBefore** | **OffsetDateTime**|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExpiredUsers"></a>
# **getExpiredUsers**
> List&lt;String&gt; getExpiredUsers(expiredAfter, expiredBefore)

Get Expired Users

Get users who have expired within the specified date range.  - **expired_after** UTC datetime (optional) - **expired_before** UTC datetime (optional) - At least one of expired_after or expired_before must be provided for filtering - If both are omitted, returns all expired users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
OffsetDateTime expiredAfter = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime expiredBefore = new OffsetDateTime(); // OffsetDateTime | 
try {
    List<String> result = apiInstance.getExpiredUsers(expiredAfter, expiredBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getExpiredUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expiredAfter** | **OffsetDateTime**|  | [optional]
 **expiredBefore** | **OffsetDateTime**|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserResponse getUser(username)

Get User

Get user information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 
try {
    UserResponse result = apiInstance.getUser(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserUsage"></a>
# **getUserUsage**
> UserUsagesResponse getUserUsage(username, start, end)

Get User Usage

Get users usage

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 
String start = ""; // String | 
String end = ""; // String | 
try {
    UserUsagesResponse result = apiInstance.getUserUsage(username, start, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **start** | **String**|  | [optional]
 **end** | **String**|  | [optional]

### Return type

[**UserUsagesResponse**](UserUsagesResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> UsersResponse getUsers(offset, limit, username, search, admin, status, sort)

Get Users

Get all users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | 
List<String> username = Arrays.asList("username_example"); // List<String> | 
String search = "search_example"; // String | 
List<String> admin = Arrays.asList("admin_example"); // List<String> | 
UserStatus status = new UserStatus(); // UserStatus | 
String sort = "sort_example"; // String | 
try {
    UsersResponse result = apiInstance.getUsers(offset, limit, username, search, admin, status, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **username** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **search** | **String**|  | [optional]
 **admin** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **status** | [**UserStatus**](.md)|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersUsage"></a>
# **getUsersUsage**
> UsersUsagesResponse getUsersUsage(start, end, admin)

Get Users Usage

Get all users usage

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String start = ""; // String | 
String end = ""; // String | 
List<String> admin = Arrays.asList("admin_example"); // List<String> | 
try {
    UsersUsagesResponse result = apiInstance.getUsersUsage(start, end, admin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUsersUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **String**|  | [optional]
 **end** | **String**|  | [optional]
 **admin** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**UsersUsagesResponse**](UsersUsagesResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modifyUser"></a>
# **modifyUser**
> UserResponse modifyUser(body, username)

Modify User

Modify an existing user  - **username**: Cannot be changed. Used to identify the user. - **status**: User&#x27;s new status. Can be &#x27;active&#x27;, &#x27;disabled&#x27;, &#x27;on_hold&#x27;, &#x27;limited&#x27;, or &#x27;expired&#x27;. - **expire**: UTC timestamp for new account expiration. Set to &#x60;0&#x60; for unlimited, &#x60;null&#x60; for no change. - **data_limit**: New max data usage in bytes (e.g., &#x60;1073741824&#x60; for 1GB). Set to &#x60;0&#x60; for unlimited, &#x60;null&#x60; for no change. - **data_limit_reset_strategy**: New strategy for data limit reset. Options include &#x27;daily&#x27;, &#x27;weekly&#x27;, &#x27;monthly&#x27;, or &#x27;no_reset&#x27;. - **proxies**: Dictionary of new protocol settings (e.g., &#x60;vmess&#x60;, &#x60;vless&#x60;). Empty dictionary means no change. - **inbounds**: Dictionary of new protocol tags to specify inbound connections. Empty dictionary means no change. - **note**: New optional text for additional user information or notes. &#x60;null&#x60; means no change. - **on_hold_timeout**: New UTC timestamp for when &#x60;on_hold&#x60; status should start or end. Only applicable if status is changed to &#x27;on_hold&#x27;. - **on_hold_expire_duration**: New duration (in seconds) for how long the user should stay in &#x60;on_hold&#x60; status. Only applicable if status is changed to &#x27;on_hold&#x27;.  Note: Fields set to &#x60;null&#x60; or omitted will not be modified.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
UserModify body = new UserModify(); // UserModify | 
String username = "username_example"; // String | 
try {
    UserResponse result = apiInstance.modifyUser(body, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#modifyUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserModify**](UserModify.md)|  |
 **username** | **String**|  |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeUser"></a>
# **removeUser**
> Object removeUser(username)

Remove User

Remove a user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 
try {
    Object result = apiInstance.removeUser(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#removeUser");
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

<a name="resetUserDataUsage"></a>
# **resetUserDataUsage**
> UserResponse resetUserDataUsage(username)

Reset User Data Usage

Reset user data usage

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 
try {
    UserResponse result = apiInstance.resetUserDataUsage(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#resetUserDataUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetUsersDataUsage"></a>
# **resetUsersDataUsage**
> Object resetUsersDataUsage()

Reset Users Data Usage

Reset all users data usage

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
try {
    Object result = apiInstance.resetUsersDataUsage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#resetUsersDataUsage");
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

<a name="revokeUserSubscription"></a>
# **revokeUserSubscription**
> UserResponse revokeUserSubscription(username)

Revoke User Subscription

Revoke users subscription (Subscription link and proxies)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 
try {
    UserResponse result = apiInstance.revokeUserSubscription(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#revokeUserSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setOwner"></a>
# **setOwner**
> UserResponse setOwner(username, adminUsername)

Set Owner

Set a new owner (admin) for a user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 
String adminUsername = "adminUsername_example"; // String | 
try {
    UserResponse result = apiInstance.setOwner(username, adminUsername);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#setOwner");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **adminUsername** | **String**|  |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

