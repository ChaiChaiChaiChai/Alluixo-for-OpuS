/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-07-13")
public class GetOpuSInfoTResponse implements org.apache.thrift.TBase<GetOpuSInfoTResponse, GetOpuSInfoTResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetOpuSInfoTResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetOpuSInfoTResponse");

  private static final org.apache.thrift.protocol.TField OPU_SINFO_FIELD_DESC = new org.apache.thrift.protocol.TField("opuSInfo", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetOpuSInfoTResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetOpuSInfoTResponseTupleSchemeFactory();

  public java.lang.String opuSInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPU_SINFO((short)1, "opuSInfo");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OPU_SINFO
          return OPU_SINFO;
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
    tmpMap.put(_Fields.OPU_SINFO, new org.apache.thrift.meta_data.FieldMetaData("opuSInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetOpuSInfoTResponse.class, metaDataMap);
  }

  public GetOpuSInfoTResponse() {
  }

  public GetOpuSInfoTResponse(
    java.lang.String opuSInfo)
  {
    this();
    this.opuSInfo = opuSInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetOpuSInfoTResponse(GetOpuSInfoTResponse other) {
    if (other.isSetOpuSInfo()) {
      this.opuSInfo = other.opuSInfo;
    }
  }

  public GetOpuSInfoTResponse deepCopy() {
    return new GetOpuSInfoTResponse(this);
  }

  @Override
  public void clear() {
    this.opuSInfo = null;
  }

  public java.lang.String getOpuSInfo() {
    return this.opuSInfo;
  }

  public GetOpuSInfoTResponse setOpuSInfo(java.lang.String opuSInfo) {
    this.opuSInfo = opuSInfo;
    return this;
  }

  public void unsetOpuSInfo() {
    this.opuSInfo = null;
  }

  /** Returns true if field opuSInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetOpuSInfo() {
    return this.opuSInfo != null;
  }

  public void setOpuSInfoIsSet(boolean value) {
    if (!value) {
      this.opuSInfo = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case OPU_SINFO:
      if (value == null) {
        unsetOpuSInfo();
      } else {
        setOpuSInfo((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OPU_SINFO:
      return getOpuSInfo();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OPU_SINFO:
      return isSetOpuSInfo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetOpuSInfoTResponse)
      return this.equals((GetOpuSInfoTResponse)that);
    return false;
  }

  public boolean equals(GetOpuSInfoTResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_opuSInfo = true && this.isSetOpuSInfo();
    boolean that_present_opuSInfo = true && that.isSetOpuSInfo();
    if (this_present_opuSInfo || that_present_opuSInfo) {
      if (!(this_present_opuSInfo && that_present_opuSInfo))
        return false;
      if (!this.opuSInfo.equals(that.opuSInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOpuSInfo()) ? 131071 : 524287);
    if (isSetOpuSInfo())
      hashCode = hashCode * 8191 + opuSInfo.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetOpuSInfoTResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetOpuSInfo()).compareTo(other.isSetOpuSInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpuSInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opuSInfo, other.opuSInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetOpuSInfoTResponse(");
    boolean first = true;

    sb.append("opuSInfo:");
    if (this.opuSInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.opuSInfo);
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

  private static class GetOpuSInfoTResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetOpuSInfoTResponseStandardScheme getScheme() {
      return new GetOpuSInfoTResponseStandardScheme();
    }
  }

  private static class GetOpuSInfoTResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetOpuSInfoTResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetOpuSInfoTResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPU_SINFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.opuSInfo = iprot.readString();
              struct.setOpuSInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetOpuSInfoTResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.opuSInfo != null) {
        oprot.writeFieldBegin(OPU_SINFO_FIELD_DESC);
        oprot.writeString(struct.opuSInfo);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetOpuSInfoTResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetOpuSInfoTResponseTupleScheme getScheme() {
      return new GetOpuSInfoTResponseTupleScheme();
    }
  }

  private static class GetOpuSInfoTResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetOpuSInfoTResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetOpuSInfoTResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOpuSInfo()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetOpuSInfo()) {
        oprot.writeString(struct.opuSInfo);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetOpuSInfoTResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.opuSInfo = iprot.readString();
        struct.setOpuSInfoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
