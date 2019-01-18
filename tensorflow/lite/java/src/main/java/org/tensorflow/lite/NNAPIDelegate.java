package org.tensorflow.lite;

public class NNAPIDelegate implements Delegate {
    private static final long nativeHandle;
    private static native long singleton();
    static {
        TensorFlowLite.init();
        nativeHandle = singleton();
    }

    @Override
    public long getNativeHandle() {
        return nativeHandle;
    }

    public NNAPIDelegate() {
    }
}
