package com.principles.clean.service;

public class AwsS3Service implements StorageService {

  @Override
  public void uploadDocumentToStorage(String fileName, byte[] data) throws Exception {
    System.out.println("Upload document in amazonS3 " + fileName + " " + "and size " + data.length);

  }

  @Override
  public void createBucket(String bucketName) throws Exception {
    System.out.println("Create bucket in amazonS3 with name " + bucketName);

  }

  @Override
  public void removeObject(String objectName) {
    System.out.println("Remove from amazonS3 document with name: " + objectName);

  }

  @Override
  public void copyObject(String objectName, String destPath) {
    System.out.println("Copy document " + objectName + " to " + destPath);
  }

  @Override
  public byte[] getObjectByPath(String path) {
    System.out.println("Get document from amazonS3 with path: " + path);
    return new byte[]{};
  }
}
