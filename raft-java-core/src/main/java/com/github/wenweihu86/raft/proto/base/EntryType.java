package com.github.wenweihu86.raft.proto.base;

import com.github.wenweihu86.raft.proto.RaftProto;

/**
 * Protobuf enum {@code raft.EntryType}
 */
public enum EntryType
        implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ENTRY_TYPE_DATA = 0;</code>
     */
    ENTRY_TYPE_DATA(0, 0),
    /**
     * <code>ENTRY_TYPE_CONFIGURATION = 1;</code>
     */
    ENTRY_TYPE_CONFIGURATION(1, 1),
    ;

    /**
     * <code>ENTRY_TYPE_DATA = 0;</code>
     */
    public static final int ENTRY_TYPE_DATA_VALUE = 0;
    /**
     * <code>ENTRY_TYPE_CONFIGURATION = 1;</code>
     */
    public static final int ENTRY_TYPE_CONFIGURATION_VALUE = 1;


    public final int getNumber() { return value; }

    public static EntryType valueOf(int value) {
        switch (value) {
            case 0: return ENTRY_TYPE_DATA;
            case 1: return ENTRY_TYPE_CONFIGURATION;
            default: return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EntryType>
    internalGetValueMap() {
        return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EntryType>
            internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<EntryType>() {
                public EntryType findValueByNumber(int number) {
                    return EntryType.valueOf(number);
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
        return RaftProto.getDescriptor().getEnumTypes().get(1);
    }

    private static final EntryType[] VALUES = values();

    public static EntryType valueOf(
            com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
                    "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EntryType(int index, int value) {
        this.index = index;
        this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:raft.EntryType)
}