package software.amazon.jsii.tests.calculator.lib;
/**
 * Represents a concrete number.
 */
@software.amazon.jsii.Jsii(module = software.amazon.jsii.tests.calculator.lib.$Module.class, fqn = "@scope/jsii-calc-lib.Number")
public class Number extends software.amazon.jsii.tests.calculator.lib.Value {
    protected Number(final software.amazon.jsii.JsiiObject.InitializationMode mode) {
        super(mode);
    }
    /**
     * Creates a Number object.
     * @param value The number.
     */
    public Number(final java.lang.Number value) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.Jsii);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, java.util.stream.Stream.of(java.util.Objects.requireNonNull(value, "value is required")).toArray());
    }
    /**
     * The number.
     */
    public java.lang.Number getValue() {
        return this.jsiiGet("value", java.lang.Number.class);
    }
    /**
     * The number multiplied by 2.
     */
    public java.lang.Number getDoubleValue() {
        return this.jsiiGet("doubleValue", java.lang.Number.class);
    }
}
