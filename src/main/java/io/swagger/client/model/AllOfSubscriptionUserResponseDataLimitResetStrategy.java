package io.swagger.client.model;

import java.util.Objects;

/**
 * AllOfSubscriptionUserResponseDataLimitResetStrategy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-26T06:54:11.907891916Z[GMT]")
public class AllOfSubscriptionUserResponseDataLimitResetStrategy {
    private UserDataLimitResetStrategy resetStrategy;

    public AllOfSubscriptionUserResponseDataLimitResetStrategy() {
    }

    public UserDataLimitResetStrategy getResetStrategy() {
        return resetStrategy;
    }

    public void setResetStrategy(UserDataLimitResetStrategy resetStrategy) {
        this.resetStrategy = resetStrategy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllOfSubscriptionUserResponseDataLimitResetStrategy other = (AllOfSubscriptionUserResponseDataLimitResetStrategy) o;
        return Objects.equals(resetStrategy, other.resetStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resetStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllOfSubscriptionUserResponseDataLimitResetStrategy {\n");
        sb.append("    resetStrategy: ").append(toIndentedString(resetStrategy)).append("\n");
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