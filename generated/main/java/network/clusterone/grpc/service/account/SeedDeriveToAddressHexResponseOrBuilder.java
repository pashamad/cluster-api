// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/account/account.proto

package network.clusterone.grpc.service.account;

public interface SeedDeriveToAddressHexResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:account.SeedDeriveToAddressHexResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string data = 1;</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <code>string data = 1;</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <code>.response.Status ret_status = 2;</code>
   * @return Whether the retStatus field is set.
   */
  boolean hasRetStatus();
  /**
   * <code>.response.Status ret_status = 2;</code>
   * @return The retStatus.
   */
  network.clusterone.grpc.messages.response.Status getRetStatus();
  /**
   * <code>.response.Status ret_status = 2;</code>
   */
  network.clusterone.grpc.messages.response.StatusOrBuilder getRetStatusOrBuilder();
}