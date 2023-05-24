package com.principles.clean.service;

public interface StorageService {

  void uploadDocumentToStorage(String fileName, byte[] data) throws Exception;

  void createBucket(String bucketName) throws Exception;

  void removeObject(String objectName);

  void copyObject(String objectName, String destPath);

  byte[] getObjectByPath(String path);
}