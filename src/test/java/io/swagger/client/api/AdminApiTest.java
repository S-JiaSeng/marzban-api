/*
 * MarzbanAPI
 * Unified GUI Censorship Resistant Solution Powered by Xray
 *
 * OpenAPI spec version: 0.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.Admin;
import io.swagger.client.model.AdminCreate;
import io.swagger.client.model.AdminModify;
import io.swagger.client.model.HTTPValidationError;
import io.swagger.client.model.Token;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AdminApi
 */
@Ignore
public class AdminApiTest {

    private final AdminApi api = new AdminApi();

    /**
     * Admin Token
     *
     * Authenticate an admin and issue a token.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminTokenTest() throws Exception {
        String grantType = null;
        String username = null;
        String password = null;
        String scope = null;
        String clientId = null;
        String clientSecret = null;
        Token response = api.adminToken(grantType, username, password, scope, clientId, clientSecret);

        // TODO: test validations
    }
    /**
     * Create Admin
     *
     * Create a new admin if the current admin has sudo privileges.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAdminTest() throws Exception {
        AdminCreate body = null;
        Admin response = api.createAdmin(body);

        // TODO: test validations
    }
    /**
     * Get Admins
     *
     * Fetch a list of admins with optional filters for pagination and username.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAdminsTest() throws Exception {
        Integer offset = null;
        Integer limit = null;
        String username = null;
        List<Admin> response = api.getAdmins(offset, limit, username);

        // TODO: test validations
    }
    /**
     * Get Current Admin
     *
     * Retrieve the current authenticated admin.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCurrentAdminTest() throws Exception {
        Admin response = api.getCurrentAdmin();

        // TODO: test validations
    }
    /**
     * Modify Admin
     *
     * Modify an existing admin&#x27;s details.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void modifyAdminTest() throws Exception {
        AdminModify body = null;
        String username = null;
        Admin response = api.modifyAdmin(body, username);

        // TODO: test validations
    }
    /**
     * Remove Admin
     *
     * Remove an admin from the database.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeAdminTest() throws Exception {
        String username = null;
        Object response = api.removeAdmin(username);

        // TODO: test validations
    }
}
