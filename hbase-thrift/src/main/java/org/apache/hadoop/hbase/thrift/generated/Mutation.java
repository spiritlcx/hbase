/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * A Mutation object is used to either update or delete a column-value.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-11-17")
public class Mutation implements org.apache.thrift.TBase<Mutation, Mutation._Fields>, java.io.Serializable, Cloneable, Comparable<Mutation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Mutation");

  private static final org.apache.thrift.protocol.TField IS_DELETE_FIELD_DESC = new org.apache.thrift.protocol.TField("isDelete", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("column", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField WRITE_TO_WAL_FIELD_DESC = new org.apache.thrift.protocol.TField("writeToWAL", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MutationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MutationTupleSchemeFactory());
  }

  public boolean isDelete; // required
  public ByteBuffer column; // required
  public ByteBuffer value; // required
  public boolean writeToWAL; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_DELETE((short)1, "isDelete"),
    COLUMN((short)2, "column"),
    VALUE((short)3, "value"),
    WRITE_TO_WAL((short)4, "writeToWAL");

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
        case 1: // IS_DELETE
          return IS_DELETE;
        case 2: // COLUMN
          return COLUMN;
        case 3: // VALUE
          return VALUE;
        case 4: // WRITE_TO_WAL
          return WRITE_TO_WAL;
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
  private static final int __ISDELETE_ISSET_ID = 0;
  private static final int __WRITETOWAL_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_DELETE, new org.apache.thrift.meta_data.FieldMetaData("isDelete", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COLUMN, new org.apache.thrift.meta_data.FieldMetaData("column", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.WRITE_TO_WAL, new org.apache.thrift.meta_data.FieldMetaData("writeToWAL", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Mutation.class, metaDataMap);
  }

  public Mutation() {
    this.isDelete = false;

    this.writeToWAL = true;

  }

  public Mutation(
    boolean isDelete,
    ByteBuffer column,
    ByteBuffer value,
    boolean writeToWAL)
  {
    this();
    this.isDelete = isDelete;
    setIsDeleteIsSet(true);
    this.column = org.apache.thrift.TBaseHelper.copyBinary(column);
    this.value = org.apache.thrift.TBaseHelper.copyBinary(value);
    this.writeToWAL = writeToWAL;
    setWriteToWALIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Mutation(Mutation other) {
    __isset_bitfield = other.__isset_bitfield;
    this.isDelete = other.isDelete;
    if (other.isSetColumn()) {
      this.column = other.column;
    }
    if (other.isSetValue()) {
      this.value = other.value;
    }
    this.writeToWAL = other.writeToWAL;
  }

  public Mutation deepCopy() {
    return new Mutation(this);
  }

  @Override
  public void clear() {
    this.isDelete = false;

    this.column = null;
    this.value = null;
    this.writeToWAL = true;

  }

  public boolean isIsDelete() {
    return this.isDelete;
  }

  public Mutation setIsDelete(boolean isDelete) {
    this.isDelete = isDelete;
    setIsDeleteIsSet(true);
    return this;
  }

  public void unsetIsDelete() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISDELETE_ISSET_ID);
  }

  /** Returns true if field isDelete is set (has been assigned a value) and false otherwise */
  public boolean isSetIsDelete() {
    return EncodingUtils.testBit(__isset_bitfield, __ISDELETE_ISSET_ID);
  }

  public void setIsDeleteIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISDELETE_ISSET_ID, value);
  }

  public byte[] getColumn() {
    setColumn(org.apache.thrift.TBaseHelper.rightSize(column));
    return column == null ? null : column.array();
  }

  public ByteBuffer bufferForColumn() {
    return org.apache.thrift.TBaseHelper.copyBinary(column);
  }

  public Mutation setColumn(byte[] column) {
    this.column = column == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(column, column.length));
    return this;
  }

  public Mutation setColumn(ByteBuffer column) {
    this.column = org.apache.thrift.TBaseHelper.copyBinary(column);
    return this;
  }

  public void unsetColumn() {
    this.column = null;
  }

  /** Returns true if field column is set (has been assigned a value) and false otherwise */
  public boolean isSetColumn() {
    return this.column != null;
  }

  public void setColumnIsSet(boolean value) {
    if (!value) {
      this.column = null;
    }
  }

  public byte[] getValue() {
    setValue(org.apache.thrift.TBaseHelper.rightSize(value));
    return value == null ? null : value.array();
  }

  public ByteBuffer bufferForValue() {
    return org.apache.thrift.TBaseHelper.copyBinary(value);
  }

  public Mutation setValue(byte[] value) {
    this.value = value == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(value, value.length));
    return this;
  }

  public Mutation setValue(ByteBuffer value) {
    this.value = org.apache.thrift.TBaseHelper.copyBinary(value);
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public boolean isWriteToWAL() {
    return this.writeToWAL;
  }

  public Mutation setWriteToWAL(boolean writeToWAL) {
    this.writeToWAL = writeToWAL;
    setWriteToWALIsSet(true);
    return this;
  }

  public void unsetWriteToWAL() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WRITETOWAL_ISSET_ID);
  }

  /** Returns true if field writeToWAL is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteToWAL() {
    return EncodingUtils.testBit(__isset_bitfield, __WRITETOWAL_ISSET_ID);
  }

  public void setWriteToWALIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WRITETOWAL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_DELETE:
      if (value == null) {
        unsetIsDelete();
      } else {
        setIsDelete((Boolean)value);
      }
      break;

    case COLUMN:
      if (value == null) {
        unsetColumn();
      } else {
        setColumn((ByteBuffer)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((ByteBuffer)value);
      }
      break;

    case WRITE_TO_WAL:
      if (value == null) {
        unsetWriteToWAL();
      } else {
        setWriteToWAL((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_DELETE:
      return isIsDelete();

    case COLUMN:
      return getColumn();

    case VALUE:
      return getValue();

    case WRITE_TO_WAL:
      return isWriteToWAL();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_DELETE:
      return isSetIsDelete();
    case COLUMN:
      return isSetColumn();
    case VALUE:
      return isSetValue();
    case WRITE_TO_WAL:
      return isSetWriteToWAL();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Mutation)
      return this.equals((Mutation)that);
    return false;
  }

  public boolean equals(Mutation that) {
    if (that == null)
      return false;

    boolean this_present_isDelete = true;
    boolean that_present_isDelete = true;
    if (this_present_isDelete || that_present_isDelete) {
      if (!(this_present_isDelete && that_present_isDelete))
        return false;
      if (this.isDelete != that.isDelete)
        return false;
    }

    boolean this_present_column = true && this.isSetColumn();
    boolean that_present_column = true && that.isSetColumn();
    if (this_present_column || that_present_column) {
      if (!(this_present_column && that_present_column))
        return false;
      if (!this.column.equals(that.column))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_writeToWAL = true;
    boolean that_present_writeToWAL = true;
    if (this_present_writeToWAL || that_present_writeToWAL) {
      if (!(this_present_writeToWAL && that_present_writeToWAL))
        return false;
      if (this.writeToWAL != that.writeToWAL)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_isDelete = true;
    list.add(present_isDelete);
    if (present_isDelete)
      list.add(isDelete);

    boolean present_column = true && (isSetColumn());
    list.add(present_column);
    if (present_column)
      list.add(column);

    boolean present_value = true && (isSetValue());
    list.add(present_value);
    if (present_value)
      list.add(value);

    boolean present_writeToWAL = true;
    list.add(present_writeToWAL);
    if (present_writeToWAL)
      list.add(writeToWAL);

    return list.hashCode();
  }

  @Override
  public int compareTo(Mutation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIsDelete()).compareTo(other.isSetIsDelete());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsDelete()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isDelete, other.isDelete);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumn()).compareTo(other.isSetColumn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column, other.column);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteToWAL()).compareTo(other.isSetWriteToWAL());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteToWAL()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeToWAL, other.writeToWAL);
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
    StringBuilder sb = new StringBuilder("Mutation(");
    boolean first = true;

    sb.append("isDelete:");
    sb.append(this.isDelete);
    first = false;
    if (!first) sb.append(", ");
    sb.append("column:");
    if (this.column == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.column, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.value, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("writeToWAL:");
    sb.append(this.writeToWAL);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MutationStandardSchemeFactory implements SchemeFactory {
    public MutationStandardScheme getScheme() {
      return new MutationStandardScheme();
    }
  }

  private static class MutationStandardScheme extends StandardScheme<Mutation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Mutation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_DELETE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isDelete = iprot.readBool();
              struct.setIsDeleteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.column = iprot.readBinary();
              struct.setColumnIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readBinary();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WRITE_TO_WAL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.writeToWAL = iprot.readBool();
              struct.setWriteToWALIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Mutation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_DELETE_FIELD_DESC);
      oprot.writeBool(struct.isDelete);
      oprot.writeFieldEnd();
      if (struct.column != null) {
        oprot.writeFieldBegin(COLUMN_FIELD_DESC);
        oprot.writeBinary(struct.column);
        oprot.writeFieldEnd();
      }
      if (struct.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeBinary(struct.value);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WRITE_TO_WAL_FIELD_DESC);
      oprot.writeBool(struct.writeToWAL);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MutationTupleSchemeFactory implements SchemeFactory {
    public MutationTupleScheme getScheme() {
      return new MutationTupleScheme();
    }
  }

  private static class MutationTupleScheme extends TupleScheme<Mutation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Mutation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIsDelete()) {
        optionals.set(0);
      }
      if (struct.isSetColumn()) {
        optionals.set(1);
      }
      if (struct.isSetValue()) {
        optionals.set(2);
      }
      if (struct.isSetWriteToWAL()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetIsDelete()) {
        oprot.writeBool(struct.isDelete);
      }
      if (struct.isSetColumn()) {
        oprot.writeBinary(struct.column);
      }
      if (struct.isSetValue()) {
        oprot.writeBinary(struct.value);
      }
      if (struct.isSetWriteToWAL()) {
        oprot.writeBool(struct.writeToWAL);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Mutation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.isDelete = iprot.readBool();
        struct.setIsDeleteIsSet(true);
      }
      if (incoming.get(1)) {
        struct.column = iprot.readBinary();
        struct.setColumnIsSet(true);
      }
      if (incoming.get(2)) {
        struct.value = iprot.readBinary();
        struct.setValueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.writeToWAL = iprot.readBool();
        struct.setWriteToWALIsSet(true);
      }
    }
  }

}

