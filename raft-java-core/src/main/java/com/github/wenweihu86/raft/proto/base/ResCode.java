package com.github.wenweihu86.raft.proto.base;

import com.github.wenweihu86.raft.proto.RaftProto;

/**
 * Protobuf enum {@code raft.ResCode}
 */
public enum ResCode
        implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>RES_CODE_SUCCESS = 0;</code>
     */
    RES_CODE_SUCCESS(0, 0),
    /**
     * <code>RES_CODE_FAIL = 1;</code>
     */
    RES_CODE_FAIL(1, 1),
    /**
     * <code>RES_CODE_NOT_LEADER = 2;</code>
     */
    RES_CODE_NOT_LEADER(2, 2),
    ;

    /**
     * <code>RES_CODE_SUCCESS = 0;</code>
     */
    public static final int RES_CODE_SUCCESS_VALUE = 0;
    /**
     * <code>RES_CODE_FAIL = 1;</code>
     */
    public static final int RES_CODE_FAIL_VALUE = 1;
    /**
     * <code>RES_CODE_NOT_LEADER = 2;</code>
     */
    public static final int RES_CODE_NOT_LEADER_VALUE = 2;


    public final int getNumber() { return value; }

    public static ResCode valueOf(int value) {
        switch (value) {
            case 0: return RES_CODE_SUCCESS;
            case 1: return RES_CODE_FAIL;
            case 2: return RES_CODE_NOT_LEADER;
            default: return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResCode>
    internalGetValueMap() {
        return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ResCode>
            internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ResCode>() {
                public ResCode findValueByNumber(int number) {
                    return ResCode.valueOf(number);
                }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
    getValueDescriptor() {
        return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptorForType() {
        return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptor() {
        return RaftProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final ResCode[] VALUES = values();

    public static ResCode valueOf(
            com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
                    "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ResCode(int index, int value) {
        this.index = index;
        this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:raft.ResCode)
}
