// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/writer/writer.proto

package network.clusterone.grpc;

public interface GetTxByHashResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:writer.GetTxByHashResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes data = 1;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>bool pending = 2;</code>
   * @return The pending.
   */
  boolean getPending();

  /**
   * <code>string error = 3;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 3;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
