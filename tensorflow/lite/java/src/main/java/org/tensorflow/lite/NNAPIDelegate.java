package org.tensorflow.lite;

public class NNAPIDelegate implements Delegate {
    private long nativeHandle;

    @Override
    public long getNativeHandle() {
        return nativeHandle;
    }

    private NNAPIDelegate() {
        this.nativeHandle = singleton();
    }

    private static NNAPIDelegate instance = null;

    public static final NNAPIDelegate instance() {
        if (instance == null) {
            instance = new NNAPIDelegate();
        }
        return instance;
    }

    private static native long singleton();

    static {
        TensorFlowLite.init();
    }
}
