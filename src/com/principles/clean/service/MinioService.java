package com.principles.clean.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MinioService implements StorageService {

  @Override
  public void uploadDocumentToStorage(String fileName, byte[] data) throws Exception {
    System.out.println("Upload document in minio " + fileName + " " + "and size " + data.length);
  }

  @Override
  public void createBucket(String bucketName) throws Exception {
    System.out.println("Create bucket in minio with name " + bucketName);
  }

  @Override
  public void removeObject(String objectName) {
    System.out.println("Remove from minio document with name: " + objectName);
  }

  @Override
  public void copyObject(String objectName, String destPath) {
    System.out.println("Copy document " + objectName + " to " + destPath);
  }

  @Override
  public byte[] getObjectByPath(String path) {
    System.out.println("Get document from minio with path: " + path);
    return new byte[]{};
  }
}
