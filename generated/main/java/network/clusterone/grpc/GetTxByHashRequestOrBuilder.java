// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/writer/writer.proto

package network.clusterone.grpc;

public interface GetTxByHashRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:writer.GetTxByHashRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string symbol = 1;</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <code>string symbol = 1;</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <code>string tx_hash = 2;</code>
   * @return The txHash.
   */
  java.lang.String getTxHash();
  /**
   * <code>string tx_hash = 2;</code>
   * @return The bytes for txHash.
   */
  com.google.protobuf.ByteString
      getTxHashBytes();
}
