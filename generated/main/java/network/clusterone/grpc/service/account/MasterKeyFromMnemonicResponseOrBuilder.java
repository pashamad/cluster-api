// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/account/account.proto

package network.clusterone.grpc.service.account;

public interface MasterKeyFromMnemonicResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:account.MasterKeyFromMnemonicResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes master_key = 1;</code>
   * @return The masterKey.
   */
  com.google.protobuf.ByteString getMasterKey();

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