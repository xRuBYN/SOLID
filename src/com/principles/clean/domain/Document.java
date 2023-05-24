package com.principles.clean.domain;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Document extends AbstractEntity<UUID>{
  private UUID id;

  private String name;

  private String path;

  private byte[] data;

  public Document() {
  }

  public Document(String name, String path, byte[] data) {
    this.name = name;
    this.path = path;
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(id, document.id) && Objects.equals(name, document.name)
        && Objects.equals(path, document.path) && Arrays.equals(data,
        document.data);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(id, name, path);
    result = 31 * result + Arrays.hashCode(data);
    return result;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Document{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", path='" + path + '\'' +
        ", data=" + Arrays.toString(data) +
        '}';
  }
}
