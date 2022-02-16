// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/account/account.proto

package network.clusterone.grpc;

/**
 * Protobuf enum {@code account.WordLang}
 */
public enum WordLang
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENGLISH = 0;</code>
   */
  ENGLISH(0),
  /**
   * <code>FRENCH = 1;</code>
   */
  FRENCH(1),
  /**
   * <code>ITALIAN = 2;</code>
   */
  ITALIAN(2),
  /**
   * <code>SPANISH = 3;</code>
   */
  SPANISH(3),
  /**
   * <code>CZECH = 4;</code>
   */
  CZECH(4),
  /**
   * <code>JAPANESE = 5;</code>
   */
  JAPANESE(5),
  /**
   * <code>KOREAN = 6;</code>
   */
  KOREAN(6),
  /**
   * <code>CHINESESIMPLIFIED = 7;</code>
   */
  CHINESESIMPLIFIED(7),
  /**
   * <code>CHINESETRADITIONAL = 8;</code>
   */
  CHINESETRADITIONAL(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ENGLISH = 0;</code>
   */
  public static final int ENGLISH_VALUE = 0;
  /**
   * <code>FRENCH = 1;</code>
   */
  public static final int FRENCH_VALUE = 1;
  /**
   * <code>ITALIAN = 2;</code>
   */
  public static final int ITALIAN_VALUE = 2;
  /**
   * <code>SPANISH = 3;</code>
   */
  public static final int SPANISH_VALUE = 3;
  /**
   * <code>CZECH = 4;</code>
   */
  public static final int CZECH_VALUE = 4;
  /**
   * <code>JAPANESE = 5;</code>
   */
  public static final int JAPANESE_VALUE = 5;
  /**
   * <code>KOREAN = 6;</code>
   */
  public static final int KOREAN_VALUE = 6;
  /**
   * <code>CHINESESIMPLIFIED = 7;</code>
   */
  public static final int CHINESESIMPLIFIED_VALUE = 7;
  /**
   * <code>CHINESETRADITIONAL = 8;</code>
   */
  public static final int CHINESETRADITIONAL_VALUE = 8;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static WordLang valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WordLang forNumber(int value) {
    switch (value) {
      case 0: return ENGLISH;
      case 1: return FRENCH;
      case 2: return ITALIAN;
      case 3: return SPANISH;
      case 4: return CZECH;
      case 5: return JAPANESE;
      case 6: return KOREAN;
      case 7: return CHINESESIMPLIFIED;
      case 8: return CHINESETRADITIONAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WordLang>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WordLang> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WordLang>() {
          public WordLang findValueByNumber(int number) {
            return WordLang.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return network.clusterone.grpc.AccountServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final WordLang[] VALUES = values();

  public static WordLang valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private WordLang(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:account.WordLang)
}

