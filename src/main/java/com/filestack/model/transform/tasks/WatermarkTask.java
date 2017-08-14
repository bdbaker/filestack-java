package com.filestack.model.transform.tasks;

import com.filestack.model.transform.base.ImageTransformTask;

public class WatermarkTask extends ImageTransformTask {

  // Constructor made private because this task cannot be used with default options
  private WatermarkTask() {
    super("watermark");
  }

  public static class Builder {
    private WatermarkTask watermarkTask;

    public Builder() {
      this.watermarkTask = new WatermarkTask();
    }

    public Builder file(String handle) {
      watermarkTask.addOption("file", handle);
      return this;
    }

    public Builder size(int size) {
      watermarkTask.addOption("size", size);
      return this;
    }

    public Builder position(String position) {
      watermarkTask.addOption("position", position);
      return this;
    }

    public Builder position(String first, String second) {
      watermarkTask.addOption("position", new String[] {first, second});
      return this;
    }

    public WatermarkTask build() {
      return watermarkTask;
    }
  }
}
