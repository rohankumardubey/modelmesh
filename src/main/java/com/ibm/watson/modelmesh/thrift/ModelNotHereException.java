/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ibm.watson.modelmesh.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)")
public class ModelNotHereException extends org.apache.thrift.TException implements org.apache.thrift.TBase<ModelNotHereException, ModelNotHereException._Fields>, java.io.Serializable, Cloneable, Comparable<ModelNotHereException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ModelNotHereException");

  private static final org.apache.thrift.protocol.TField INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("instanceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MODEL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("modelId", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ModelNotHereExceptionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ModelNotHereExceptionTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String instanceId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String modelId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INSTANCE_ID((short)1, "instanceId"),
    MODEL_ID((short)2, "modelId");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INSTANCE_ID
          return INSTANCE_ID;
        case 2: // MODEL_ID
          return MODEL_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("instanceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MODEL_ID, new org.apache.thrift.meta_data.FieldMetaData("modelId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ModelNotHereException.class, metaDataMap);
  }

  public ModelNotHereException() {
  }

  public ModelNotHereException(
    java.lang.String instanceId,
    java.lang.String modelId)
  {
    this();
    this.instanceId = instanceId;
    this.modelId = modelId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ModelNotHereException(ModelNotHereException other) {
    if (other.isSetInstanceId()) {
      this.instanceId = other.instanceId;
    }
    if (other.isSetModelId()) {
      this.modelId = other.modelId;
    }
  }

  public ModelNotHereException deepCopy() {
    return new ModelNotHereException(this);
  }

  @Override
  public void clear() {
    this.instanceId = null;
    this.modelId = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getInstanceId() {
    return this.instanceId;
  }

  public ModelNotHereException setInstanceId(@org.apache.thrift.annotation.Nullable java.lang.String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  public void unsetInstanceId() {
    this.instanceId = null;
  }

  /** Returns true if field instanceId is set (has been assigned a value) and false otherwise */
  public boolean isSetInstanceId() {
    return this.instanceId != null;
  }

  public void setInstanceIdIsSet(boolean value) {
    if (!value) {
      this.instanceId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getModelId() {
    return this.modelId;
  }

  public ModelNotHereException setModelId(@org.apache.thrift.annotation.Nullable java.lang.String modelId) {
    this.modelId = modelId;
    return this;
  }

  public void unsetModelId() {
    this.modelId = null;
  }

  /** Returns true if field modelId is set (has been assigned a value) and false otherwise */
  public boolean isSetModelId() {
    return this.modelId != null;
  }

  public void setModelIdIsSet(boolean value) {
    if (!value) {
      this.modelId = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INSTANCE_ID:
      if (value == null) {
        unsetInstanceId();
      } else {
        setInstanceId((java.lang.String)value);
      }
      break;

    case MODEL_ID:
      if (value == null) {
        unsetModelId();
      } else {
        setModelId((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INSTANCE_ID:
      return getInstanceId();

    case MODEL_ID:
      return getModelId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case INSTANCE_ID:
      return isSetInstanceId();
    case MODEL_ID:
      return isSetModelId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ModelNotHereException)
      return this.equals((ModelNotHereException)that);
    return false;
  }

  public boolean equals(ModelNotHereException that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_instanceId = true && this.isSetInstanceId();
    boolean that_present_instanceId = true && that.isSetInstanceId();
    if (this_present_instanceId || that_present_instanceId) {
      if (!(this_present_instanceId && that_present_instanceId))
        return false;
      if (!this.instanceId.equals(that.instanceId))
        return false;
    }

    boolean this_present_modelId = true && this.isSetModelId();
    boolean that_present_modelId = true && that.isSetModelId();
    if (this_present_modelId || that_present_modelId) {
      if (!(this_present_modelId && that_present_modelId))
        return false;
      if (!this.modelId.equals(that.modelId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetInstanceId()) ? 131071 : 524287);
    if (isSetInstanceId())
      hashCode = hashCode * 8191 + instanceId.hashCode();

    hashCode = hashCode * 8191 + ((isSetModelId()) ? 131071 : 524287);
    if (isSetModelId())
      hashCode = hashCode * 8191 + modelId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ModelNotHereException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetInstanceId(), other.isSetInstanceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstanceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instanceId, other.instanceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetModelId(), other.isSetModelId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetModelId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.modelId, other.modelId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ModelNotHereException(");
    boolean first = true;

    sb.append("instanceId:");
    if (this.instanceId == null) {
      sb.append("null");
    } else {
      sb.append(this.instanceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("modelId:");
    if (this.modelId == null) {
      sb.append("null");
    } else {
      sb.append(this.modelId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ModelNotHereExceptionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ModelNotHereExceptionStandardScheme getScheme() {
      return new ModelNotHereExceptionStandardScheme();
    }
  }

  private static class ModelNotHereExceptionStandardScheme extends org.apache.thrift.scheme.StandardScheme<ModelNotHereException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ModelNotHereException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INSTANCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.instanceId = iprot.readString();
              struct.setInstanceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MODEL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.modelId = iprot.readString();
              struct.setModelIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ModelNotHereException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.instanceId != null) {
        oprot.writeFieldBegin(INSTANCE_ID_FIELD_DESC);
        oprot.writeString(struct.instanceId);
        oprot.writeFieldEnd();
      }
      if (struct.modelId != null) {
        oprot.writeFieldBegin(MODEL_ID_FIELD_DESC);
        oprot.writeString(struct.modelId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ModelNotHereExceptionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ModelNotHereExceptionTupleScheme getScheme() {
      return new ModelNotHereExceptionTupleScheme();
    }
  }

  private static class ModelNotHereExceptionTupleScheme extends org.apache.thrift.scheme.TupleScheme<ModelNotHereException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ModelNotHereException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetInstanceId()) {
        optionals.set(0);
      }
      if (struct.isSetModelId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetInstanceId()) {
        oprot.writeString(struct.instanceId);
      }
      if (struct.isSetModelId()) {
        oprot.writeString(struct.modelId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ModelNotHereException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.instanceId = iprot.readString();
        struct.setInstanceIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.modelId = iprot.readString();
        struct.setModelIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

