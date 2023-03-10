/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ibm.watson.modelmesh.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)")
public class ModelInfo implements org.apache.thrift.TBase<ModelInfo, ModelInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ModelInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ModelInfo");

  private static final org.apache.thrift.protocol.TField SERVICE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("serviceType", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MODEL_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("modelPath", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ENC_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("encKey", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ModelInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ModelInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String serviceType; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String modelPath; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String encKey; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SERVICE_TYPE((short)1, "serviceType"),
    MODEL_PATH((short)2, "modelPath"),
    ENC_KEY((short)3, "encKey");

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
        case 1: // SERVICE_TYPE
          return SERVICE_TYPE;
        case 2: // MODEL_PATH
          return MODEL_PATH;
        case 3: // ENC_KEY
          return ENC_KEY;
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
  private static final _Fields optionals[] = {_Fields.ENC_KEY};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SERVICE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("serviceType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MODEL_PATH, new org.apache.thrift.meta_data.FieldMetaData("modelPath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENC_KEY, new org.apache.thrift.meta_data.FieldMetaData("encKey", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ModelInfo.class, metaDataMap);
  }

  public ModelInfo() {
  }

  public ModelInfo(
    java.lang.String serviceType,
    java.lang.String modelPath)
  {
    this();
    this.serviceType = serviceType;
    this.modelPath = modelPath;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ModelInfo(ModelInfo other) {
    if (other.isSetServiceType()) {
      this.serviceType = other.serviceType;
    }
    if (other.isSetModelPath()) {
      this.modelPath = other.modelPath;
    }
    if (other.isSetEncKey()) {
      this.encKey = other.encKey;
    }
  }

  public ModelInfo deepCopy() {
    return new ModelInfo(this);
  }

  @Override
  public void clear() {
    this.serviceType = null;
    this.modelPath = null;
    this.encKey = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getServiceType() {
    return this.serviceType;
  }

  public ModelInfo setServiceType(@org.apache.thrift.annotation.Nullable java.lang.String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  public void unsetServiceType() {
    this.serviceType = null;
  }

  /** Returns true if field serviceType is set (has been assigned a value) and false otherwise */
  public boolean isSetServiceType() {
    return this.serviceType != null;
  }

  public void setServiceTypeIsSet(boolean value) {
    if (!value) {
      this.serviceType = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getModelPath() {
    return this.modelPath;
  }

  public ModelInfo setModelPath(@org.apache.thrift.annotation.Nullable java.lang.String modelPath) {
    this.modelPath = modelPath;
    return this;
  }

  public void unsetModelPath() {
    this.modelPath = null;
  }

  /** Returns true if field modelPath is set (has been assigned a value) and false otherwise */
  public boolean isSetModelPath() {
    return this.modelPath != null;
  }

  public void setModelPathIsSet(boolean value) {
    if (!value) {
      this.modelPath = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getEncKey() {
    return this.encKey;
  }

  public ModelInfo setEncKey(@org.apache.thrift.annotation.Nullable java.lang.String encKey) {
    this.encKey = encKey;
    return this;
  }

  public void unsetEncKey() {
    this.encKey = null;
  }

  /** Returns true if field encKey is set (has been assigned a value) and false otherwise */
  public boolean isSetEncKey() {
    return this.encKey != null;
  }

  public void setEncKeyIsSet(boolean value) {
    if (!value) {
      this.encKey = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SERVICE_TYPE:
      if (value == null) {
        unsetServiceType();
      } else {
        setServiceType((java.lang.String)value);
      }
      break;

    case MODEL_PATH:
      if (value == null) {
        unsetModelPath();
      } else {
        setModelPath((java.lang.String)value);
      }
      break;

    case ENC_KEY:
      if (value == null) {
        unsetEncKey();
      } else {
        setEncKey((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SERVICE_TYPE:
      return getServiceType();

    case MODEL_PATH:
      return getModelPath();

    case ENC_KEY:
      return getEncKey();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SERVICE_TYPE:
      return isSetServiceType();
    case MODEL_PATH:
      return isSetModelPath();
    case ENC_KEY:
      return isSetEncKey();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ModelInfo)
      return this.equals((ModelInfo)that);
    return false;
  }

  public boolean equals(ModelInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_serviceType = true && this.isSetServiceType();
    boolean that_present_serviceType = true && that.isSetServiceType();
    if (this_present_serviceType || that_present_serviceType) {
      if (!(this_present_serviceType && that_present_serviceType))
        return false;
      if (!this.serviceType.equals(that.serviceType))
        return false;
    }

    boolean this_present_modelPath = true && this.isSetModelPath();
    boolean that_present_modelPath = true && that.isSetModelPath();
    if (this_present_modelPath || that_present_modelPath) {
      if (!(this_present_modelPath && that_present_modelPath))
        return false;
      if (!this.modelPath.equals(that.modelPath))
        return false;
    }

    boolean this_present_encKey = true && this.isSetEncKey();
    boolean that_present_encKey = true && that.isSetEncKey();
    if (this_present_encKey || that_present_encKey) {
      if (!(this_present_encKey && that_present_encKey))
        return false;
      if (!this.encKey.equals(that.encKey))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetServiceType()) ? 131071 : 524287);
    if (isSetServiceType())
      hashCode = hashCode * 8191 + serviceType.hashCode();

    hashCode = hashCode * 8191 + ((isSetModelPath()) ? 131071 : 524287);
    if (isSetModelPath())
      hashCode = hashCode * 8191 + modelPath.hashCode();

    hashCode = hashCode * 8191 + ((isSetEncKey()) ? 131071 : 524287);
    if (isSetEncKey())
      hashCode = hashCode * 8191 + encKey.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ModelInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetServiceType(), other.isSetServiceType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServiceType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serviceType, other.serviceType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetModelPath(), other.isSetModelPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetModelPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.modelPath, other.modelPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEncKey(), other.isSetEncKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEncKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.encKey, other.encKey);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ModelInfo(");
    boolean first = true;

    sb.append("serviceType:");
    if (this.serviceType == null) {
      sb.append("null");
    } else {
      sb.append(this.serviceType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("modelPath:");
    if (this.modelPath == null) {
      sb.append("null");
    } else {
      sb.append(this.modelPath);
    }
    first = false;
    if (isSetEncKey()) {
      if (!first) sb.append(", ");
      sb.append("encKey:");
      if (this.encKey == null) {
        sb.append("null");
      } else {
        sb.append(this.encKey);
      }
      first = false;
    }
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

  private static class ModelInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ModelInfoStandardScheme getScheme() {
      return new ModelInfoStandardScheme();
    }
  }

  private static class ModelInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ModelInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ModelInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SERVICE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serviceType = iprot.readString();
              struct.setServiceTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MODEL_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.modelPath = iprot.readString();
              struct.setModelPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ENC_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.encKey = iprot.readString();
              struct.setEncKeyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ModelInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.serviceType != null) {
        oprot.writeFieldBegin(SERVICE_TYPE_FIELD_DESC);
        oprot.writeString(struct.serviceType);
        oprot.writeFieldEnd();
      }
      if (struct.modelPath != null) {
        oprot.writeFieldBegin(MODEL_PATH_FIELD_DESC);
        oprot.writeString(struct.modelPath);
        oprot.writeFieldEnd();
      }
      if (struct.encKey != null) {
        if (struct.isSetEncKey()) {
          oprot.writeFieldBegin(ENC_KEY_FIELD_DESC);
          oprot.writeString(struct.encKey);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ModelInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ModelInfoTupleScheme getScheme() {
      return new ModelInfoTupleScheme();
    }
  }

  private static class ModelInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ModelInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ModelInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetServiceType()) {
        optionals.set(0);
      }
      if (struct.isSetModelPath()) {
        optionals.set(1);
      }
      if (struct.isSetEncKey()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetServiceType()) {
        oprot.writeString(struct.serviceType);
      }
      if (struct.isSetModelPath()) {
        oprot.writeString(struct.modelPath);
      }
      if (struct.isSetEncKey()) {
        oprot.writeString(struct.encKey);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ModelInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.serviceType = iprot.readString();
        struct.setServiceTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.modelPath = iprot.readString();
        struct.setModelPathIsSet(true);
      }
      if (incoming.get(2)) {
        struct.encKey = iprot.readString();
        struct.setEncKeyIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

