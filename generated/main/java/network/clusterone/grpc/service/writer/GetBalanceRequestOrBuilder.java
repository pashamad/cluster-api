// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/writer/writer.proto

package network.clusterone.grpc.service.writer;

public interface GetBalanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:writer.GetBalanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.types.CoinCode symbol = 1;</code>
   * @return The enum numeric value on the wire for symbol.
   */
  int getSymbolValue();
  /**
   * <code>.types.CoinCode symbol = 1;</code>
   * @return The symbol.
   */
  network.clusterone.grpc.messages.types.CoinCode getSymbol();

  /**
   * <code>string address = 2;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 2;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();
}