// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/github/wenweihu86/raft/proto/raft.proto

package com.github.wenweihu86.raft.proto;

import com.github.wenweihu86.raft.Configuration;
import com.github.wenweihu86.raft.Server;
import com.github.wenweihu86.raft.proto.base.EntryType;
import com.github.wenweihu86.raft.proto.base.ResCode;
import com.github.wenweihu86.raft.proto.builder.EndpointOrBuilder;

public final class RaftProto {
  private RaftProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_Endpoint_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_Endpoint_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_Server_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_Server_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_Configuration_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_Configuration_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_LogMetaData_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_LogMetaData_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_SnapshotMetaData_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_SnapshotMetaData_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_LogEntry_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_LogEntry_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_VoteRequest_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_VoteRequest_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_VoteResponse_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_VoteResponse_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_AppendEntriesRequest_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_AppendEntriesRequest_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_AppendEntriesResponse_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_AppendEntriesResponse_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_InstallSnapshotRequest_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_InstallSnapshotRequest_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_InstallSnapshotResponse_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_InstallSnapshotResponse_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_GetLeaderRequest_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_GetLeaderRequest_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_GetLeaderResponse_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_GetLeaderResponse_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_AddPeersRequest_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_AddPeersRequest_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_AddPeersResponse_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_AddPeersResponse_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_RemovePeersRequest_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_RemovePeersRequest_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_RemovePeersResponse_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_RemovePeersResponse_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_GetConfigurationRequest_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_GetConfigurationRequest_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_GetConfigurationResponse_descriptor;
  public static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_raft_GetConfigurationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  public static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+com/github/wenweihu86/raft/proto/raft." +
      "proto\022\004raft\"&\n\010Endpoint\022\014\n\004host\030\001 \001(\t\022\014\n" +
      "\004port\030\002 \001(\r\"=\n\006Server\022\021\n\tserver_id\030\001 \001(\r" +
      "\022 \n\010endpoint\030\002 \001(\0132\016.raft.Endpoint\".\n\rCo" +
      "nfiguration\022\035\n\007servers\030\001 \003(\0132\014.raft.Serv" +
      "er\"e\n\013LogMetaData\022\024\n\014current_term\030\001 \001(\004\022" +
      "\021\n\tvoted_for\030\002 \001(\r\022\027\n\017first_log_index\030\003 " +
      "\001(\004\022\024\n\014commit_index\030\004 \001(\004\"w\n\020SnapshotMet" +
      "aData\022\033\n\023last_included_index\030\001 \001(\004\022\032\n\022la" +
      "st_included_term\030\002 \001(\004\022*\n\rconfiguration\030",
      "\003 \001(\0132\023.raft.Configuration\"T\n\010LogEntry\022\014" +
      "\n\004term\030\001 \001(\004\022\r\n\005index\030\002 \001(\004\022\035\n\004type\030\003 \001(" +
      "\0162\017.raft.EntryType\022\014\n\004data\030\004 \001(\014\"]\n\013Vote" +
      "Request\022\021\n\tserver_id\030\001 \001(\r\022\014\n\004term\030\002 \001(\004" +
      "\022\025\n\rlast_log_term\030\003 \001(\004\022\026\n\016last_log_inde" +
      "x\030\004 \001(\004\"-\n\014VoteResponse\022\014\n\004term\030\001 \001(\004\022\017\n" +
      "\007granted\030\002 \001(\010\"\235\001\n\024AppendEntriesRequest\022" +
      "\021\n\tserver_id\030\001 \001(\r\022\014\n\004term\030\002 \001(\004\022\026\n\016prev" +
      "_log_index\030\003 \001(\004\022\025\n\rprev_log_term\030\004 \001(\004\022" +
      "\024\n\014commit_index\030\005 \001(\004\022\037\n\007entries\030\006 \003(\0132\016",
      ".raft.LogEntry\"^\n\025AppendEntriesResponse\022" +
      "\037\n\010res_code\030\001 \001(\0162\r.raft.ResCode\022\014\n\004term" +
      "\030\002 \001(\004\022\026\n\016last_log_index\030\003 \001(\004\"\301\001\n\026Insta" +
      "llSnapshotRequest\022\021\n\tserver_id\030\001 \001(\r\022\014\n\004" +
      "term\030\002 \001(\004\0222\n\022snapshot_meta_data\030\003 \001(\0132\026" +
      ".raft.SnapshotMetaData\022\021\n\tfile_name\030\004 \001(" +
      "\t\022\016\n\006offset\030\005 \001(\004\022\014\n\004data\030\006 \001(\014\022\020\n\010is_fi" +
      "rst\030\007 \001(\010\022\017\n\007is_last\030\010 \001(\010\"H\n\027InstallSna" +
      "pshotResponse\022\037\n\010res_code\030\001 \001(\0162\r.raft.R" +
      "esCode\022\014\n\004term\030\002 \001(\004\"\022\n\020GetLeaderRequest",
      "\"e\n\021GetLeaderResponse\022\037\n\010res_code\030\001 \001(\0162" +
      "\r.raft.ResCode\022\017\n\007res_msg\030\002 \001(\t\022\036\n\006leade" +
      "r\030\003 \001(\0132\016.raft.Endpoint\"0\n\017AddPeersReque" +
      "st\022\035\n\007servers\030\001 \003(\0132\014.raft.Server\"D\n\020Add" +
      "PeersResponse\022\037\n\010res_code\030\001 \001(\0162\r.raft.R" +
      "esCode\022\017\n\007res_msg\030\002 \001(\t\"3\n\022RemovePeersRe" +
      "quest\022\035\n\007servers\030\001 \003(\0132\014.raft.Server\"G\n\023" +
      "RemovePeersResponse\022\037\n\010res_code\030\001 \001(\0162\r." +
      "raft.ResCode\022\017\n\007res_msg\030\002 \001(\t\"\031\n\027GetConf" +
      "igurationRequest\"\211\001\n\030GetConfigurationRes",
      "ponse\022\037\n\010res_code\030\001 \001(\0162\r.raft.ResCode\022\017" +
      "\n\007res_msg\030\002 \001(\t\022\034\n\006leader\030\003 \001(\0132\014.raft.S" +
      "erver\022\035\n\007servers\030\004 \003(\0132\014.raft.Server*K\n\007" +
      "ResCode\022\024\n\020RES_CODE_SUCCESS\020\000\022\021\n\rRES_COD" +
      "E_FAIL\020\001\022\027\n\023RES_CODE_NOT_LEADER\020\002*>\n\tEnt" +
      "ryType\022\023\n\017ENTRY_TYPE_DATA\020\000\022\034\n\030ENTRY_TYP" +
      "E_CONFIGURATION\020\001B-\n com.github.wenweihu" +
      "86.raft.protoB\tRaftProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_raft_Endpoint_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_raft_Endpoint_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_Endpoint_descriptor,
              new java.lang.String[] { "Host", "Port", });
          internal_static_raft_Server_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_raft_Server_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_Server_descriptor,
              new java.lang.String[] { "ServerId", "Endpoint", });
          internal_static_raft_Configuration_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_raft_Configuration_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_Configuration_descriptor,
              new java.lang.String[] { "Servers", });
          internal_static_raft_LogMetaData_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_raft_LogMetaData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_LogMetaData_descriptor,
              new java.lang.String[] { "CurrentTerm", "VotedFor", "FirstLogIndex", "CommitIndex", });
          internal_static_raft_SnapshotMetaData_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_raft_SnapshotMetaData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_SnapshotMetaData_descriptor,
              new java.lang.String[] { "LastIncludedIndex", "LastIncludedTerm", "Configuration", });
          internal_static_raft_LogEntry_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_raft_LogEntry_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_LogEntry_descriptor,
              new java.lang.String[] { "Term", "Index", "Type", "Data", });
          internal_static_raft_VoteRequest_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_raft_VoteRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_VoteRequest_descriptor,
              new java.lang.String[] { "ServerId", "Term", "LastLogTerm", "LastLogIndex", });
          internal_static_raft_VoteResponse_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_raft_VoteResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_VoteResponse_descriptor,
              new java.lang.String[] { "Term", "Granted", });
          internal_static_raft_AppendEntriesRequest_descriptor =
            getDescriptor().getMessageTypes().get(8);
          internal_static_raft_AppendEntriesRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_AppendEntriesRequest_descriptor,
              new java.lang.String[] { "ServerId", "Term", "PrevLogIndex", "PrevLogTerm", "CommitIndex", "Entries", });
          internal_static_raft_AppendEntriesResponse_descriptor =
            getDescriptor().getMessageTypes().get(9);
          internal_static_raft_AppendEntriesResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_AppendEntriesResponse_descriptor,
              new java.lang.String[] { "ResCode", "Term", "LastLogIndex", });
          internal_static_raft_InstallSnapshotRequest_descriptor =
            getDescriptor().getMessageTypes().get(10);
          internal_static_raft_InstallSnapshotRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_InstallSnapshotRequest_descriptor,
              new java.lang.String[] { "ServerId", "Term", "SnapshotMetaData", "FileName", "Offset", "Data", "IsFirst", "IsLast", });
          internal_static_raft_InstallSnapshotResponse_descriptor =
            getDescriptor().getMessageTypes().get(11);
          internal_static_raft_InstallSnapshotResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_InstallSnapshotResponse_descriptor,
              new java.lang.String[] { "ResCode", "Term", });
          internal_static_raft_GetLeaderRequest_descriptor =
            getDescriptor().getMessageTypes().get(12);
          internal_static_raft_GetLeaderRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_GetLeaderRequest_descriptor,
              new java.lang.String[] { });
          internal_static_raft_GetLeaderResponse_descriptor =
            getDescriptor().getMessageTypes().get(13);
          internal_static_raft_GetLeaderResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_GetLeaderResponse_descriptor,
              new java.lang.String[] { "ResCode", "ResMsg", "Leader", });
          internal_static_raft_AddPeersRequest_descriptor =
            getDescriptor().getMessageTypes().get(14);
          internal_static_raft_AddPeersRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_AddPeersRequest_descriptor,
              new java.lang.String[] { "Servers", });
          internal_static_raft_AddPeersResponse_descriptor =
            getDescriptor().getMessageTypes().get(15);
          internal_static_raft_AddPeersResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_AddPeersResponse_descriptor,
              new java.lang.String[] { "ResCode", "ResMsg", });
          internal_static_raft_RemovePeersRequest_descriptor =
            getDescriptor().getMessageTypes().get(16);
          internal_static_raft_RemovePeersRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_RemovePeersRequest_descriptor,
              new java.lang.String[] { "Servers", });
          internal_static_raft_RemovePeersResponse_descriptor =
            getDescriptor().getMessageTypes().get(17);
          internal_static_raft_RemovePeersResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_RemovePeersResponse_descriptor,
              new java.lang.String[] { "ResCode", "ResMsg", });
          internal_static_raft_GetConfigurationRequest_descriptor =
            getDescriptor().getMessageTypes().get(18);
          internal_static_raft_GetConfigurationRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_GetConfigurationRequest_descriptor,
              new java.lang.String[] { });
          internal_static_raft_GetConfigurationResponse_descriptor =
            getDescriptor().getMessageTypes().get(19);
          internal_static_raft_GetConfigurationResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_raft_GetConfigurationResponse_descriptor,
              new java.lang.String[] { "ResCode", "ResMsg", "Leader", "Servers", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
