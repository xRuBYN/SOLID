package com.principles.clean.service;

import com.principles.clean.domain.Document;

public class DocumentServiceImpl implements DocumentService {

  private final StorageService storageService;

  public DocumentServiceImpl(StorageService storageService) {
    this.storageService = storageService;
  }

  public void uploadDocument(Document document) {
    try {
      storageService.uploadDocumentToStorage(document.getName(), document.getData());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public void getDocumentByPath(Document document) {
    storageService.getObjectByPath(document.getPath());
  }

  public void copyDocument(Document document) {
    storageService.copyObject(document.getName(), document.getPath());
  }

  public void deleteDocument(Document document) {
    storageService.removeObject(document.getName());
  }
}
