/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetAddress implements org.apache.thrift.TBase<NetAddress, NetAddress._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NetAddress");

  private static final org.apache.thrift.protocol.TField M_HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("mHost", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField M_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("mPort", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NetAddressStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NetAddressTupleSchemeFactory());
  }

  public String mHost; // required
  public int mPort; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    M_HOST((short)1, "mHost"),
    M_PORT((short)2, "mPort");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // M_HOST
          return M_HOST;
        case 2: // M_PORT
          return M_PORT;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MPORT_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.M_HOST, new org.apache.thrift.meta_data.FieldMetaData("mHost", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.M_PORT, new org.apache.thrift.meta_data.FieldMetaData("mPort", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NetAddress.class, metaDataMap);
  }

  public NetAddress() {
  }

  public NetAddress(
    String mHost,
    int mPort)
  {
    this();
    this.mHost = mHost;
    this.mPort = mPort;
    setMPortIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NetAddress(NetAddress other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetMHost()) {
      this.mHost = other.mHost;
    }
    this.mPort = other.mPort;
  }

  public NetAddress deepCopy() {
    return new NetAddress(this);
  }

  @Override
  public void clear() {
    this.mHost = null;
    setMPortIsSet(false);
    this.mPort = 0;
  }

  public String getMHost() {
    return this.mHost;
  }

  public NetAddress setMHost(String mHost) {
    this.mHost = mHost;
    return this;
  }

  public void unsetMHost() {
    this.mHost = null;
  }

  /** Returns true if field mHost is set (has been assigned a value) and false otherwise */
  public boolean isSetMHost() {
    return this.mHost != null;
  }

  public void setMHostIsSet(boolean value) {
    if (!value) {
      this.mHost = null;
    }
  }

  public int getMPort() {
    return this.mPort;
  }

  public NetAddress setMPort(int mPort) {
    this.mPort = mPort;
    setMPortIsSet(true);
    return this;
  }

  public void unsetMPort() {
    __isset_bit_vector.clear(__MPORT_ISSET_ID);
  }

  /** Returns true if field mPort is set (has been assigned a value) and false otherwise */
  public boolean isSetMPort() {
    return __isset_bit_vector.get(__MPORT_ISSET_ID);
  }

  public void setMPortIsSet(boolean value) {
    __isset_bit_vector.set(__MPORT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case M_HOST:
      if (value == null) {
        unsetMHost();
      } else {
        setMHost((String)value);
      }
      break;

    case M_PORT:
      if (value == null) {
        unsetMPort();
      } else {
        setMPort((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case M_HOST:
      return getMHost();

    case M_PORT:
      return Integer.valueOf(getMPort());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case M_HOST:
      return isSetMHost();
    case M_PORT:
      return isSetMPort();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NetAddress)
      return this.equals((NetAddress)that);
    return false;
  }

  public boolean equals(NetAddress that) {
    if (that == null)
      return false;

    boolean this_present_mHost = true && this.isSetMHost();
    boolean that_present_mHost = true && that.isSetMHost();
    if (this_present_mHost || that_present_mHost) {
      if (!(this_present_mHost && that_present_mHost))
        return false;
      if (!this.mHost.equals(that.mHost))
        return false;
    }

    boolean this_present_mPort = true;
    boolean that_present_mPort = true;
    if (this_present_mPort || that_present_mPort) {
      if (!(this_present_mPort && that_present_mPort))
        return false;
      if (this.mPort != that.mPort)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(NetAddress other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    NetAddress typedOther = (NetAddress)other;

    lastComparison = Boolean.valueOf(isSetMHost()).compareTo(typedOther.isSetMHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMHost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mHost, typedOther.mHost);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMPort()).compareTo(typedOther.isSetMPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mPort, typedOther.mPort);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("NetAddress(");
    boolean first = true;

    sb.append("mHost:");
    if (this.mHost == null) {
      sb.append("null");
    } else {
      sb.append(this.mHost);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mPort:");
    sb.append(this.mPort);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NetAddressStandardSchemeFactory implements SchemeFactory {
    public NetAddressStandardScheme getScheme() {
      return new NetAddressStandardScheme();
    }
  }

  private static class NetAddressStandardScheme extends StandardScheme<NetAddress> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NetAddress struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // M_HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mHost = iprot.readString();
              struct.setMHostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // M_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mPort = iprot.readI32();
              struct.setMPortIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NetAddress struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mHost != null) {
        oprot.writeFieldBegin(M_HOST_FIELD_DESC);
        oprot.writeString(struct.mHost);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(M_PORT_FIELD_DESC);
      oprot.writeI32(struct.mPort);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NetAddressTupleSchemeFactory implements SchemeFactory {
    public NetAddressTupleScheme getScheme() {
      return new NetAddressTupleScheme();
    }
  }

  private static class NetAddressTupleScheme extends TupleScheme<NetAddress> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NetAddress struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMHost()) {
        optionals.set(0);
      }
      if (struct.isSetMPort()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMHost()) {
        oprot.writeString(struct.mHost);
      }
      if (struct.isSetMPort()) {
        oprot.writeI32(struct.mPort);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NetAddress struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.mHost = iprot.readString();
        struct.setMHostIsSet(true);
      }
      if (incoming.get(1)) {
        struct.mPort = iprot.readI32();
        struct.setMPortIsSet(true);
      }
    }
  }

}
