// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/listener/listener.proto

package network.clusterone.grpc;

public interface TransactionsByAddressRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:listener.TransactionsByAddressRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>int32 from = 2;</code>
   * @return The from.
   */
  int getFrom();

  /**
   * <code>int32 limit = 3;</code>
   * @return The limit.
   */
  int getLimit();
}
