package org.jdownloader.plugins;

public class ConditionalSkipReasonException extends Exception {

    /**
     *
     */
    private static final long           serialVersionUID = 6115409562693904160L;
    private final ConditionalSkipReason skipReason;

    public ConditionalSkipReason getConditionalSkipReason() {
        return skipReason;
    }

    public ConditionalSkipReasonException(ConditionalSkipReason skipReason) {
        if (skipReason == null) {
            throw new IllegalArgumentException("ConditionalSkipReason is null");
        } else {
            this.skipReason = skipReason;
        }
    }
}
