package com.principles.clean.service;

import com.principles.clean.domain.Document;

public interface DocumentService {
  void uploadDocument(Document document);

  void getDocumentByPath(Document document);

  void copyDocument(Document document);

  void deleteDocument(Document document);

}
