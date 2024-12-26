package io.swagger.client.model;

import java.util.Objects;

/**
 * AllOfProxyHostAlpn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-26T06:54:11.907891916Z[GMT]")
public class AllOfProxyHostAlpn {
    private ProxyHostALPN alpn;

    public AllOfProxyHostAlpn() {
    }

    public ProxyHostALPN getAlpn() {
        return alpn;
    }

    public void setAlpn(ProxyHostALPN alpn) {
        this.alpn = alpn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllOfProxyHostAlpn other = (AllOfProxyHostAlpn) o;
        return Objects.equals(alpn, other.alpn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alpn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllOfProxyHostAlpn {\n");
        sb.append("    alpn: ").append(toIndentedString(alpn)).append("\n");
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