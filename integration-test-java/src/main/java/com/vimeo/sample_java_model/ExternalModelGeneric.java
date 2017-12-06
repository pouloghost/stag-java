package com.vimeo.sample_java_model;

import com.google.gson.annotations.SerializedName;
import com.vimeo.stag.UseStag;

@UseStag
public class ExternalModelGeneric<T> {

    @SerializedName("field2")
    private String mField2;

    @SerializedName("genericField")
    private T mGenericField;

    public String getField2() {
        return mField2;
    }

    public void setField2(String field2) {
        mField2 = field2;
    }

    public T getGenericField() {
        return mGenericField;
    }

    public void setGenericField(T genericField) {
        mGenericField = genericField;
    }
}