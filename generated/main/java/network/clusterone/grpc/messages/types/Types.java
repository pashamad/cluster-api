// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages/types/types.proto

package network.clusterone.grpc.messages.types;

public final class Types {
  private Types() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_types_Transaction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_types_Transaction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032messages/types/types.proto\022\005types\"\316\001\n\013" +
      "Transaction\022\017\n\007tx_hash\030\001 \001(\t\022\022\n\ncreated_" +
      "at\030\002 \001(\004\022\021\n\tblock_num\030\003 \001(\004\022\021\n\tfrom_addr" +
      "\030\004 \001(\t\022\017\n\007to_addr\030\005 \001(\t\022\016\n\006amount\030\006 \001(\t\022" +
      "\013\n\003fee\030\007 \001(\t\022%\n\tdirection\030\010 \001(\0162\022.types." +
      "TxDirection\022\037\n\006status\030\t \001(\0162\017.types.TxSt" +
      "atus*%\n\010CoinCode\022\007\n\003BTC\020\000\022\007\n\003ETH\020\001\022\007\n\003SO" +
      "L\020\002*\032\n\005Order\022\007\n\003ASC\020\000\022\010\n\004DESC\020\001*>\n\010TxSta" +
      "tus\022\007\n\003NEW\020\000\022\016\n\nPROCESSING\020\001\022\r\n\tFINALIZE" +
      "D\020\002\022\n\n\006FAILED\020\003*/\n\013TxDirection\022\t\n\005INPUT\020" +
      "\000\022\n\n\006OUTPUT\020\001\022\t\n\005INOUT\020\002Bz\n&network.clus" +
      "terone.grpc.messages.typesP\001ZNgitlab.com" +
      "/pesdata/cluster/backend/bc-adapter/comm" +
      "on/interfaces/messages/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_types_Transaction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_types_Transaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_types_Transaction_descriptor,
        new java.lang.String[] { "TxHash", "CreatedAt", "BlockNum", "FromAddr", "ToAddr", "Amount", "Fee", "Direction", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
