package io.swagger.client.model;

import java.util.Objects;

/**
 * AllOfProxyHostFingerprint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-26T06:54:11.907891916Z[GMT]")
public class AllOfProxyHostFingerprint {
    private ProxyHostFingerprint fingerprint;

    public AllOfProxyHostFingerprint() {
    }

    public ProxyHostFingerprint getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(ProxyHostFingerprint fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllOfProxyHostFingerprint other = (AllOfProxyHostFingerprint) o;
        return Objects.equals(fingerprint, other.fingerprint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fingerprint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllOfProxyHostFingerprint {\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
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