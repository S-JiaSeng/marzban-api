# NodeApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNode**](NodeApi.md#addNode) | **POST** /api/node | Add Node
[**getNode**](NodeApi.md#getNode) | **GET** /api/node/{node_id} | Get Node
[**getNodeSettings**](NodeApi.md#getNodeSettings) | **GET** /api/node/settings | Get Node Settings
[**getNodes**](NodeApi.md#getNodes) | **GET** /api/nodes | Get Nodes
[**getUsage**](NodeApi.md#getUsage) | **GET** /api/nodes/usage | Get Usage
[**modifyNode**](NodeApi.md#modifyNode) | **PUT** /api/node/{node_id} | Modify Node
[**reconnectNode**](NodeApi.md#reconnectNode) | **POST** /api/node/{node_id}/reconnect | Reconnect Node
[**removeNode**](NodeApi.md#removeNode) | **DELETE** /api/node/{node_id} | Remove Node

<a name="addNode"></a>
# **addNode**
> NodeResponse addNode(body)

Add Node

Add a new node to the database and optionally add it as a host.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

NodeApi apiInstance = new NodeApi();
NodeCreate body = new NodeCreate(); // NodeCreate | 
try {
    NodeResponse result = apiInstance.addNode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#addNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeCreate**](NodeCreate.md)|  |

### Return type

[**NodeResponse**](NodeResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNode"></a>
# **getNode**
> NodeResponse getNode(nodeId)

Get Node

Retrieve details of a specific node by its ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

NodeApi apiInstance = new NodeApi();
Integer nodeId = 56; // Integer | 
try {
    NodeResponse result = apiInstance.getNode(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **Integer**|  |

### Return type

[**NodeResponse**](NodeResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNodeSettings"></a>
# **getNodeSettings**
> NodeSettings getNodeSettings()

Get Node Settings

Retrieve the current node settings, including TLS certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

NodeApi apiInstance = new NodeApi();
try {
    NodeSettings result = apiInstance.getNodeSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getNodeSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeSettings**](NodeSettings.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNodes"></a>
# **getNodes**
> List&lt;NodeResponse&gt; getNodes()

Get Nodes

Retrieve a list of all nodes. Accessible only to sudo admins.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

NodeApi apiInstance = new NodeApi();
try {
    List<NodeResponse> result = apiInstance.getNodes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getNodes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;NodeResponse&gt;**](NodeResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsage"></a>
# **getUsage**
> NodesUsageResponse getUsage(start, end)

Get Usage

Retrieve usage statistics for nodes within a specified date range.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

NodeApi apiInstance = new NodeApi();
String start = ""; // String | 
String end = ""; // String | 
try {
    NodesUsageResponse result = apiInstance.getUsage(start, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#getUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **String**|  | [optional]
 **end** | **String**|  | [optional]

### Return type

[**NodesUsageResponse**](NodesUsageResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modifyNode"></a>
# **modifyNode**
> NodeResponse modifyNode(body, nodeId)

Modify Node

Update a node&#x27;s details. Only accessible to sudo admins.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

NodeApi apiInstance = new NodeApi();
NodeModify body = new NodeModify(); // NodeModify | 
Integer nodeId = 56; // Integer | 
try {
    NodeResponse result = apiInstance.modifyNode(body, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#modifyNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeModify**](NodeModify.md)|  |
 **nodeId** | **Integer**|  |

### Return type

[**NodeResponse**](NodeResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reconnectNode"></a>
# **reconnectNode**
> Object reconnectNode(nodeId)

Reconnect Node

Trigger a reconnection for the specified node. Only accessible to sudo admins.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

NodeApi apiInstance = new NodeApi();
Integer nodeId = 56; // Integer | 
try {
    Object result = apiInstance.reconnectNode(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#reconnectNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **Integer**|  |

### Return type

**Object**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeNode"></a>
# **removeNode**
> Object removeNode(nodeId)

Remove Node

Delete a node and remove it from xray in the background.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2PasswordBearer
OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

NodeApi apiInstance = new NodeApi();
Integer nodeId = 56; // Integer | 
try {
    Object result = apiInstance.removeNode(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#removeNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **Integer**|  |

### Return type

**Object**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

