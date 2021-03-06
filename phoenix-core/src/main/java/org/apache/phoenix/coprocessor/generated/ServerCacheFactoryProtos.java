// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerCacheFactory.proto

package org.apache.phoenix.coprocessor.generated;

public final class ServerCacheFactoryProtos {
  private ServerCacheFactoryProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ServerCacheFactoryOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string className = 1;
    /**
     * <code>required string className = 1;</code>
     */
    boolean hasClassName();
    /**
     * <code>required string className = 1;</code>
     */
    java.lang.String getClassName();
    /**
     * <code>required string className = 1;</code>
     */
    com.google.protobuf.ByteString
        getClassNameBytes();
  }
  /**
   * Protobuf type {@code ServerCacheFactory}
   */
  public static final class ServerCacheFactory extends
      com.google.protobuf.GeneratedMessage
      implements ServerCacheFactoryOrBuilder {
    // Use ServerCacheFactory.newBuilder() to construct.
    private ServerCacheFactory(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ServerCacheFactory(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ServerCacheFactory defaultInstance;
    public static ServerCacheFactory getDefaultInstance() {
      return defaultInstance;
    }

    public ServerCacheFactory getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ServerCacheFactory(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              className_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.internal_static_ServerCacheFactory_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.internal_static_ServerCacheFactory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory.class, org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory.Builder.class);
    }

    public static com.google.protobuf.Parser<ServerCacheFactory> PARSER =
        new com.google.protobuf.AbstractParser<ServerCacheFactory>() {
      public ServerCacheFactory parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerCacheFactory(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ServerCacheFactory> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string className = 1;
    public static final int CLASSNAME_FIELD_NUMBER = 1;
    private java.lang.Object className_;
    /**
     * <code>required string className = 1;</code>
     */
    public boolean hasClassName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string className = 1;</code>
     */
    public java.lang.String getClassName() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          className_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string className = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClassNameBytes() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        className_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      className_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasClassName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getClassNameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getClassNameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory)) {
        return super.equals(obj);
      }
      org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory other = (org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory) obj;

      boolean result = true;
      result = result && (hasClassName() == other.hasClassName());
      if (hasClassName()) {
        result = result && getClassName()
            .equals(other.getClassName());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasClassName()) {
        hash = (37 * hash) + CLASSNAME_FIELD_NUMBER;
        hash = (53 * hash) + getClassName().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ServerCacheFactory}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactoryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.internal_static_ServerCacheFactory_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.internal_static_ServerCacheFactory_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory.class, org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory.Builder.class);
      }

      // Construct using org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        className_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.internal_static_ServerCacheFactory_descriptor;
      }

      public org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory getDefaultInstanceForType() {
        return org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory.getDefaultInstance();
      }

      public org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory build() {
        org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory buildPartial() {
        org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory result = new org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.className_ = className_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory) {
          return mergeFrom((org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory other) {
        if (other == org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory.getDefaultInstance()) return this;
        if (other.hasClassName()) {
          bitField0_ |= 0x00000001;
          className_ = other.className_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasClassName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.phoenix.coprocessor.generated.ServerCacheFactoryProtos.ServerCacheFactory) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string className = 1;
      private java.lang.Object className_ = "";
      /**
       * <code>required string className = 1;</code>
       */
      public boolean hasClassName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string className = 1;</code>
       */
      public java.lang.String getClassName() {
        java.lang.Object ref = className_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          className_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string className = 1;</code>
       */
      public com.google.protobuf.ByteString
          getClassNameBytes() {
        java.lang.Object ref = className_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          className_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string className = 1;</code>
       */
      public Builder setClassName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        className_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string className = 1;</code>
       */
      public Builder clearClassName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        className_ = getDefaultInstance().getClassName();
        onChanged();
        return this;
      }
      /**
       * <code>required string className = 1;</code>
       */
      public Builder setClassNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        className_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ServerCacheFactory)
    }

    static {
      defaultInstance = new ServerCacheFactory(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ServerCacheFactory)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerCacheFactory_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ServerCacheFactory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ServerCacheFactory.proto\"\'\n\022ServerCach" +
      "eFactory\022\021\n\tclassName\030\001 \002(\tBL\n(org.apach" +
      "e.phoenix.coprocessor.generatedB\030ServerC" +
      "acheFactoryProtosH\001\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ServerCacheFactory_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ServerCacheFactory_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ServerCacheFactory_descriptor,
              new java.lang.String[] { "ClassName", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
