package io.swagger.client.model;

import java.util.Objects;

/**
 * AllOfProxyHostSecurity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-26T06:54:11.907891916Z[GMT]")
public class AllOfProxyHostSecurity {
    private ProxyHostSecurity security;

    public AllOfProxyHostSecurity() {
    }

    public ProxyHostSecurity getSecurity() {
        return security;
    }

    public void setSecurity(ProxyHostSecurity security) {
        this.security = security;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllOfProxyHostSecurity other = (AllOfProxyHostSecurity) o;
        return Objects.equals(security, other.security);
    }

    @Override
    public int hashCode() {
        return Objects.hash(security);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllOfProxyHostSecurity {\n");
        sb.append("    security: ").append(toIndentedString(security)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}